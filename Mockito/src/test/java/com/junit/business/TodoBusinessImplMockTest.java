package com.junit.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.junit.mockito.ToDoTaskService;
import com.junit.mockito.ToDoTaskServiceStub;

public class TodoBusinessImplMockTest {

	@Test
	public void usingAMock() {
		
		ToDoTaskService todoServiceMock = mock(ToDoTaskService.class);
		List<String> todos = Arrays.asList("spring MVC", "spring hibernate", "spring");
		when(todoServiceMock.retrieveTodos("sample")).thenReturn(todos);
		TodoBusinessImpl todoImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoImpl.retrieveTodosRelatedToSpring("Sample");
		assertEquals(3, todos.size());
		
	}
}
