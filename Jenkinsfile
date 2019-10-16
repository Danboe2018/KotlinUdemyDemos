pipeline {
    agent {
        label 'android'
    }
    stages {
        stage('clean') {
            steps { 
                echo 'Cleaning..'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
