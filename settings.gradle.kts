rootProject.name = "ktor-vue"

include(":web", ":vue-app")
project(":vue-app").projectDir = file("vue-app")
