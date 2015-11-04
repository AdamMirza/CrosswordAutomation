package com.crossword.objects;

import java.util.*;

public class Word {
	private String word;
	private List<String> clueCollection; // Holds a List of all the clues, clues are case-sensitive
	
	/**
	 * Creates a new Word object.
	 * @param word - A String for the word.
	 * @param clue - A String for the clue associated to the word.
	 */
	public Word(String word, String clue)
	{
		this.word = word;
		this.clueCollection = new ArrayList<String>();
		this.clueCollection.add(clue);
	}
	
	/**
	 * Creates a new Word object.
	 * @param word - A String for the word.
	 * @param clueCollection - A List of Strings that holds all clues associated with the word
	 * @exception IllegalArgumentException - throws an exception if any of the parameters are null
	 * 				or Empty
	 */
	public Word(String word, List<String> clueCollection)
	{
		if (word == null || word.isEmpty() || word == "" || clueCollection.isEmpty())
		{
			throw new IllegalArgumentException();
		}
		this.word = word;
		this.clueCollection = clueCollection;
	}
	
	/**
	 * Gets and returns the current word object
	 * @return Word wordObject
	 */
	public Word getObject()
	{
		return this;
	}
	
	/**
	 * Gets the word
	 * @return String word
	 */
	public String getWord()
	{
		return word;
	}
	
	/**
	 * Gets a List of clues
	 * @return List<String> clues
	 */
	public List<String> getClues()
	{
		return clueCollection;
	}
	
	/**
	 * Gets a random clue associated with this Word object
	 * @return String clue
	 */
	public String getRandomClue()
	{
		Random rand = new Random();
		
		// TODO - pick a random clue and return it
		
		return "";
	}
	
	/**
	 * Adds a clue to the word object
	 * @param clue
	 */
	public void addClue(String clue)
	{
		if (!clueCollection.contains(clue))
			clueCollection.add(clue);
	}
}
