pipeline {
    agent any
	tools { 
        maven 'maven_3.3.9' 
        jdk 'JDK_8' 
    }
    stages {
       stage ('Initialize') {
            steps {
	            echo "PATH = ${PATH}"
	            echo "M2_HOME = ${M2_HOME}"
            }
        }
        stage('Build') {
            steps {
               mvn clean compile install
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}