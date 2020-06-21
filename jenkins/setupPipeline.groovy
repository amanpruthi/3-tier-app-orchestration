#!/usr/bin/env groovy
node {
  def commonFunctions = load "${WORKSPACE}@script/jenkins/commonFunctions.groovy"
  stage "CloudformationCreateAppStack"
    commonFunctions.createAppStack(env)
  stage "appSetup"
    commonFunctions.appSetup(env)
}
