import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    application

    id("io.gitlab.arturbosch.detekt") version "1.19.0"
}

group = "app.gouvinb"
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
}

application {
    mainClass.set("MainKt")
}

tasks.withType<Detekt> {
    reports {
        html.required.set(true)
        html.outputLocation.set(file("build/reports/detekt.html"))

        xml.required.set(false)
        txt.required.set(false)
        sarif.required.set(false)
    }
}

detekt {
    source = files("src/main/java", "src/test/java", "src/main/kotlin", "src/test/kotlin")
    parallel = true

    // Define the detekt configuration(s) you want to use.
    // Defaults to the default detekt configuration.
    // config = files("path/to/config.yml")

    // Specifying a baseline file. All findings stored in this file in subsequent runs of detekt.
    // baseline = file("path/to/baseline.xml")
}