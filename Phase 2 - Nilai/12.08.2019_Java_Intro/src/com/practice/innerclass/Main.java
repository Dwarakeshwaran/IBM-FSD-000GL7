package com.practice.innerclass;

public class Main {

	public static void main(String[] args) {
		Model m = new Model();
		m.modelMethod();
		
		Model.Square s = m.new Square();
		s.squareMethod();
	}

}
