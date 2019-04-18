package com.junit.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTestMock {

	@Test
	public void MockListSizeMethod() {
		
		List listMock = mock(List.class);
		Mockito.when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}

	@Test
	public void MockListSizeMultipleReturnValues() {
		List listMock = mock(List.class);
		Mockito.when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size()); // First Call
		assertEquals(20, listMock.size()); // Second Call
	}

	@Test
	public void MockListGetMethod() {
		List<String> listMock = mock(List.class);
		Mockito.when(listMock.get(0)).thenReturn("Mockito");
		assertEquals("Mockito", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

	@Test
	public void MockListMatchers() {
		List<String> listMock = mock(List.class);
		Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("EasyMock");
		
		//Uses @Test(expected = RuntimeException.class
		//Mockito.when(listMock.get(Mockito.anyInt())).thenThrow(new RuntimeException("Error"));
		
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		assertEquals("EasyMock", listMock.get(0));
		assertEquals("EasyMock", listMock.get(1));
	}

}
