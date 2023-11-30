pipeline {
    agent any

    stages {
        stage('Preparación') {
            steps {
                // Clonar el código del repositorio remoto
                git url: 'https://github.com/cristian1925/CtaCorriente.git', branch: 'master'
            }
        }

        stage('Construcción') {
            steps {
                // Comando para construir tu proyecto (por ejemplo, con Maven)
                sh 'mvn clean package'
            }
        }

        stage('Pruebas') {
            steps {
                // Ejecutar pruebas y guardar los resultados
                sh 'mvn test'
                junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
    }
}
