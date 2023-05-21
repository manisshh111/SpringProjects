package com.manish.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
     
//	@Autowired
	private TodoService todoservice ;
	
	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoservice.findByUsername("Manish") ;
		model.addAttribute("todos" , todos) ;
		return "listTodos" ;
	}
	
	@RequestMapping( value= "add-todo", method=RequestMethod.GET)
	public String ShowNewTodo(ModelMap model) {
		String username= (String)model.get("name");
	    Todo todo= new Todo(0, username, "default", LocalDate.now().plusYears(1), false);
	    model.put("todo", todo);
		return "addTodoPage" ;
	}
	
	@RequestMapping( value= "add-todo", method=RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
	
		if(result.hasErrors()) {
			return "addTodoPage";
		}
		
		
		String username= (String)model.get("name");
		todoservice.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		
		
		return "redirect:list-todos" ;
	}
	
	@RequestMapping("delete-todo")
	public String DeleteTodo(@RequestParam int id) {
		todoservice.deleteTodo(id);
		return "redirect:list-todos" ;
	}
	
	@RequestMapping(value="update-todo", method=RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo= todoservice.findById(id);
		model.addAttribute("todo", todo);
		return "addTodoPage";
	}
	
	@RequestMapping( value= "update-todo", method=RequestMethod.POST)
	public String UpdateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
	
		if(result.hasErrors()) {
			return "addTodoPage";
		}
		
		
		String username= (String)model.get("name");
		todoservice.updateTodo(todo);
		todo.setUsername(username);
		
		
		return "redirect:list-todos" ;
	}
	
}