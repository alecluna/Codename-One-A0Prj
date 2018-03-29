package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class CollisionFoodStationCommand extends Command {
	private static GameWorld game;
	private static CollisionFoodStationCommand collideFood;
	private GameWorld gw;

	public CollisionFoodStationCommand(GameWorld gw) {
		super("Collide with Food Station"); // set text in parent button class
		this.gw = gw; // new gameworld instance
	}

	public static CollisionFoodStationCommand getInstance(GameWorld gw) {

		return (collideFood == null) ? collideFood = new CollisionFoodStationCommand(gw) : collideFood; // ternary syntactic sugar
	}

	public void actionPerformed(ActionEvent event) { // call when onlcick event is fired
		gw.hitFoodStation();
	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

}