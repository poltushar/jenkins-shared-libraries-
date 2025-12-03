def call(String appName, String tagName) {
    sh "docker build -t ${appName}:${tagName} ."
}

