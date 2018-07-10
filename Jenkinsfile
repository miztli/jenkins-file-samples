// Declarative syntax
pipeline {
  agent any
  
  stages {
    stage('Build') {
      steps {
        echo 'Building app...'
        // Access env variables
        echo "Running build no. ${env.BUILD_ID} on ${env.JENKINS_URL}"
      }
    }
    stage('Test') {
      steps {
        echo 'Testing app...'
      }
    }
    stage('DockerImage') {
      steps {
        echo 'Building docker image...'  
      }
    }
    stage('ImageRegistry') {
      steps {
        echo 'Pushing image to registry...'
      } 
    }
    stage('Deploy') {
      steps {
        echo 'Deploying app...'
      }
    }
  }
}
