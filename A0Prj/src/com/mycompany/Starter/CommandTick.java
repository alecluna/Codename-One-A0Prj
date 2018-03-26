package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class CommandTick extends Command {
	private static GameWorld game;
	private static CommandTick tick;
	private GameWorld gw;

	public CommandTick(GameWorld gw) {
		super("Tick the clock "); // set text in parent button class
		this.gw = gw; // new gameworld instance
	}

	public static CommandTick getInstance(GameWorld gw) {

		return (tick == null) ? tick = new CommandTick(gw) : tick; // ternary syntactic sugar
	}

	public static void setPlace(GameWorld gw) {
		if (game == null) 
			game = gw;
	}

	public void actionPerformed(ActionEvent event) { //call when onlcick event is fired
		gw.tick();
	}
}