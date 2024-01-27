plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("org.jetbrains.compose")
    kotlin("plugin.serialization")
}

version = "1.0-SNAPSHOT"
val ktorVersion = extra["ktor.version"]

kotlin {
    android()
    jvm("desktop")
    ios()
    iosSimulatorArm64()

    js(IR) {
        browser()
    }

    macosX64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    macosArm64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    cocoapods {
        summary = "Shared code for the sample"
        homepage = "https://github.com/SEAbdulbasit/TravelApp-KMP"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-json:$ktorVersion")
                implementation("io.ktor:ktor-client-logging:$ktorVersion")
                implementation("io.ktor:ktor-client-serialization:$ktorVersion")
                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
                implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
                api("io.github.qdsfdhvh:image-loader:1.2.8")
//                api("io.github.qdsfdhvh:image-loader-extension-imageio:1.2.8")
            }
        }

        val androidMain by getting {
            dependencies {
                implementation("com.google.android.material:material:1.7.0")
            }
        }
        val iosMain by getting
        val iosTest by getting
        val iosSimulatorArm64Main by getting {
            dependsOn(iosMain)
        }
        val iosSimulatorArm64Test by getting {
            dependsOn(iosTest)
        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.common)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.6.4")
                implementation("io.ktor:ktor-client-cio:$ktorVersion")
            }
        }

        val jsMain by getting {
            dependencies {
                implementation("io.ktor:ktor-client-js:2.2.1")
                implementation("io.ktor:ktor-client-json-js:2.1.0")
                api("io.github.qdsfdhvh:image-loader:1.2.8")
//                api("io.github.qdsfdhvh:image-loader-extension-imageio:1.2.8")
            }
        }

        val macosMain by creating {
            dependsOn(commonMain)
        }
        val macosX64Main by getting {
            dependsOn(macosMain)
        }
        val macosArm64Main by getting {
            dependsOn(macosMain)
        }
    }
}

android {
    compileSdk = 34
    namespace = "com.example.travelapp_kmp"
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}