package com.manish.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {

	TodoService todoService;
	
	TodoResource(TodoService todoService){
		this.todoService=todoService;
	}
	
	@GetMapping(path="/basicauth")
	public String basicAuthCheck() {
		return "Success";
	}
	
	
	
	@GetMapping(path="/users/{username}/todos")
	public List<Todo> retrieveTodos(@PathVariable String username) {
		return todoService.findByUsername(username);
		
	}
	
	@GetMapping(path="/users/{username}/todos/{id}")
	public Todo retrieveTodo(@PathVariable String username, @PathVariable int id) {
		return todoService.findById(id);
		
	}
	
	@DeleteMapping(path="/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo( @PathVariable String username, @PathVariable int id) {
		todoService.deleteTodo(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(path="/users/{username}/todos/{id}")
	public Todo updateTodo( @PathVariable String username, @PathVariable int id, @RequestBody Todo todo) {
		todoService.updateTodo(todo);
		return todo;
		
	}
	
	
	@PostMapping(path="/users/{username}/todos")
	public Todo createTodo( @PathVariable String username, @RequestBody Todo todo) {
		todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), todo.isDone());
		return todo;
		
	}
	
	
}
