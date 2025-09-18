package com.learning.todo.service;

import java.util.List;

import com.learning.todo.model.Todo;

public interface TodoService {

    List<Todo> getAllTodos();

    Todo getTodoById(Long id);

    Todo createTodo(Todo todo);

    Todo updateTodo(Long id, Todo todo);

    void deleteTodo(Long id);

}
