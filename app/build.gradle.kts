plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.e_commerce"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.e_commerce"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 34
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    /* For Rounded Image View */
    implementation (libs.roundedimageview)
    implementation(libs.glide)
    annotationProcessor(libs.compiler)
    implementation(libs.materialsearchbar)

    /* For Slider - Start */
    // Material Components for Android. Replace the version with the latest version of Material Components library.
    implementation(libs.material)
    // Circle Indicator (To fix the xml preview "Missing classes" error)
    implementation(libs.circleindicator)
    implementation(libs.whynotimagecarousel)
    /* For Slider - End */

    implementation(libs.volley)

    implementation(libs.tinycart)
    implementation(libs.android.advancedwebview)

}