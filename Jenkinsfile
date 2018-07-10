// Declarative syntax
pipeline {
  agent any
  
  stages {
    stage('Build') {
      steps {
        echo 'Building app...'
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
