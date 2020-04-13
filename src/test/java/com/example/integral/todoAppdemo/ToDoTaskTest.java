package com.example.integral.todoAppdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Objects;
import org.junit.jupiter.api.Test;

class ToDoTaskTest {
  @Test
  void ableToCreateATask() {
    ToDoTask aTask = new ToDoTask("task", LocalDateTime.now());

    assertTrue(Objects.nonNull(aTask));
  }
}