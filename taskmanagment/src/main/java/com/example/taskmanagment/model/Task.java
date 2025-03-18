package com.example.taskmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDateTime deadline;
    private String priority; // Например, HIGH, MEDIUM, LOW
    private String status; // Например, TODO, IN_PROGRESS, DONE

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User assignedUser; // Задача назначена на пользователя
}