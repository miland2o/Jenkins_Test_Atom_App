pipeline {
    agent any
    tools {
        maven 'maven_3_6_3'
    }
    environment {
        MY_NAME = 'Milan'
    }
    stages {
        stage('Build') {
            steps {
                echo "Building phase"
                echo "Workspace directory: ${WORKSPACE}"
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo "Test phase"
            }
        }

        stage('Docker-build') {
            steps {
                echo "Docker-build phase"
                sh "docker build -f Dockerfile -t docker-jenkins-test ."
            }
        }
    }
}