@file:Suppress("OPT_IN_USAGE")

import com.codingfeline.buildkonfig.compiler.FieldSpec.Type
import com.codingfeline.buildkonfig.gradle.BuildKonfigExtension
import org.jetbrains.kotlin.konan.properties.Properties


plugins {
    kotlin("native.cocoapods")
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinxSerialization)
    id("com.android.library")
    id("com.codingfeline.buildkonfig") version "+"
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
                implementation(compose.material3)
                implementation(compose.runtime)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)

                //ktor-client
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.json)
                implementation(libs.ktor.client.logging)
                implementation(libs.ktor.client.serialization)
                implementation(libs.ktor.serialization.kotlinx.json)
                implementation(libs.ktor.client.content.negotiation)
                implementation(libs.kotlinx.serialization.json)
                implementation(libs.kotlinx.datetime)

                implementation(libs.coil.compose)
                implementation(libs.coil.network.ktor)

                //compose navigation
                implementation(libs.navigation.compose)
            }
        }

        androidMain {
            dependencies {
                implementation(libs.material)
                implementation(libs.ktor.client.okhttp)
            }
        }

        iosMain {
            dependencies {
                implementation(libs.ktor.client.darwin)
            }
        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.common)
                implementation(libs.ktor.client.java)
                implementation(libs.kotlinx.coroutines.swing)
            }
        }

        jsMain {
            dependencies {
                implementation(libs.ktor.client.js)
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

@Suppress("TooGenericExceptionCaught")
configure<BuildKonfigExtension> {
    packageName = "com.example.travelapp_kmp"
    val properties = Properties()

    val rootProjectDir = project.rootProject.rootDir
    val secretProperties = File(rootProjectDir, "secret.properties")
    if (secretProperties.exists()) {
        properties.load(secretProperties.inputStream())
    }

//    val apiKey = properties.getProperty("WEATHER_API_KEY") ?: System.getenv("WEATHER_API_KEY")

    defaultConfigs {
        buildConfigField(
            Type.STRING,
            "WEATHER_API_KEY",
            "90d78fc11f04c530a4e6f6c01cbb66e5"
        )
    }
}

