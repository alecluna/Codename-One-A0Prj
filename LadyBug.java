package com.mycompany.Starter;

import com.codename1.charts.models.Point;
import com.codename1.ui.Graphics;
import com.codename1.charts.util.ColorUtil;

public class LadyBug extends Moveable implements Steerable {

	private int maximumSpeed;
	private int foodLevel;
	private int foodConsumptionRate;
	private int healthLevel;
	private int lastFlagReached;
	private int size;

	public LadyBug() {
		super(255, 0, 0);
		super.initialSpeed(0);
		super.setDirection(0);
		this.maximumSpeed = 50;
		this.healthLevel = 10;
		this.foodConsumptionRate = 5;
		this.foodLevel = 30;
		this.size = 25;
	}

	public int setLastFlagReached(int flag) {

		this.lastFlagReached = flag;
		return lastFlagReached;
	}

	public int getLastFlagReached() {
		return lastFlagReached;
	}

	public int getfoodConsumptionRate() {
		return foodConsumptionRate;
	}

	public int setFoodLevel() {

		return getFoodLevel() + 20;
	}

	public int getFoodLevel() {
		return foodLevel;
	}

	public int subFoodLevel(int foodLevel) {
		return foodLevel - this.foodConsumptionRate;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getSize() {
		return size;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public int minusHealthLevel() {

		return this.healthLevel - 2;
	}

	public void leftHeading() {
		super.setDirection((super.getDirection() - 90));
	}

	public void rightHeading() {
		super.setDirection(super.getDirection() + 90);
	}

	public String toString() {
		return ("LadyBug: loc=" + super.getLocX() + ", " + super.getLocY() + " color=[" + super.getRed() + ", "
				+ super.getGreen() + ", " + super.getBlue() + "] speed= " + super.getSpeed() + " " + " heading = "
				+ super.getDirection() + " " + " maxSpeed= " + getMaximumSpeed() + " " + " foodConsumptionRate= "
				+ getfoodConsumptionRate());
	}

	public void increaseSpeed() {

		if (super.getSpeed() == maximumSpeed) {

			System.out.println("Error: Maximum speed reached");
		} else if (getFoodLevel() == 0) {
			System.out.println("Food Level 0, can't increase speed");
		} else {

			super.initialSpeed(getSpeed() + 15);
			;
		}
	}

	public void decreaseSpeed() {
		super.initialSpeed(getSpeed() - 15);
	}

	public void draw(Graphics g, Point relativePoint) {
		g.setColor(ColorUtil.red(0));
		int x = (int) (relativePoint.getX() + super.getLocX());
		int y = (int) (relativePoint.getY() + super.getLocY());

		g.fillRect(x, y, 10, 10);
		g.drawRect(x, y, 10, 10);
		// move();

	}
}