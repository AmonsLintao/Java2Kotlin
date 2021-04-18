import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.4.31"
    kotlin("plugin.spring") version "1.4.31"
    id("org.sonarqube") version "2.7"
    id("jacoco")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

jacoco {
    toolVersion = "0.8.6"
}

sonarqube {
    properties {
        property("sonar.projectKey", "javatokotlin")
        property("sonar.projectName", "javatokotlin")
        property("sonar.java.binaries", "build/classes/kotlin/main")
        property("sonar.coverage.jacoco.xmlReportPaths", "build/reports/coverage")
    }
}


repositories {
    maven { url = uri("https://maven.aliyun.com/repository/jcenter") }
    maven { url = uri("https://maven.aliyun.com/repository/google") }
    maven { url = uri("https://maven.aliyun.com/repository/central") }
    maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
        // TODO exclude it after replace with spring-mockk
        // exclude(group = "org.mockito")
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }

    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("io.mockk:mockk:1.10.6")
    testImplementation("org.assertj:assertj-core:3.19.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
