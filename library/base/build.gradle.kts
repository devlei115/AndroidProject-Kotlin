plugins {
    alias(libs.plugins.library)
}

android {
    namespace = "com.hjq.base"
}

dependencies {
    implementation(project(":library:core"))
}

//aar打包
apply(from = "aliyun-maven-push_gradle.gradle")