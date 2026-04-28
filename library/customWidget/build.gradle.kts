plugins {
    alias(libs.plugins.library)
}

android {
    namespace = "com.hjq.custom.widget"
}

dependencies {
    implementation(project(":library:core"))
    implementation(project(":library:smallestWidth"))
}

//aar打包
apply(from = "aliyun-maven-push_gradle.gradle")