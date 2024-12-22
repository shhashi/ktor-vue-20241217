plugins {
    id("com.github.node-gradle.node") version "3.5.1"
}

node {
    version = "22.12.0"
    npmVersion = "10.9.0"
    download = true
    nodeProjectDir = file("vue-app")
}
