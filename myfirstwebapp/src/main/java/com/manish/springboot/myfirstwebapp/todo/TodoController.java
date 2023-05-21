package com.manish.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoservice.findByUsername("Manish") ;
		model.addAttribute("todos" , todos) ;
		return "listTodos" ;
	}
	
	@RequestMapping( value= "add-todo", method=RequestMethod.GET)
	public String ShowNewTodo(ModelMap model) {
		String username= (String)model.get("name");
	    Todo todo= new Todo(0, username, "", LocalDate.now().plusYears(1), false);
	    model.put("todo", todo);
		return "addTodoPage" ;
	}
	
	@RequestMapping( value= "add-todo", method=RequestMethod.POST)
	public String addNewTodo(ModelMap model, Todo todo) {
	
		String username= (String)model.get("name");
		todoservice.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		
		
		return "redirect:list-todos" ;
	}
	
}