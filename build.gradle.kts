repositories {
    mavenCentral()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
    mavenLocal()
}

group = "cn.allay"
description = "The next generation minecraft server software"

plugins {
    `kotlin-dsl`
    idea
    id("com.github.johnrengelman.shadow") version ("8.1.1")
}

//Do not build this root project, this is only used as a control submodule
tasks.forEach {
    it.enabled = false
}

idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}

//Enable gradle wrapper update task
tasks.wrapper {
    enabled = true
    gradleVersion = "8.3"
}

tasks.clean {
    enabled = true
    delete("logs", "cache", "output")
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "maven-publish")
    apply(plugin = "com.github.johnrengelman.shadow")

    java.sourceCompatibility = JavaVersion.VERSION_20
    java.targetCompatibility = JavaVersion.VERSION_20

    repositories {
        mavenCentral()
        maven {
            url = uri("https://repo.opencollab.dev/maven-releases/")
        }
        maven {
            url = uri("https://repo.opencollab.dev/maven-snapshots/")
        }
        maven {
            url = uri("https://www.jitpack.io/")
        }
        mavenLocal()
    }

    dependencies {
        testImplementation(rootProject.libs.bundles.test)

        compileOnly(rootProject.libs.lombok)
        annotationProcessor(rootProject.libs.lombok)

        testCompileOnly(rootProject.libs.lombok)
        testAnnotationProcessor(rootProject.libs.lombok)
    }

    java {
        withJavadocJar()
        withSourcesJar()
    }

    tasks.build {
        dependsOn("shadowJar")
    }

    //disable
    tasks.assemble {
        group = ""
        enabled = false
    }

    tasks.test {
        useJUnitPlatform()
        jvmArgs = listOf("--enable-preview")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.add("--enable-preview")
    }

    tasks.withType<Copy> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    tasks.withType<Javadoc> {
        options.encoding = "UTF-8"
        val javadocOptions = options as CoreJavadocOptions
        javadocOptions.addStringOption("source", "20")
        javadocOptions.addBooleanOption("-enable-preview", true)
        //Suppress some meaningless warnings
        javadocOptions.addStringOption("Xdoclint:none", "-quiet")
    }
}
