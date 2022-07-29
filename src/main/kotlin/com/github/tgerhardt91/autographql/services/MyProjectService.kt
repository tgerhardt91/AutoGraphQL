package com.github.tgerhardt91.autographql.services

import com.intellij.openapi.project.Project
import com.github.tgerhardt91.autographql.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
