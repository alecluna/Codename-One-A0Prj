package com.mycompany.Starter;

public abstract class Fixed extends GameObject {

	private int objectID; // id for every fixed object

	public Fixed() {
	}

	public Fixed(int r, int g, int b) // foodstations and flags
	{
		super(r, g, b);
		objectID = objectID + 1;
	}

	public void setLocX() {
		System.out.println("Error: Location cannot be set");
	}

	public void setLocY() {
		System.out.println("Error: Location cannot be set");
	}

	public int getId() { //so we can retreive each objects ID when necessary
		return objectID;
	}
}