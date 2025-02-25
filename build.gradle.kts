plugins {
    id("java")
}

group = "com.aps"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.withType(JavaCompile::class.java) {
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    compileOnly("org.projectlombok:lombok:1.18.36")

}

tasks.test {
    useJUnitPlatform()
}