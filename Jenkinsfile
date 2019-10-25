node{
     stage('one') {
        echo ('gh') 
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
}
