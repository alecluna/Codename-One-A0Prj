package com.mycompany.Starter;

import com.codename1.charts.util.ColorUtil;
import java.util.Random;

public class FoodStation extends Fixed {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	public static int GREEN;
	private int size;
	private double x;
	private double y;
	private int capacity;

	public FoodStation(double x, double y) {

		Random rand = new Random();
		int randSize = rand.nextInt(51) + 10;
		this.size = randSize;
		this.capacity = randSize/2;
		this.x = x;
		this.y = y;
	}

	private boolean isLocationGood() {//checking if location is within the bounds

		boolean isXGoodtoUse = (this.x > 0 && this.x <= WIDTH) ? true : false;
		boolean isYGoodtoUse = (this.y > 0 && this.y <= HEIGHT) ? true : false;
		return isXGoodtoUse && isYGoodtoUse; //

	}  
	
	public int getCapacity() {
		
		return this.capacity;
	}

	public int getColor() {

		return GREEN;
	}

	@Override
	public int size() {

		return this.size;
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub

	}

	@Override
	public void location() { //if x and y are within the bounds, return location

		if (isLocationGood()) {
			System.out.println("Location is:" + getX() + " " + getY());
		} else
			System.out.println("Error: location fell outside the boundaries");
	}

	@Override
	public double getX() {
		return this.x;
	}

	@Override
	public double getY() {
		return this.y;

	}
}
