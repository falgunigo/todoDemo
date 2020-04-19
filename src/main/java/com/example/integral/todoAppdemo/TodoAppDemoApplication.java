package com.example.integral.todoAppdemo;

import com.example.integral.todoAppdemo.model.ToDoTask;
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
		System.out.println("### Adding task ###");
		taskCollector.add(aTask);
		taskCollector.add(simpleTask);
		printTasks(taskCollector);


		System.out.println("### Editing task ###");
		ToDoTask taskToEdit = taskCollector.getTaskByID(aTask.getID());
		taskToEdit.editName("Now I am an edited task");

		printTasks(taskCollector);
	}

	private void printTasks(TaskCollector taskCollector) {
		System.out.println("Printing all the Tasks");
		for (ToDoTask task : taskCollector.getAllTasks()) {
			System.out
					.println(String.format("ID: %s, Task: %s, Created: %s, Edited: %s", task.getID(), task.getName(), task.getCreated(), task.getLastEdit()));
		}
	}
}

