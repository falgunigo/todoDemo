package com.example.integral.todoAppdemo;

import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoAppDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(TodoAppDemoApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      ToDoTask aTask = new ToDoTask("task", LocalDateTime.now());
      ToDoTask simpleTask = new ToDoTask("simple Task", LocalDateTime.now());

      TaskCollector taskCollector = new TaskCollector();
      taskCollector.add(aTask);
      taskCollector.add(simpleTask);

      for (ToDoTask task : taskCollector.getAllTasks()) {
        System.out
            .println(String.format("Task: %s, Created: %s", task.getName(), task.getCreated()));
      }
    };
  }
}

