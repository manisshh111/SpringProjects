package com.manish.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
     
//	@Autowired
	private TodoService todoservice ;
	
	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}

	@RequestMapping( value= "list-todos", method=RequestMethod.GET)
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoservice.findByUsername("Manish") ;
		model.addAttribute("todos" , todos) ;
		return "listTodos" ;
	}
	
	@RequestMapping( value= "add-todo", method=RequestMethod.GET)
	public String addNewTodo(ModelMap model) {
	
		return "addTodoPage" ;
	}
	
}