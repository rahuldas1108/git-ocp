node{
     stage('one') {
        echo ('one') 
      }
     stage('git checkout')
		{
		checkout scm
		}
     stage('build') {
           def mvnhome
            mvnhome=tool 'maven 3.6.2'
           sh "'${mvnhome}/bin/mvn' package"
}
     stage('deploy') {
	  
         sh 'cp target/JenkinsWar.war /var/lib/tomcat7/webapps/'
}
}
