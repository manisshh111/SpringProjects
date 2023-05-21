package com.manish.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;import java.util.function.Predicate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
       private static List<Todo> todos = new ArrayList<>()  ;
       
       public static int todosCount=0;
       
       static {
    	   todos.add(new Todo(++todosCount, "ADITYA","learn AWS",LocalDate.now().plusYears(1), false)) ;
    	   todos.add(new Todo(++todosCount, "ADITYA","learn DevOPS",LocalDate.now().plusYears(2), false)) ;
    	   todos.add(new Todo(++todosCount, "ADITYA","learn full stack",LocalDate.now().plusYears(3), false)) ;
    	   
       }
       public static List<Todo> findByUsername(String username){
    	   return todos  ;
       }
       
       public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
    	   Todo todo= new Todo(++todosCount, username, description, targetDate, done);
    	   todos.add(todo);
       }
       
       public void deleteTodo(int id) {
    	   Predicate<? super Todo> predicate= todo -> todo.getId()==id;
		todos.removeIf(predicate);
       }
       
       public Todo findById(int id) {
    	   Predicate<? super Todo> predicate= todo -> todo.getId()==id;
    	   Todo todo= todos.stream().filter(predicate).findFirst().get();
    	   return todo;
       }
       
       public void updateTodo(int id) {
    	   Predicate<? super Todo> predicate= todo -> todo.getId()==id;
		todos.removeIf(predicate);
       }

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteTodo(todo.getId());
		todos.add(todo);
	}
       
}