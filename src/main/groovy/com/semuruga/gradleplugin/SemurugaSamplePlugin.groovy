package com.semuruga.gradleplugin

import org.gradle.api.*

class SemurugaSamplePlugin implements Plugin<Project> {

    def message = "Default message"
    void apply(Project project) {
        project.extensions.create('happy', HappyMessagePluginExtension)
    }
}

class HappyMessagePluginExtension {
    String message = "Default happy message"
}
