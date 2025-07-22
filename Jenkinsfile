pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'
    }

    environment {
        IMAGE_NAME = 'my-spring-boot-app'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Naresh617/DockerK8.git'
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