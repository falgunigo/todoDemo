package com.example.integral.todoAppdemo.model;


import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class ToDoTask {

  private String name;
  private LocalDateTime created;
  private LocalDateTime lastEdit;
  private static Integer IDCounter=0;
  private Integer ID;

  public ToDoTask(String task, LocalDateTime created) {
    this.name = task;
    this.created = created;
    this.ID = IDCounter++;
  }
}
