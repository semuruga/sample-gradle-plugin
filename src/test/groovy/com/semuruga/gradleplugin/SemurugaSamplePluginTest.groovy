package com.semuruga.gradleplugin

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

import org.testng.annotations.*

class SemurugaSamplePluginTest {

    @Test
    public void semurugaSamplePluginTestToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply("com.semuruga.gradleplugin.sample-semuruga-plugin")
        project.happy.message = "Happy"
        assert project.happy.message == "Happy"
    }

}
