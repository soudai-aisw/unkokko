
def call(){
    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    echo "Hello World"
                }
            }
            stage('Eat') {
                steps {
                    echo "Man has to pay at first date."
                }
            }
            stage('Sex') {
                steps {
                    echo "Insert one's stick into one's hole."
                }
            }
            stage('wiseMan') {
                steps {
                echo "Can't help thinking why I slept with this ugly bitch."
                }
            }
        }
    }
}


