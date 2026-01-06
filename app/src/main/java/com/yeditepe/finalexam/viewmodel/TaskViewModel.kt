package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

    val task1 : Task? by rememberSaveable {mutableStateOf(null)}
    val task2 : Task? by rememberSaveable {mutableStateOf(null)}

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
    }
}
