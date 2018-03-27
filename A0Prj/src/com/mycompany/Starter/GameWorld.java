package com.mycompany.Starter;

import java.util.Observable;
import com.mycompany.Starter.LadyBug;
import com.mycompany.Starter.GameObject;
import com.mycompany.Starter.FoodStation;
import com.mycompany.Starter.Moveable;
import com.mycompany.Starter.Spider;
import com.mycompany.Starter.Flag;
import com.mycompany.Starter.GameObjectCollection;

public class GameWorld extends Observable {

	private LadyBug player;
	private int lives = 3;
	private int ladyBugCounter = 0; // error checking so we dont add stuff before a ladybug
	private int time = 0;
	private int lastFlagReached = 0;
	private boolean soundOn;

	private GameObjectCollection collection;

	public GameWorld() {

		// deprecate arraylist
		this.collection = new GameObjectCollection();
	}

	public GameObjectCollection getGameObjects() // returns set of entire objects in collection
	{
		return collection; // return type is GameObjectCollection
	}

	public boolean getSound() {
		return soundOn;
	}

	public void toggleSound(boolean toggle) {
		this.soundOn = toggle;
		updateWorld();

	}

	public void init() {

		updateWorld();
	}

	public void quit() {
		System.out.println("Press 'y' to quit, 'n' to cancel"); // Exit message

	}

	public void quit2()// System exit function
	{
		System.exit(0);
	}

	public void updateWorld() {
		setChanged();
		notifyObservers();
	}

	public void increaseSpeed() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		} else {
			player.increaseSpeed();
			System.out.println(player.toString());
		}

	}

	public void decreaseSpeed() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		} else {
			player.decreaseSpeed();
			System.out.println(player.toString());
		}
	}

	public void addFoodStation() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}
		FoodStation foodstation = new FoodStation();
		this.collection.add(foodstation); // switched arraylist for collection.add()
		System.out.println(foodstation.toString());
		updateWorld();

	}

	public void addFlag() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}
		Flag flag = new Flag(1, 2);
		this.collection.add(flag); // switched arraylist for collection.add()
		System.out.println(flag.toString());
		updateWorld();

	}

	public void addSpider() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		} else {
			Spider spider = new Spider();
			this.collection.add(spider); // switched arraylist for collection.add()
			System.out.println(spider.toString());
			updateWorld();
		}

	}

	public void addLadyBug()// LadyBug (the player) is created
	{
		if (ladyBugCounter == 0) {
			player = new LadyBug();
			collection.add(player); // switched arraylist to this.collection.add()
			ladyBugCounter++;
			System.out.println(player.toString());
			setChanged();
			notifyObservers(player);
		} else {
			System.out.println("Error: LadyBug cannot be created");
		}
	}

	public void steerLeft() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}
		player.leftHeading();
		System.out.println(player.toString());
	}

	public void steerRight() {
		if (ladyBugCounter == 0) {
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

	// implementing getters for Observable class
	public int getHealthLevel() {

		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
			return 0;
		} else {
			return player.getHealthLevel();
		}
	}

	public int getLastFlagReached() {

		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}

		return player.getLastFlagReached();
	}

	public int getfoodLevel() {

		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
			return 0;
		} else {
			return player.getFoodLevel();
		}
	}

	public int getTime() {

		return this.time;
	}

	public int getLivesLeft() {

		return this.lives;
	}

	// tick function will iterate through collection and update any state changes
	public void tick() {

		MyIterator myIterator = (MyIterator) collection.getIterator();

		while (myIterator.hasNext()) {
			GameObject item = myIterator.getNext(); // testing for instances of certain objects
			if (item instanceof Moveable) {
				Moveable move = (Moveable) item;
				move.move();
			}
			if (item instanceof LadyBug) {
				int newFoodLevel = this.player.getFoodLevel() - this.player.getfoodConsumptionRate();
				this.player.subFoodLevel(newFoodLevel);

			}
		}

		time++; // increment time
		System.out.println("Clock has ticked");

	}

	public void hitFlag() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}

		player.setLastFlagReached(this.lastFlagReached++);
		removeFlag();
	}

	public void removeFlag() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}

		// removing 1 flag from the collection
		MyIterator myIterator = (MyIterator) collection.getIterator();
		while (myIterator.hasNext()) {
			GameObject item = myIterator.getNext();
			if (item instanceof Flag) {
				collection.remove(item);
				break;
			}
		}
	}

	public void hitFoodStation() {

		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}

		player.setFoodLevel();
		removeFoodStation();
	}

	public void removeFoodStation() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}

		// removing 1 food station from collection
		MyIterator myIterator = (MyIterator) collection.getIterator();
		while (myIterator.hasNext()) {
			GameObject item = myIterator.getNext();
			if (item instanceof FoodStation) {
				collection.remove(item);
				break;
			}
		}
	}

	public void Map() {
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}
		System.out.println("Displaying Map:");

		// iterate through entire collection to display their toStrings()
		MyIterator myIterator = (MyIterator) collection.getIterator();
		while (myIterator.hasNext()) {

			GameObject itemInCollection = myIterator.getNext();
			System.out.println(itemInCollection.toString());

		}
	}

	public void playerHit() // spider hits ladybug
	{
		if (ladyBugCounter == 0) {
			System.out.println("there is no LadyBug.");
		}

		player.minusHealthLevel();
		if (player.getHealthLevel() == 0) {
			lives--;
		}
		if (lives <= 0) {
			System.out.println("You Lost! Quit to restart");
		}

		System.out.println("Player was hit by spider");
		player.minusHealthLevel();

	}

	public void addObserver(Observer obj) {
		// TODO Auto-generated method stub

	}

	public void notifyObserver() {
		// TODO Auto-generated method stub

	}
}