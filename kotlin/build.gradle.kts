import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("org.jlleitschuh.gradle.ktlint") version "10.3.0"
}

group = "atcoder"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
    kotlinOptions.suppressWarnings = false
}

application {
    mainClass.set("MainKt")
}

task<Exec>("ojTest") {
    dependsOn("shadowJar")
    commandLine("oj", "t", "-d", "tests", "-c", "\"java -jar build\\libs\\atcoder-1.0-SNAPSHOT-all.jar\"")
}
