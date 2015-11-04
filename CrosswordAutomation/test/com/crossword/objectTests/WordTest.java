package com.crossword.objectTests;

import static org.junit.Assert.*;
import com.crossword.objects.*;
import java.util.*;
import org.junit.Test;


public class WordTest {

	@Test
	public void testSingleClueConstructorHappyCase() {
		Word word = new Word("hello", "world");
		assertEquals(word.getWord(), "hello");
		assertEquals(word.getClues().size(), 1);
		assertEquals(word.getClues().get(0), "world");
	}
	
	@Test
	public void testMultiClueConstructorHappyCase() {
		List<String> clueList = new ArrayList<String>();
		
		// Test with one word in list
		clueList.add("world");
		Word word = new Word("hello", clueList);
		assertEquals(word.getWord(), "hello");
		assertEquals(word.getClues().size(), clueList.size());
		assertEquals(word.getClues().get(0), "world");
		
		// Test with more than one word in the list
		clueList.add("world2");
		
		word = new Word("hello", clueList);
		assertEquals(word.getWord(), "hello");
		assertEquals(word.getClues().size(), clueList.size());
		assertEquals(word.getClues().get(0), "world");
		assertEquals(word.getClues().get(1), "world2");
	}
	
	

}
