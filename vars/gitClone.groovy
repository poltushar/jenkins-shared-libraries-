def gitClone(String repoUrl, String branch ) {
    echo "Cloning repository: ${repoUrl}"
    // checkout([$class: 'GitSCM', 
    //           branches: [[name: "*/${branch}"]], 
    //           userRemoteConfigs: [[url: repoUrl]]])

   git url:"${repoUrl}", branch:"${branch}"
   echo "Code Cloning successful."
   
}
