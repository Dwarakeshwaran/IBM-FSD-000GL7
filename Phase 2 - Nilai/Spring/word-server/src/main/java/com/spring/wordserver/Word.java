package com.spring.wordserver;

public class Word {

	public String word;

	public Word() {
		super();
	}	
	
	public Word(String word) {
		this();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
}