plugins {
	kotlin("jvm") version "2.3.21"
	id("com.google.devtools.ksp") version "2.3.7"
}

group = "kr.raaaaming"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
	maven("https://repo.papermc.io/repository/maven-public/")
	maven("https://repo.acda.kr/repository/maven-snapshots/")
}

dependencies {
	testImplementation(kotlin("test"))
	compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")

	compileOnly("kr.acda.arccore:arc-core:1.0.0-SNAPSHOT")
	ksp("kr.acda.arccore:arc-ksp:1.0.0-SNAPSHOT")
}

kotlin {
	jvmToolchain(21)
}

tasks.test {
	useJUnitPlatform()
}