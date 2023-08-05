def call(){
    checkout([
        $class: 'GitSCM', 
            branches: [[name: 'main']], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[ url: 'https://github.com/Cherry021/customer.git']]

    ])
}