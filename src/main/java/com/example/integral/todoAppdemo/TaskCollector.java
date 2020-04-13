package com.example.integral.todoAppdemo;

import com.example.integral.todoAppdemo.model.ToDoTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskCollector {

  private static Integer index = 0;
  private Map<Integer, ToDoTask> taskMap = new HashMap<>();

  public void add(ToDoTask aTask) {
    taskMap.put(index++, aTask);
  }

  public Integer getTaskCount() {
    return taskMap.size();
  }

  public List<ToDoTask> getAllTasks() {
    return new ArrayList(taskMap.values());
  }

  public void removeTask(int taskIndex) {
    taskMap.remove(taskIndex);
    index--;
  }

  public void clear() {
    taskMap.clear();
    index = 0;
  }
}
