package com.junit.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.junit.mockito.ToDoTaskService;
import com.junit.mockito.ToDoTaskServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		
		ToDoTaskService todoServiceStub = new ToDoTaskServiceStub();
		TodoBusinessImpl todoImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> todos = todoImpl.retrieveTodosRelatedToSpring("Sample");
		assertEquals(2, todos.size());
		
	}

}
