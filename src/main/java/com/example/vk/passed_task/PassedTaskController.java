package com.example.vk.passed_task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passed-tasks")
public class PassedTaskController {

    private final PassedTaskService passedTaskService;

    public PassedTaskController(PassedTaskService passedTaskService) {
        this.passedTaskService = passedTaskService;
    }

    @PostMapping("")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<PassedTask> savePassedTask(@RequestBody PassedTask passedTask) {
        PassedTask savedPassedTask = passedTaskService.savePassedTask(passedTask);
        return new ResponseEntity<>(savedPassedTask, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<PassedTask>> getAllPassedTasks() {
        List<PassedTask> passedTasks = passedTaskService.getAllPassedTasks();
        return new ResponseEntity<>(passedTasks, HttpStatus.OK);
    }

    @GetMapping("/byUser")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<PassedTask>> getAllPassedTasksByUserId(@RequestParam Long userId) {
        List<PassedTask> passedTasks = passedTaskService.getAllPassedTasksByUserId(userId);
        return new ResponseEntity<>(passedTasks, HttpStatus.OK);
    }

    @GetMapping("/byUserType")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<PassedTask>> findAllByTaskType(@RequestParam String type,@RequestParam Long userId) {
        List<PassedTask> passedTasks = passedTaskService.findAllByTaskType(type, userId);
        return new ResponseEntity<>(passedTasks, HttpStatus.OK);
    }

    @GetMapping("/exists")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Boolean> existsPassedTaskByUserIdAndTaskId(@RequestParam Long userId, @RequestParam Long taskId) {
        Boolean exists = passedTaskService.existsPassedTaskByUserIdAndTaskId( userId, taskId);
        return new ResponseEntity<>(exists, HttpStatus.OK);
    }

    @GetMapping("/better")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Object[]>> getStats(@RequestParam String type) {
        List<Object[]> stats = passedTaskService.getCountByUserIdAndType(type);
        return new ResponseEntity<>(stats, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PassedTask> getPassedTaskById(@PathVariable Long id) {
        Optional<PassedTask> passedTask = passedTaskService.getPassedTaskById(id);
        return passedTask.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }




    // ======================= NOT USED =======================

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePassedTaskById(@PathVariable Long id) {
        passedTaskService.deletePassedTaskById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
