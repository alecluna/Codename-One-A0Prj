package com.mycompany.Starter;

import java.util.Random;

import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Graphics;

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
	
	public void draw(Graphics g, Point relativePoint) {
		g.setColor(ColorUtil.CYAN);
		int x = (int) (relativePoint.getX() + super.getLocX());
		int y = (int) (relativePoint.getY() + super.getLocY());

		g.fillRect(x, y, 40, 50);
		g.drawRect(x, y, 40, 50);
		// move();

	}

}