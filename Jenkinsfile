node {

   stage('Clone Repository') {
        // Get some code from a GitHub repository
        git 'https://github.com/JimvanB/strava.git'
   }

   stage('Build project') {
        sh "mvn package"
   }

   stage('Build image') {
           sh "docker build -t strava ./target/strava-0.0.1-SNAPSHOT.jar"
      }

   stage('Deploy Spring Boot Application') {
        sh "docker run --name strava -d -p 8080:8080 strava"
   }

}