package com.example.integral.todoAppdemo.model;


import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class ToDoTask {

  private String name;
  private LocalDateTime created;
  private LocalDateTime lastEdit;

  public ToDoTask(String task, LocalDateTime created) {
    this.name = task;
    this.created = created;
  }
}
