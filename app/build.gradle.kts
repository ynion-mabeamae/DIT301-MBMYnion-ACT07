plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.example.advanceduinavapp"
  compileSdk = 36

  defaultConfig {
    applicationId = "com.example.advanceduinavapp"
    minSdk = 24
    targetSdk = 36
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
  kotlinOptions {
    jvmTarget = "11"
  }
}

dependencies {

  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.appcompat)
  implementation(libs.material)
  implementation(libs.androidx.activity)
  implementation(libs.androidx.constraintlayout)
  implementation(libs.androidx.navigation.fragment)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
  implementation("com.google.android.material:material:1.10.0")

  // Navigation Component
  implementation("androidx.navigation:navigation-fragment-ktx:2.7.4")
  implementation("androidx.navigation:navigation-ui-ktx:2.7.4")

  // ViewPager2
  implementation("androidx.viewpager2:viewpager2:1.0.0")

  // Lifecycle
  implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
}