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
  void testTest() {
    ToDoTask aTask = new ToDoTask("task", LocalDateTime.now());

    assertTrue(true);
  }

  @Test
  void whenAddTasks_thenCollectorIsNotEmpty() {

  }
}