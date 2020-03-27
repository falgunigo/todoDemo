package com.example.integral.todoAppdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TaskCollectorTest {

  @Test
  void testTest() {
    ToDoTask aTask = new ToDoTask("task", Instant.now());
    assertTrue(true);
  }
}