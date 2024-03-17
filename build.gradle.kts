plugins {
    id("java")
    id("org.springframework.boot") version "3.2.3" apply false
    id("io.spring.dependency-management") version "1.1.4"
    id("io.freefair.lombok") version "8.6"
}

val springBootVersion = "3.2.3"    // Spring boot version
val junitBOMVersion = "5.10.2"     // Collective junit project dependency alignments
val mockitoVersion = "5.11.0"      // Mockito juniper
val lombokVersion = "1.18.30"      // Lombok version

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects{

    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "io.freefair.lombok")

    dependencies {

        implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
        implementation("org.springframework.boot:spring-boot-starter-web")

        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation(platform("org.junit:junit-bom:${junitBOMVersion}"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        testImplementation(platform("org.mockito:mockito-junit-jupiter:${mockitoVersion}"))
        testImplementation("org.mockito:mockito-junit-jupiter")

    }

    tasks.test {
        useJUnitPlatform()
    }

}



