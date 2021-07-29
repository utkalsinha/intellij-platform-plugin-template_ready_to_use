package com.github.utkalsinha.intellijplatformplugintemplatereadytouse.services

import com.github.utkalsinha.intellijplatformplugintemplatereadytouse.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
