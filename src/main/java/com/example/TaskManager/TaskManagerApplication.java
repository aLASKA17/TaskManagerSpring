package com.example.TaskManager;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TaskManagerApplication {

	List<Task> taskList = new CopyOnWriteArrayList<>();

	@GetMapping("/addTask")
	public List<Task> addTask(@RequestParam String title, @RequestParam String description) {
		taskList.add(new Task(0, title, description, false));
		return taskList;
	}

	@GetMapping("/removeTask")
	public List<Task> removeTask(@RequestParam int id){
		taskList.remove(id-1);
		return taskList;
	}

	@GetMapping("getTasks")
	public List<Task> getTasks() {
		return taskList;
	}

	@GetMapping("/comptetedTask")
	public List<Task> compltedTask(@RequestParam int id) {
		taskList.get(id-1).setCompleted(true);
		return taskList;
	}
}
