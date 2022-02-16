package com.ensolvers.todolistrestapi.service;

import com.ensolvers.todolistrestapi.dao.TaskRepository;
import com.ensolvers.todolistrestapi.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task create(Task task) {
        Task createdTask = taskRepository.save(task);
        return createdTask;
    }

    public void delete(long id) {
        taskRepository.deleteById(id);
    }

    public void update(Task task) {
        taskRepository.save(task);
    }

    public List<Task> listAll() {
        return taskRepository.findAll();
    }

}
