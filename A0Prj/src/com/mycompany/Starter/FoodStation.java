package com.mycompany.Starter;

import java.util.Random;

public class FoodStation extends Fixed {

	// public static int GREEN;
	private int size;
	private int capacity;
	public Random rand = new Random();

	public FoodStation() {

		super(0, 153, 35);
		capacity = rand.nextInt(21);
		this.size = rand.nextInt(31) + 10;
	}

	public int getCapacity() {

		return capacity;
	}

	public int getSize() {

		return size;
	}

	public String toString() {

		return ("FoodStation: loc=" + super.getLocX() + ", " + super.getLocY() + " color=[" + super.getRed() + ", "
				+ super.getGreen() + ", " + "" + super.getBlue() + "] capacity=" + getCapacity() + "Size = "
				+ getSize());
	}

}
