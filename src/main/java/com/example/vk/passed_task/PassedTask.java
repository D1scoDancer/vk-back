package com.example.vk.passed_task;

import com.example.vk.task.Task;
import com.example.vk.user.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "passed_tasks",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "task_id"}))
public class PassedTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Column(name = "datetime")
    private LocalDateTime datetime;

    public PassedTask(Long id, User user, Task task, LocalDateTime datetime) {
        this.id = id;
        this.user = user;
        this.task = task;
        this.datetime = datetime;
    }

    public PassedTask(User user, Task task, LocalDateTime datetime) {
        this.user = user;
        this.task = task;
        this.datetime = datetime;
    }

    public PassedTask(User user, Task task) {
        this.user = user;
        this.task = task;
    }

    public PassedTask() {
    }

    @PrePersist
    public void setDatetime() {
        this.datetime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
}