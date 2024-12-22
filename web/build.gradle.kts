import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin.Companion.kotlinNodeJsEnvSpec

plugins {
    application
    kotlin("jvm") version "2.1.0"
    id("com.github.node-gradle.node") version "3.5.1"

    // 依存関係にあるライブラリを含んだ fat jar を作成するために必要
//    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "shhashi.service.diary.database.elasticsearch.templates"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass.set("shhashi.service.diary.database.elasticsearch.templates.DairyServiceElasticsearchTemplatesMaintenanceApplication.kt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("reflect"))
    implementation("co.elastic.clients:elasticsearch-java:8.16.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
