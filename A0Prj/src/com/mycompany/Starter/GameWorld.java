package com.mycompany.Starter;

import java.util.ArrayList;

public class GameWorld {

	private LadyBug player;
	private int lives = 3;
	private int playerCount = 0; // error checking so we dont add stuff before a ladybug
	private int time = 0;
	private int lastFlagReached = 0;
	private ArrayList<Object> list;

	public GameWorld() {

		this.list = new ArrayList<Object>();// Creating arraylist

	}

	public void init() {
	}

	public void quit() {
		System.out.println("Press 'y' to quit, 'n' to cancel"); // Exit message

	}

	public void quit2()// System exit function
	{
		System.exit(0);
	}

	public void increaseSpeed() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		} else {
			player.increaseSpeed();
			System.out.println(player.toString());
		}
	}

	public void decreaseSpeed() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		} else {
			player.decreaseSpeed();
			System.out.println(player.toString());

		}
	}

	public void addFoodStation() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		FoodStation foodstation = new FoodStation();
		this.list.add(foodstation);
		System.out.println(foodstation.toString());
	}

	public void addFlag() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		Flag flag = new Flag(1, 2);
		this.list.add(flag);
		System.out.println(flag.toString());
	}

	public void addSpider() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		Spider spider = new Spider();
		this.list.add(spider);
		System.out.println(spider.toString());
	}

	public void addLadyBug()// LadyBug (the player) is created
	{
		if (playerCount < 1) {
			player = new LadyBug();
			this.list.add(player);
			playerCount++;
			System.out.println(player.toString());

		} else {
			System.out.println("Error: LadyBug cannot be created");
		}
	}

	public void steerLeft() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		player.leftHeading();
		System.out.println(player.toString());
	}

	public void steerRight() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		player.rightHeading();
		System.out.println(player.toString());
	}

	public void displayGame() {
		System.out.println("last flag reached: " + player.getLastFlagReached());
		System.out.println("Food Level: " + player.getFoodLevel());
		System.out.println("Health Level: " + player.getHealthLevel());
		System.out.println("Elapsed Time: " + time);
	}

	public void tick() {

		for (int element = 0; element < this.list.size(); element++) {
			if (this.list.get(element) instanceof Moveable) {
				Moveable move = (Moveable) list.get(element);
				move.move();
			}
			if (this.list.get(element) instanceof LadyBug) {
				player.subFoodLevel(player.getFoodLevel());
			}

		}
		time++; // incremement the time
		System.out.println("time has ticked");
	}

	public void hitFlag() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}

		player.setLastFlagReached(this.lastFlagReached++);
		removeFlag();
	}

	public void removeFlag() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		for (int element = 0; element < this.list.size(); element++) {
			if (this.list.get(element) instanceof Flag) {
				list.remove(element);
				break;
			}
		}
	}

	public void removeFoodStation() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		for (int element = 0; element < this.list.size(); element++) {
			if (this.list.get(element) instanceof FoodStation) {
				list.remove(element);
				player.setLastFlagReached(this.lastFlagReached++);
				break;
			}
		}
	}

	public void Map() {
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}
		System.out.println("Displaying Map:");
		for (int element = 0; element < this.list.size(); element++) {
			System.out.println(this.list.get(element).toString());

		}

	}

	public void playerHit() // spider hits ladybug
	{
		if (playerCount == 0) {
			System.out.println("there is no LadyBug.");
		}

		player.minusHealthLevel();
		if (player.getHealthLevel() == 0) {
			lives--;
		}
		if (lives <= 0) {
			System.out.println("You Lost! Quit to restart");
		}
	}
}