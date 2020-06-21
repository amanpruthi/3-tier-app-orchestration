


def executeInShell(command, envVars){

	if(command == null || command.length() < 1){
		throw new Exception("executeInShell:: Invalid command!");
	}

	println "\n\n**##****##****##****##****##****##****##****##****##****##****##****##****##****##****##**"
	println "executeInShell::command => ${command}"

	if(dryRun){
		return null;
	}

	lib_dir = envVars.WORKSPACE;
	if(envVars.WORKSPACE_LIB != null){
		lib_dir = envVars.WORKSPACE_LIB;
	}

    sh """#!/usr/bin/env bash

	source ~/.profile
	cd ${lib_dir}@script/plays

	${command}

	"""
}


return this
