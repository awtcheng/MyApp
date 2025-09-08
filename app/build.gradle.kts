import kotlin.collections.listOf

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.yradmin.myapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.yradmin.myapp"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(fileTree(mapOf(
        "dir" to "libs",
        "include" to listOf("*.aar", "*.jar"),
    )))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("com.kongzue.dialogx:DialogX:0.0.49")
    implementation("androidx.work:work-runtime-ktx:2.8.1")
    implementation("androidx.core:core:1.6.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation("com.daimajia.numberprogressbar:library:1.4@aar")

    //implementation fileTree(dir: 'libs', include: ['*.jar'])
    //implementation files('libs/poi-3.12-android-a.jar')
    //implementation files('libs/poi-ooxml-schemas-3.12-20150511-a.jar')
}