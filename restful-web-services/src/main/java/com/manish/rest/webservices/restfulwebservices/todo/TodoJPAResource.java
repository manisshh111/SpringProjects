package com.manish.rest.webservices.restfulwebservices.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manish.rest.webservices.restfulwebservices.todo.repository.TodoRepository;

@RestController
public class TodoJPAResource {

	TodoService todoService;
	TodoRepository todoRepository;	
	TodoJPAResource(TodoService todoService, TodoRepository todoRepository){
		this.todoService=todoService;
		this.todoRepository= todoRepository;
	}
	
	@GetMapping(path="/basicauth")
	public String basicAuthCheck() {
		return "Success";
	}
	
	
	
	@GetMapping(path="/users/{username}/todos")
	public List<Todo> retrieveTodos(@PathVariable String username) {
		return todoRepository.findByUsername(username);
		
	}
	
	@GetMapping(path="/users/{username}/todos/{id}")
	public Optional<Todo> retrieveTodo(@PathVariable String username, @PathVariable int id) {
		return todoRepository.findById(id);
		
	}
	
	@DeleteMapping(path="/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo( @PathVariable String username, @PathVariable int id) {
		todoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	/*
	 *   The Save Method: How does it know whether to insert or update.
	 *   => if 'id' is null, inserts
	 *      if 'id' value is present, then it will update an existing item
	 *      
	 * 
	 * */
	
	@PutMapping(path="/users/{username}/todos/{id}")
	public Todo updateTodo( @PathVariable String username, @PathVariable int id, @RequestBody Todo todo) {
		todoRepository.save(todo);
		return todo;
		
	}
	
	
	@PostMapping(path="/users/{username}/todos")
	public Todo createTodo( @PathVariable String username, @RequestBody Todo todo) {
        todo.setUsername(username);
       // todo.setId(null);
        return todoRepository.save(todo);
		
		
	}
	
	
}
