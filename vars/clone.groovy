// def call(String url, String branch) {
//    echo "This is cloning the code"
//    // git url:"https://github.com/LondheShubham153/django-notes-app.git",branch:"main"
//    git url:"${url}",branch:"${branch}"
   
//    echo "Code Cloning Successful"
// }

def call(String repoUrl, String branch = 'main') {
    echo "Cloning repository: ${repoUrl}"
    checkout([$class: 'GitSCM', 
              branches: [[name: "*/${branch}"]], 
              userRemoteConfigs: [[url: repoUrl]]])
}
