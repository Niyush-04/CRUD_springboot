package com.learning.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
