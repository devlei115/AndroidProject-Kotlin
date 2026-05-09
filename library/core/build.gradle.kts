plugins {
    alias(libs.plugins.library)
}

android {
    namespace = "com.hjq.core"

    defaultConfig {
        // 模块混淆配置
        consumerProguardFiles("proguard-core.pro")
    }
}

//aar打包
apply(from = "aliyun-maven-push_gradle.gradle")