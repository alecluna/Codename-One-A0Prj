package com.mycompany.Starter;

public class Moveable extends GameObject {

	private int speed;        //speed of objects
	private int heading;	  //direction of objects

	public Moveable (double x, double y, int r, int g, int b)
    {
  	  super(x,y,r,g,b);
  	  
    }

	public Moveable(int r, int g, int b)
    {
  	  super(r,g,b);
    }

	public void move() {

		double oldX = super.getLocX();      //referencing locatations in gameobject parent class
		double oldY = super.getLocY();

		double degree = Math.toRadians(90 - heading);
		double deltaX = Math.round(Math.cos(degree) * 10.0 * speed) / 10.0;
		double deltaY = Math.round(Math.sin(degree) * 10.0 * speed) / 10.0;
		double newX = Math.round((oldX + deltaX) * 10.0) / 10.0;
		double newY = Math.round((oldY + deltaY) * 10.0) / 10.0;
		super.setLocX(newX);
		super.setLocY(newY);
	}

	public void setDirection(int d) {   //if direction is outside of specified degrees, mod it
		if (d >= 0 && d < 360)
			heading = d;
		else if (d >= 360)
			heading = d % 360;
		else {
			heading = d % 360 + 360;
		}
	}

	public int getDirection() {
		return heading;
	}

	public void initialSpeed(int s) {
		if (s < 0) {
			speed = 0;
		} else if (s > 10) {
			speed = 10;
		} else {
			speed = s;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}