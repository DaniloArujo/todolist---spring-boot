package br.com.daniloaraujo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniloaraujo.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
} 