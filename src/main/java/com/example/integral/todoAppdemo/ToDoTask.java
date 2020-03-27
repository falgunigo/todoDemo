package com.example.integral.todoAppdemo;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ToDoTask {

  String name;
  LocalDateTime created;
}
