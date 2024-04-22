package com.example.trello.service;

import com.example.trello.model.Tasks;
import com.example.trello.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }

    public Tasks getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void addTask(Tasks task) {
        taskRepository.save(task);
    }

    public List<Tasks> getAllTaskByFolderId(Long folderId) {
        return taskRepository.findAllByFolderId(folderId);
    }
}
