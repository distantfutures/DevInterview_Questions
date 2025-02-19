buildscript {
    extra.apply {
        set("compose_version", "1.3.2")
        set("kotlin_version", "1.7.20")
        set("compileSdkVersion", 33)
        set("targetSdkVersion", rootProject.extra.get("compileSdkVersion") as Int)
        set("minSdkVersion", 25)
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.1.3" apply false
    id("com.android.library") version "7.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
