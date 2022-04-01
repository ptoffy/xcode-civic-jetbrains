package com.github.ptoffy.intellijcivicxcodetheme.services

import com.intellij.openapi.project.Project
import com.github.ptoffy.intellijcivicxcodetheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
