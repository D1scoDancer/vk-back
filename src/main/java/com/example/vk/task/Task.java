package com.example.vk.task;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "short_description", nullable = false)
    private String short_description;

    @Column(name = "datetime")
    private LocalDateTime datetime;

    @PrePersist
    public void setDatetime() {
        this.datetime = LocalDateTime.now();
    }

    public Task(Long id, String type, String name, String short_description, LocalDateTime datetime) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.short_description = short_description;
        this.datetime = datetime;
    }

    public Task(String type, String name, String short_description) {
        this.type = type;
        this.name = name;
        this.short_description = short_description;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
}
