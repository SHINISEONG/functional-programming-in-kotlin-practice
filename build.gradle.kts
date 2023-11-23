plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "practice.kotlin.in.programming.functional"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.8.0")
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.8.0")
    implementation("io.kotest:kotest-property-jvm:5.8.0")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}