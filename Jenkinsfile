pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                sh 'cd /home/lxu/FizzBuzz; ./gradlew clean build'
           }
        }
        stage('Unit Tests') {
            steps {
                script {
                    try {
                        sh 'cd /home/lxu/FizzBuzz; ./gradlew clean test --no-daemon' //run a gradle task
                    } finally {
                        junit '**/build/test-results/test/*.xml' //make the junit test results available in any case (success & failure)
                    }
                }
            // jacoco(exclusionPattern: "**/src/test/**")
            }
        }
        stage('Publish Test Coverage Report') {
         steps {
           step([$class: 'JacocoPublisher', 
                execPattern: '**/build/jacoco/*.exec',
                classPattern: '**/build/classes',
                sourcePattern: 'src/main/java',
                exclusionPattern: 'src/test*'
                ])
            }
        }
    }
}

