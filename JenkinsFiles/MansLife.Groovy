@Library('unkokko') import Life

def life = new Life("morning","Chinese",true,200f);
life.jenkinsPipeline = this;
pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    script{
                        life.timeToMeet()
                    }
                }
            }
            stage('Eat') {
                steps {
                    script{
                        life.whatToEat()
                    }
                }
            }
            stage('Sex') {
                steps {
                    script{
                        life.wasItGood()
                    }
                }
            }
            stage('wiseMan') {
                steps {
                    script{
                        life.wiseMan()
                    }
                }
            }
        }
    }