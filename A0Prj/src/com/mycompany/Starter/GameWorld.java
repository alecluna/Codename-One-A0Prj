package com.mycompany.Starter;

public class GameWorld {
	
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;

	@SuppressWarnings("unused")
	public void init() {
		Fixed fff = new Fixed();
		Moveable move = new Moveable();
		FoodStation food = new FoodStation();
		LadyBug lady = new LadyBug(12,3);
		Spider spider = new Spider(12,12);
		System.out.println("Size is: " + lady.getSize());
		System.out.println("Size is: " + spider.getSize());

		
		// initial game objects/setup
	} 
	// additional methods here to
	// manipulate world objects and
	// related game state data
}