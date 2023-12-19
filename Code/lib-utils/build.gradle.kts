plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("maven-publish")
}

android {
    namespace = "com.istudio.lib_utils"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

 publishing {
    publications {
        create<MavenPublication>("release") {
            from(components.findByName("release"))

            //groupId = "io.github.devrath"
            groupId = "devrath"
            artifactId = "DroidUtilToolBox"
            version = "1.0.5"

            artifact("$buildDir/outputs/aar/${project.name}-release.aar")
        }
    }

   /* repositories {
        *//*maven {
            name = "Your Maven Repository"
            url = uri("https://your-maven-repository-url")
        }*//*
        maven("https://jitpack.io")
    }*/

     // Add the following block for configuring the repository
     repositories {
         maven {
             name = "jitpack"
             url = uri("https://jitpack.io")
         }
     }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    //implementation("androidx.startup:startup-runtime:1.1.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}