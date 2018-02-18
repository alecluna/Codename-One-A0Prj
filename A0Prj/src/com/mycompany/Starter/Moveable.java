package com.mycompany.Starter;

public class Moveable extends GameObject {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	private int heading;
	private int speed;
	
	public Moveable() {}

	public int move() {
		
			return 0;
	}
	
	public String heading() {
		
		return "heading";
	}
	
	public int getSpeed() {
		
		return speed;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub

	}

	@Override
	public void location() { 
		// TODO Auto-generated method stub
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return 0;
	}

}