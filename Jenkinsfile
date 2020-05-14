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
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo "Test phase"
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deployment phase"
                sh 'mvn package'
             }
         }
    }
}