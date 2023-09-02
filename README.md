# ci-concepts-practice
Simple project for Jenkins CI/CD

## Preparation for running the project
1. Install IntelliJ or any IDE with Maven support.
2. Install Java SDK 17.
3. Clone this project.
4. Run the project using the IDE.

## Jenkins Script used for the Pipeline
```
pipeline {
    agent {
        label "windows"
    }
    
    parameters {
        text (name: 'OS', defaultValue:'Windows_NT', description:'Operative System')
        text (name: 'COMPUTERNAME', defaultValue:'CO-IT015626', description:'Name of the computer')
        text (name: 'USERDOMAIN', defaultValue:'GLOBANT', description:'Domain of all users')
        text (name: 'USERNAME', defaultValue:'alejandro.fonseca', description:'Username of the computer')


    }

    stages {
        stage('Cloning') {
            steps {
                git(url: 'https://github.com/alejandroFonsecaGlobant/ci-concepts-practice', branch: 'main')
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Execute') {
            steps {
                bat 'java -jar target\\ci-concepts-practice-1.0-SNAPSHOT.jar'
            }
        }
    }
}
```
## Screenshots
### Stage View
![Stage View](https://github.com/alejandroFonsecaGlobant/ci-concepts-practice/blob/main/images/Staging.png)
### Log of last build
![Log](https://github.com/alejandroFonsecaGlobant/ci-concepts-practice/blob/main/images/Log.png)

