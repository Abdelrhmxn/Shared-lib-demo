def call(){
 pipeline {
    agent { label 'Worker' }

    stages {
        stage('install nginx') {
            steps {
                sh "sudo apt install nginx"
            }
        }
    }
} 
}

