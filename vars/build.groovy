def dockerBuild(String Appname,String tagName) {
sh "docker build -t ${Appname}:${tagName} ."  
} 
