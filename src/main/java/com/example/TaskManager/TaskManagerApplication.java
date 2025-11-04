package com.example.TaskManager;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/task")
public class TaskManagerApplication {

	List<Task> taskList = new CopyOnWriteArrayList<>();


	@PostMapping("/add")
	public ResponseEntity<Task> addTask(@RequestBody Task task) {
		taskList.add(task);
		return new ResponseEntity<>(task, HttpStatus.CREATED);
	}

	@DeleteMapping("/remove/{id}")
	public List<Task> removeTask(@PathVariable int id){
		taskList.remove(id-1);
		return taskList;
	}

	@GetMapping("/get")
	public List<Task> getTasks() {
		return taskList;
	}

	@GetMapping("/completedTask")
	public List<Task> completedTask(@RequestParam int id) {
		taskList.get(id-1).setCompleted(true);
		return taskList;
	}


}
