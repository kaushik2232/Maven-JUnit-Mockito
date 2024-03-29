package com.junit.business;

import java.util.ArrayList;
import java.util.List;

import com.junit.mockito.ToDoTaskService;


//TodoBusinessImpl is System Under Test
//ToDoTaskService is Dependency
public class TodoBusinessImpl {
	private ToDoTaskService todoService;

	public TodoBusinessImpl(ToDoTaskService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		for (String todo : todos) {
			if (todo.contains("spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
	
	
}
