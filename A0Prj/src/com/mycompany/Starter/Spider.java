package com.mycompany.Starter;

import java.util.Random;

public class Spider extends Moveable {

	private int size;
	private int speed;
	public Random rand = new Random();

	public Spider() {

		super(0, 0, 0);
		this.size = 25; // assigning a fixed number to size of spider
		this.speed = 5;
	}

	public void leftHeading() {
		super.setDirection((super.getDirection() - 6));
	}

	public void rightHeading() {
		super.setDirection(super.getDirection() + 6);
	}

	public int getSize() {

		return size;
	}

	public int getSpeed() {
		return speed;
	}

	public String toString() {

		return ("Spider: loc=" + super.getLocX() + ", " + super.getLocY() + " color=[" + super.getRed() + ", "
				+ super.getGreen() + ", " + "" + super.getBlue() + "] heading=" + super.getDirection() + " Speed= "
				+ getSpeed() + " Size = " + getSize());
	}

}