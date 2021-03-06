package com.example.integral.todoAppdemo;

import static org.junit.jupiter.api.Assertions.*;

import com.example.integral.todoAppdemo.model.ToDoTask;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskCollectorTest {

  //  Keep test simple free of dependencies preferably.
  TaskCollector taskCollector;

  private ToDoTask aTask;
  private ToDoTask simpleTask;

  @BeforeEach
  void setUp() {
    taskCollector = new TaskCollector();

    aTask = new ToDoTask("task", LocalDateTime.now());
    simpleTask = new ToDoTask("simple Task", LocalDateTime.now());

    taskCollector.add(aTask);
    taskCollector.add(simpleTask);
  }

  @AfterEach
  void tearDown() {
    taskCollector.clear();
  }

  @Test
  void whenAddTasks_thenCollectorIsNotEmpty() {

    //Be more specific with assertions
    assertTrue(taskCollector.getTaskCount() > 0);

    assertEquals(2, taskCollector.getTaskCount());
  }

  @Test
  void whenRequestTasks_thenReturnAllTasks() {
    List<ToDoTask> result = taskCollector.getAllTasks();

    assertEquals(aTask.getName(), result.get(0).getName());
  }

  @Test
  void whenDeleteTask_thenListSizeDecreases() {
    int originalTaskCount = taskCollector.getTaskCount();

    taskCollector.removeTask(simpleTask);

    int finalTaskCount = taskCollector.getTaskCount();
    assertEquals(originalTaskCount - 1, finalTaskCount);
  }

  @Test
  void whenEditTask_thenEditDateIsAddedAndAfterCreatedDate() {

    ToDoTask taskToEdit = taskCollector.getTaskByID(aTask.getID());
    taskToEdit.editName("Now I am an edited task");

    //mock
    assertTrue(Objects.nonNull(taskToEdit.getLastEdit()));
    assertTrue(taskToEdit.getLastEdit().isAfter(taskToEdit.getCreated()));
  }
}