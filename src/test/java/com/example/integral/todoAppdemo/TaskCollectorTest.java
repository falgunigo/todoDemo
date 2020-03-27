package com.example.integral.todoAppdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TaskCollectorTest {

  @Test
  void testTest() {
    ToDoTask aTask = new ToDoTask("task", LocalDateTime.now());

    assertTrue(true);
  }
}