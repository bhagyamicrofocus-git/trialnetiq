pipeline {
    agent any

    tools {
        maven "mvn"
    }

    stages {
        stage('Test') {
            steps {
                git 'https://github.com/bhagyamicrofocus-git/trialnetiq.git'
                sh "mvn clean test -Dsurefire.suiteXmlFiles=netiqtest.xml"
            }
        }
    }
}