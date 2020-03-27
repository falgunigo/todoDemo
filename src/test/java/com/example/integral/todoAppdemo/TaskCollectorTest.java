package com.example.integral.todoAppdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class TaskCollectorTest {

//  Keep test simple free of dependencies preferrably.
  TaskCollector taskCollector;

  private ToDoTask aTask;
  private ToDoTask simpleTask;

  @BeforeEach
  void setUp() {
    taskCollector = new TaskCollector();
    aTask = new ToDoTask("task", LocalDateTime.now());
    simpleTask = new ToDoTask("simple Task", LocalDateTime.now());

  }

  @Test
  void whenAddTasks_thenCollectorIsNotEmpty() {
    taskCollector.add(aTask);
    taskCollector.add(simpleTask);

    assertTrue(taskCollector.getTaskCount() > 0);
    assertEquals(2, taskCollector.getTaskCount());
  }

  @Test
  void whenRequestTasks_thenReturnAllTasks() {
    taskCollector.add(aTask);
    taskCollector.add(simpleTask);

    List<ToDoTask> result = taskCollector.getAllTasks();

    assertTrue(Objects.nonNull(result));
    assertEquals(aTask.getName(), result.get(0).getName());
  }

}