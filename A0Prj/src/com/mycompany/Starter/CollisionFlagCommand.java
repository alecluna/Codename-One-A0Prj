package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class CollisionFlagCommand extends Command {
	private static GameWorld game;
	private static CollisionFlagCommand collision;
	private GameWorld gw;

	public CollisionFlagCommand(GameWorld gw) {
		super("Collide with Flag"); // set text in parent button class
		this.gw = gw; // new gameworld instance
	}

	public static CollisionFlagCommand getInstance(GameWorld gw) {

		return (collision == null) ? collision = new CollisionFlagCommand(gw) : collision; // ternary syntactic sugar
	}

	public void actionPerformed(ActionEvent event) { // call when onlcick event is fired
		gw.hitFlag();
	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

}