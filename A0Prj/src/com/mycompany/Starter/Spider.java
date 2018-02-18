package com.mycompany.Starter;

import com.codename1.charts.util.ColorUtil;

public class Spider extends Moveable {

	private int size;
	public static int BLACK;

	public Spider() {

		this.size = 20; // assigning a fixed number to size of spider

	}

	public int size() {

		return this.size;
	}

	public int getColor() {
		return BLACK;
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