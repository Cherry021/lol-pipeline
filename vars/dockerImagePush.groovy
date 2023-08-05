def call(String hubUser, String imageName, String imageTag){
    withCredentials([usernamePassword(credentialsId: 'docker-pass', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh """
            docker image push ${hubUser}/${imageName}:${imageTag} 
        """
    }

}