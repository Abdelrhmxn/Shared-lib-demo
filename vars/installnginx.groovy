
def call()  {
  pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'BUILD'
            }
        }
        stage('TEST') {
            steps {
                echo 'TEST'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy
            }
        }        
    }
}
}
  
