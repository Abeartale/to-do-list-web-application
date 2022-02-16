package com.ensolvers.todolistrestapi.dao;

import com.ensolvers.todolistrestapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}