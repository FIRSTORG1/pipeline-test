def maven_phase = "install"
node {
	def mvn_version = 'maven_3.3.9'
	stage('Checkout') {
		checkout([$class: 'GitSCM', branches: [[name: '*/dev']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'git_cred', url: 'https://github.com/hclvipin/pipeline-test']]])
	}
    stage('Clean') {
    	echo 'maven clean'
    	try {
			withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
	  			bat "mvn clean"
			}
        }
        catch (exc) {
            echo 'Something failed, I should sound the klaxons!'
            throw exc;
        }
    }
    
    stage('Compile') {
    	echo 'maven compile'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			bat "mvn compile"
		}
    }
    stage('Test') {
    	echo 'maven Test'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			bat "mvn test"
		}
    }
    stage('Install') {
    	echo 'maven Install'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			bat "mvn install"
		}
    }
    
}
