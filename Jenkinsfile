pipeline {
    agent any

    tools {
        maven 'M3' // Define this in Jenkins global tools config
    }

    environment {
        IMAGE_NAME = 'springboot-jenkins-docker'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-user/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                script {
                    docker.build("${IMAGE_NAME}:${env.BUILD_ID}")
                }
            }
        }

        stage('Run Docker Image') {
            steps {
                sh "docker run -d -p 8080:8080 ${IMAGE_NAME}:${env.BUILD_ID}"
            }
        }
    }
}
