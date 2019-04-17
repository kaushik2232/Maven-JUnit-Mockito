package com.junit.mockito;

import java.util.Arrays;
import java.util.List;

public class ToDoTaskServiceStub implements ToDoTaskService {
	
	public List<String> retrieveTodos(String user){
		return Arrays.asList("Spring MVC", "Spring hibernate", "MyBattis");
	}

}
