pipeline {
    agent any

   

    environment {
        IMAGE_NAME = 'my-spring-boot-app'
    }

    stages {
        stage('Checkout') {
           steps {
                git url: 'https://github.com/Naresh617/DockerK8.git',
                    branch: 'main',
                    credentialsId: 'ac061f6e-5461-42b3-b0c0-5d89e29457ef'
            }
        }

        stage('Build JAR') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }
        
        stage('Run Application') {
            steps {
                bat 'start java -jar target\\*.jar'
            }
        }

        
    }
}