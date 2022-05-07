import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.7"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    var kotlinVersion = "1.6.21"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion
    //kapt annotation processing for kotlin : JVM을 기동시킬 때 Kotlin의 어노테이션을 포함함
    kotlin("kapt") version kotlinVersion
    //lazy loading을 동작을 하려면 final 클래스가 아니라 open이여야 함 -> 모든 Entity에 open을 해줌
    kotlin("plugin.allopen") version kotlinVersion


}

group = "com.funnc"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    //querydsl
    implementation("com.querydsl:querydsl-jpa")
    kapt(group = "com.querydsl", name = "querydsl-apt", classifier = "jpa")
    sourceSets.main {
        withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class) {
            kotlin.srcDir("$buildDir/generated/source/kapt/main")
        }
    }
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
