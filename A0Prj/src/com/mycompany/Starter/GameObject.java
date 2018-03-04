package com.mycompany.Starter;

import java.util.Random;
import com.codename1.charts.util.ColorUtil;

public abstract class GameObject {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	private double locX;
	private double locY;
	private int color;
	private Random rand = new Random();

	public GameObject() {
	}

	public GameObject(double x, double y, int r, int g, int b) {

		locX = x;
		locY = y;
		color = ColorUtil.rgb(r, g, b);
	}

	public GameObject(int r, int g, int b) { // initialize random objects
		locX = (double) rand.nextInt(1024); // type cast to double for points
		locY = (double) rand.nextInt(768);
		color = ColorUtil.rgb(r, g, b); // initialize color
	}

	public void setLocX(double x) {

		if (x >= 0.0 && x <= WIDTH) { // testing x within the correct bounds
			locX = x;
		} else if (x > WIDTH) {
			locX = WIDTH;
		} else {
			locX = 0.0;

		}
	}

	public void setLocY(double y) { // testing y within the correct bounds
		// verify within y bounds
		if (y >= 0.0 && y <= HEIGHT) {
			locY = y;
		} else if (y > HEIGHT) {
			locY = HEIGHT;
		} else {
			locY = 0.0;
		}

	}

	public void setColor(int r, int g, int b) {
		color = ColorUtil.rgb(r, g, b);

	}

	public double getLocX() { // getters
		return locX;
	}

	public double getLocY() {
		return locY;
	}

	public int getRed() { // more getters
		return ColorUtil.red(color);
	}

	public int getGreen() {
		return ColorUtil.green(color);
	}

	public int getBlue() {
		return ColorUtil.blue(color);
	}

	public abstract String toString();

}