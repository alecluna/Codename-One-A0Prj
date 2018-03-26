package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class CollisionSpiderCommand extends Command {
	private static GameWorld game;
	private static CollisionSpiderCommand spiderHit;
	private GameWorld gw;

	public CollisionSpiderCommand(GameWorld gw) {
		super("Collide with Spider"); // set text in parent button class
		this.gw = gw; // new gameworld instance
	}

	public static CollisionSpiderCommand getInstance(GameWorld gw) {

		return (spiderHit == null) ? spiderHit = new CollisionSpiderCommand(gw) : spiderHit; // ternary syntactic sugar
	}

	public void actionPerformed(ActionEvent event) { // call when onlcick event is fired
		gw.playerHit();
	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

}