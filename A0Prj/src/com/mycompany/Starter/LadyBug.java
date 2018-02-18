package com.mycompany.Starter;

import com.codename1.charts.util.ColorUtil;

public class LadyBug extends Moveable implements Steerable{

	private int size;
	public static int RED;
	private int maximumSpeed;
	private int foodLevel;
	private int foodConsumptionRate;
	private int healthLevel;
	private int lastFlagReached;

	public LadyBug() {

		this.size = 20; // assigning a fixed number to the size of the ladybug
		this.maximumSpeed = 50;
		this.healthLevel = 10;
		this.lastFlagReached = 1;
	}
	
	public int getLastFlagReached() {
		
		return this.lastFlagReached;
	}

	public int size() {

		return this.size;
	}
	
	public int getFoodLevel() {
		
		
		return this.foodLevel;
	}

	public int getColor() {

		return RED; 
	}
	
	
	
	public int getSpeed() {
		return 0;
	}

	public int getSize() {

		return this.size();
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

	public void changeHeading() {
		// TODO Auto-generated method stub
		
	}

}