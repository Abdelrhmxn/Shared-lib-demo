def call(){
 pipeline {
    agent { label 'Worker' }

    stages {
        stage('install nginx') {
            steps {
                sh "apt install nginx"
            }
        }
    }
} 
}
