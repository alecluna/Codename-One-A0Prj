package com.mycompany.Starter;
import com.codename1.charts.util.ColorUtil;


public class Flag extends Fixed{

	private int x;
	private int y;
	private int size;
	public static int BLUE;
	private int sequenceNumber;
	
	public Flag(int x, int y, int sequenceNumber){ //locations are chosen by user
		
		this.size = 10; //fixed size for the flags
		this.x = x;
		this.y = y;
		this.sequenceNumber = sequenceNumber;
	}
	
	public int getSequenceNumber() {
		
		return this.sequenceNumber;
	}
	
	@Override
	public int size() {

		return this.size;
	}
	
	public int getColor() {
		
		return BLUE;
	}
	
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean isLocationGood() { // is x and y within the right range?

		boolean isXGoodtoUse = (this.x > 0 && this.x <= WIDTH) ? true : false;
		boolean isYGoodtoUse = (this.y > 0 && this.y <= HEIGHT) ? true : false;
		return isXGoodtoUse && isYGoodtoUse; // both booleans need to be true 

	}
	
	@Override
	public void location() {

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