pipeline 
{
    agent any
    
    tools{
    	maven 'maven'
        }
        
        stage("Deploy to QA"){
            steps{
                echo("deploy to qa")
            }
        }
                
        stage('Regression Automation Test') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    git 'https://github.com/bhagyamicrofocus-git/trialnetiq'
                    sh "mvn clean test -Dsurefire.suiteXmlFiles=netiqtest.xml"
                    
                }
            }
        }
}