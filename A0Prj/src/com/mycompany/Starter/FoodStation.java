package com.mycompany.Starter;
import java.util.Random;


public class FoodStation extends Fixed {

	//public static int GREEN;
	private int size;
	private int capacity;
	public Random rand = new Random();

	public FoodStation() {

		super(0,76,153);

	}

	@Override
	public String toString() {

		return("Station: loc="+super.getLocX() +", " +super.getLocY()+" color=["+ super.getRed()+", "+super.getGreen()+", "+super.getBlue()+"] rate="+getBlinkRate());
	}



}
