node {

   withCredentials([usernamePassword(credentialsId: 'stravauser', passwordVariable: 'strava_client_secret', usernameVariable: 'strava_client_id')]) {
          sh 'echo withCred $strava_client_id'
          sh 'export strava_client_id=$strava_client_id'
          sh 'export strava_client_secret=$strava_client_secret'
             sh 'echo Testing env'




   stage('Clone Repository') {
        // Get some code from a GitHub repository
        git 'https://github.com/JimvanB/strava.git'
   }

   stage('Build project') {

          withMaven(
               // Maven installation declared in the Jenkins "Global Tool Configuration"
               maven: 'M3',
               // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
               // Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
               mavenSettingsConfig: 'my-maven-settings',
               mavenLocalRepo: '.repository') {

             // Run the maven build
              sh 'printenv'
             sh "mvn package"

           } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs reports...
   }
   stage('Build image') {
           sh "docker build -t strava ./target/strava-0.0.1-SNAPSHOT.jar"
      }

   stage('Deploy Spring Boot Application') {
        sh "docker run --name strava -d -p 8080:8080 strava"
   }
}
}