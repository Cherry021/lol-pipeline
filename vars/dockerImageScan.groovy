def call(String hubUser, String imageName, String imageTag){
    sh """
        trivy image ${hubUser}/${imageName}:${imageTag} >> scan.txt
        cat scan.txt
    """
}