package com.example.TaskManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

	List<Task> taskList = new ArrayList<>();

	@GetMapping("/")
	public List<Task> getMethodName(@RequestParam String param) {
		taskList.add(new Task(0, "param", "param", false));
		return taskList;
	}
	
	

}
