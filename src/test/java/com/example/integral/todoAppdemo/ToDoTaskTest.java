package com.example.integral.todoAppdemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.integral.todoAppdemo.model.TaskStatus;
import com.example.integral.todoAppdemo.model.ToDoTask;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoTaskTest {

  ToDoTask aTask;
    String taskName;

  @BeforeEach
  void setUp() {
    taskName = "task";
    aTask = new ToDoTask(taskName, LocalDateTime.now());
  }

  @Test
  void createTasksWithDefaults() {

    assertThat(aTask).isNotNull();
    assertThat(aTask.getName()).isEqualTo(taskName);
    assertThat(aTask.getLastEdit()).isNull();
    // Do I need to test this field?
    // assertThat(aTask.getID()).isEqualTo(0);
    assertThat(aTask.getStatus()).isEqualTo(TaskStatus.UNSTARTED);
  }

  @Test
  void whenEditTask_theFieldsUpdate() {
    String newName = "some Task";
    aTask.editName(newName);
    aTask.updateStatus(TaskStatus.INPROGRESS);

    assertThat(aTask.getName()).isEqualTo(newName);
    assertTrue(aTask.getLastEdit().isAfter(aTask
        .getCreated()));
    assertThat(aTask.getStatus()).isEqualTo(TaskStatus.INPROGRESS);
  }
}