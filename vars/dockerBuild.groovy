def call(String hubUser,String project,String imageTag){
    sh """
        docker image build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:${imageTag}
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}