package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AccelerateCommand extends Command {
	private static GameWorld game;
	private static AccelerateCommand accelerate; //instance of the current object to call and return an increaseSpeed()
	private GameWorld gw;

	public AccelerateCommand(GameWorld gw) {
		super("accelerate"); // set text in parent button class
		this.gw = gw; // new gameworld instance
	}

	public static AccelerateCommand getInstance(GameWorld gw) { //return type is of AccelerateCommand object

		return (accelerate == null) ? accelerate = new AccelerateCommand(gw) : accelerate; // ternary syntactic sugar
	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

	public void actionPerformed(ActionEvent event) { //call increase speed function in gameworld when onClick event is fired
		gw.increaseSpeed();
	}
}