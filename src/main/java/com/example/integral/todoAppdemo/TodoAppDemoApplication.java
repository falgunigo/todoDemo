package com.example.integral.todoAppdemo;

import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppDemoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(TodoAppDemoApplication.class, args);
  }

	@Override
	public void run(String... args) throws Exception {
		ToDoTask aTask = new ToDoTask("task", LocalDateTime.now());
		ToDoTask simpleTask = new ToDoTask("simple Task", LocalDateTime.now());

		TaskCollector taskCollector = new TaskCollector();
		taskCollector.add(aTask);
		taskCollector.add(simpleTask);

		for (ToDoTask task : taskCollector.getAllTasks()) {
			System.out
					.println(String.format("Task: %s, Created: %s", task.getName(), task.getCreated()));
		}
	}
}

