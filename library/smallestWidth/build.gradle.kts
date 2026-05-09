plugins {
    alias(libs.plugins.library)
}

android {
    namespace = "com.hjq.smallest.width"
}

//aar打包
apply(from = "aliyun-maven-push_gradle.gradle")