package com.example.integral.todoAppdemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.integral.todoAppdemo.model.TaskStatus;
import com.example.integral.todoAppdemo.model.ToDoTask;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ToDoAppIT {

  ToDoTask aTask;
  ToDoTask simpleTask;
  TaskCollector taskCollector;

  @BeforeEach
  void setUp() {
    aTask = new ToDoTask("task", LocalDateTime.now());
    simpleTask = new ToDoTask("simple Task", LocalDateTime.now());

    taskCollector = new TaskCollector();
    System.out.println("### Adding task ###");
    taskCollector.add(aTask);
    taskCollector.add(simpleTask);
  }

  @Test
  @Order(1)
  void ableToEditTasks() {

    System.out.println("### Editing task ###");
    ToDoTask taskToEdit = taskCollector.getTaskByID(aTask.getID());
    taskToEdit.editName("Now I am an edited task");

    assertTrue(taskCollector.getTaskCount() > 0);
    assertEquals(2, taskCollector.getTaskCount());
  }

  @Test
  void ableToUpdateStatusOfTask() {
    System.out.println("### Update task status ###");
    aTask.updateStatus(TaskStatus.INPROGRESS);

    assertThat(aTask.getStatus()).isEqualTo(TaskStatus.INPROGRESS);

    aTask.updateStatus(TaskStatus.DONE);

    assertThat(aTask.getStatus()).isEqualTo(TaskStatus.DONE);
  }
}
