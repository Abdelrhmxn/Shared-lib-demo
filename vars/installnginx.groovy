def call(){
 pipeline {
    agent { label 'Worker' }

    stages {
        stage('install nginx') {
            steps {
                sh "sudo apt install nginx"
            }
        }
        stage('start nginx') {
            steps {
                sh "sudo systemctl start nginx"
            }
        }
        stage('test nginx') {
            steps {
                sh "curl localhost"
            }
        }
    }
} 
}

