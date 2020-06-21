
def createAppStack(envVars){

  String command="ansible-playbook -i localhost --tags 'create'  --vault-password-file ~/.vaultPassword  cloudFormationOperations.yml"
  this.executeInShell(command,envVars)
}
def appSetup(envVars){

  String command=" ansible-playbook  -i ./inventory/creds.sh --vault-password-file ~/.vaultPassword setupApp.yml"
  this.executeInShell(command,envVars)
}
def executeInShell(command, envVars){

	if(command == null || command.length() < 1){
		throw new Exception("executeInShell:: Invalid command!");
	}

	println "\n\n**##****##****##****##****##****##****##****##****##****##****##****##****##****##****##**"
	println "executeInShell::command => ${command}"


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
