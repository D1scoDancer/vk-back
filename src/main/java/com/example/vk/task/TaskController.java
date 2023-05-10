package com.example.vk.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/byType")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Task> getTasksByType(@RequestParam String type) {
        return taskService.getTasksByType(type);
    }

    // ======================= NOT USED =======================

    @PostMapping("/admin")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }
}
