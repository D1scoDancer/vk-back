package com.example.vk.passed_task;

import com.example.vk.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassedTaskService {

    private final PassedTaskRepository passedTaskRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public PassedTaskService(PassedTaskRepository passedTaskRepository, TaskRepository taskRepository) {
        this.passedTaskRepository = passedTaskRepository;
        this.taskRepository = taskRepository;
    }

    public PassedTask savePassedTask(PassedTask passedTask) {
        return passedTaskRepository.save(passedTask);
    }

    public List<PassedTask> getAllPassedTasks() {
        return passedTaskRepository.findAll();
    }

    public Optional<PassedTask> getPassedTaskById(Long id) {
        return passedTaskRepository.findById(id);
    }

    public void deletePassedTaskById(Long id) {
        passedTaskRepository.deleteById(id);
    }

    public List<PassedTask> getAllPassedTasksByUserId(Long userId) {
        return passedTaskRepository.findAllByUserId(userId);
    }

    public List<PassedTask> findAllByTaskType(String type, Long userId) {
        return passedTaskRepository.findAllByTaskType(type, userId);
    }

    public boolean existsPassedTaskByUserIdAndTaskId(Long userId, Long taskId) {
        return passedTaskRepository.existsPassedTaskByUserIdAndTaskId(userId, taskId);
    }

    public List<Object[]> getCountByUserIdAndType(String type) {
        return passedTaskRepository.findCountByUserIdAndType(type);
    }
}

