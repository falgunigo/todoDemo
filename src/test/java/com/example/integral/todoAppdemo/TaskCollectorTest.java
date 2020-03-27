package com.example.integral.todoAppdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TaskCollectorTest {

  @Autowired
  TaskCollector taskCollector;

  @Test
  void whenAddTasks_thenCollectorIsNotEmpty() {
    ToDoTask aTask = new ToDoTask("task", LocalDateTime.now());
    ToDoTask simpleTask = new ToDoTask("simple Task", LocalDateTime.now());

    taskCollector.add(aTask);
    taskCollector.add(simpleTask);

    assertEquals(2, taskCollector.getAllTasks());
  }

  @Test
  void whenRequestTasks_thenReturnAllTasks() {

  }
}