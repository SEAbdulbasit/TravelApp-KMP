@file:Suppress("OPT_IN_USAGE")

plugins {
    kotlin("native.cocoapods")
    id("com.android.library")
    id("org.jetbrains.compose")
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

version = "1.0"

kotlin {
    androidTarget()
    jvm("desktop")
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    js(IR) {
        browser()
    }

    wasmJs {
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
        commonMain {
            dependencies {
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
            }
        }

        androidMain {
            dependencies {
                implementation("com.google.android.material:material:1.11.0")
            }
        }

        iosMain {

        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.common)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.7.3")
            }
        }

        jsMain {
            dependencies {
            }
        }

    }
}

android {
    compileSdk = 34
    namespace = "com.example.travelapp_kmp"
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
}

compose {
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=1.9.20")
}