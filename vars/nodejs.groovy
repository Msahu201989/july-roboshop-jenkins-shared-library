def call () {
    pipeline {

        agent {
            node { label 'Workstation' }
        }

        stages {

            stage ('code quality') {
                steps {
                    echo 'code quality'
                }
            }

            stage ('Style checks') {
                when {
                    branch 'demo'
                }
                steps {
                    echo 'style checks'
                }
            }

            stage ('unit Tests') {
                when {
                    branch 'demo'
                }
                steps {
                    echo 'Unit Test'
                }
            }

            stage ('Download dependencies') {
                when { tag "*" }
                steps {
                    echo 'Download Dependencies'
                }
            }

            stage ('Prepare Artifact') {
                when { tag "*" }
                steps {
                    echo 'Prepare Artifact'
                }
            }

            stage ('Publish Artifact') {
                when { tag "*" }
                steps {
                    echo 'Publish Artifact'
                }
            }
        }
    }
}










// @Library('roboshop') _
//
// env.COMPONENT="cart"
// nodejs()
