package com.github.blackhuman.intellijconsolelog.services

import com.intellij.openapi.project.Project
import com.github.blackhuman.intellijconsolelog.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
