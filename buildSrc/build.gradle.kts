plugins {
    id("java-gradle-plugin")
}

dependencies {
    implementation(gradleApi())
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
