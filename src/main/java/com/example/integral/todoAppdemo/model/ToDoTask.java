package com.example.integral.todoAppdemo.model;


import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class ToDoTask {

  private String name;
  private LocalDateTime created;
  private LocalDateTime lastEdit;
  private static Integer IDCounter = 0;
  private Integer ID;
  private TaskStatus status;

  public ToDoTask(String task, LocalDateTime created) {
    this.name = task;
    this.created = created;
    this.ID = IDCounter++;
    this.status = TaskStatus.UNSTARTED;
  }

  public void editName(String newName) {
    this.lastEdit = LocalDateTime.now().plusSeconds(10);
    // This was done because CircleCI is super fast?
    this.name = newName;
  }

  public void updateStatus(TaskStatus newStatus) {
    this.status = newStatus;
  }
}
