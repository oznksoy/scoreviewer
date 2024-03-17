plugins {
    id("java")
    id("org.springframework.boot") version "3.2.3" apply false
    id("io.spring.dependency-management") version "1.1.4"
}

group = "com.oznksoy.football"
version = "1.0-SNAPSHOT"

val springBootVersion = "3.2.3"    // Spring boot version
val junitBOMVersion = "5.10.2"   // Collective junit project dependency alignments
val mockitoVersion = "5.11.0"   // Mockito juniper

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation(platform("org.junit:junit-bom:${junitBOMVersion}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation(platform("org.mockito:mockito-junit-jupiter:${mockitoVersion}"))
    testImplementation("org.mockito:mockito-junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}