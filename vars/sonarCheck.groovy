def call(){
    withSonarQubeEnv(credentialsId: 'sonar-pass'){
        sh 'mvn verify package sonar:sonar'
    }
}