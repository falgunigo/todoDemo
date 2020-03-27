package com.example.integral.todoAppdemo;

import java.util.ArrayList;
import java.util.List;

public class TaskCollector {

  private List<ToDoTask> taskList = new ArrayList<>();

  public void add(ToDoTask aTask) {
    taskList.add(aTask);
  }

  public Integer getTaskCount() {
    return taskList.size();
  }

  public List<ToDoTask> getAllTasks() {
    return taskList;
  }
}
