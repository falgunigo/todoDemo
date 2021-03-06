package com.example.integral.todoAppdemo;

import com.example.integral.todoAppdemo.model.ToDoTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TaskCollector {

  private Map<Integer, ToDoTask> taskMap = new HashMap<>();

  public void add(ToDoTask aTask) {
    taskMap.put(aTask.getID(), aTask);
  }

  public Integer getTaskCount() {
    return taskMap.size();
  }

  public List<ToDoTask> getAllTasks() {
    return new ArrayList(taskMap.values());
  }

  public void removeTask(ToDoTask aTask) {
    Integer ID = aTask.getID();
    taskMap.remove(ID);
  }

  public void clear() {
    taskMap.clear();
  }

  private void printTaskMap() {
    System.out.println("Printing Task Map");
    taskMap.entrySet().stream()
        .forEach(item -> System.out.println(item.getKey() + item.getValue().getName()));
  }

  public ToDoTask getTaskByID(int taskID) {
    return taskMap.get(taskID);
  }

  @Override
  public String toString() {
    String result = new String();
    for (ToDoTask task : this.getAllTasks()) {
      result+= String.format("ID: %s, Task: %s, Created: %s, Edited: %s", task.getID(), task.getName(), task.getCreated(), task.getLastEdit());
      result += "\n";
    }
    return result;
  }
}
