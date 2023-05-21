package com.manish.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
       
}