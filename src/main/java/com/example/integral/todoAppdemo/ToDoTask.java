package com.example.integral.todoAppdemo;


import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ToDoTask {

  private String name;
  private Instant created;
}
