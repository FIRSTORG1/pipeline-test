def maven_phase = "install"
node(maven_phase == "compile") {
	def mvn_version = 'maven_3.3.9'
	stage('Checkout') {
		checkout scm
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
    
    stage('Install') {
    	echo 'maven Install'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			bat "mvn install"
		}
    }
    
}