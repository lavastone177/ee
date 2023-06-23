plugins {
    id("java-library")
}

description = "Allay-API"

dependencies {
    api(libs.bundles.log4j.api)
    api(libs.network) {
        //use allay nbt
        exclude(group = "org.cloudburstmc", module = "nbt")
        //use it.unimi.dsi.fastutil
        exclude(group = "com.nukkitx.fastutil")
        exclude(group = "com.nukkitx", module = "natives")
    }
    api(libs.nbt)
    api(libs.fastutil)
    api(libs.guava)
    api(libs.gson)
    api(libs.snakeyaml)
    api(libs.annotations)
    api(libs.reflections)
    implementation(libs.libdeflate)
}