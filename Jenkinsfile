node {
	stage('Checkout') {
		checkout scm
	}
    stage('Compile') {
    	try {
	    	def mvn_version = 'maven_3.3.9'
			withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
	  			bat "mvn clean compile"
			}
        }
        catch (exc) {
            echo 'Something failed, I should sound the klaxons!'
            throw exc;
        }
    }
}