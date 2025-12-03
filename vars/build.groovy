def build(String Appname){
sh "docker build -t ${Appname} ."  
} 
