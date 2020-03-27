package com.example.integral.todoAppdemo;

import java.util.ArrayList;
import java.util.List;

public class TaskCollector {

  List<ToDoTask> taskList = new ArrayList<>();

  public void add(ToDoTask aTask) {
    taskList.add(aTask);
  }

  public Integer getAllTasks() {
    return taskList.size();
  }
}
