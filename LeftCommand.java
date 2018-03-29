package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class LeftCommand extends Command {
	private static GameWorld game;
	private static LeftCommand right;
	private GameWorld gw;

	public LeftCommand(GameWorld gw) { //same code as other Command objects
		super("Left");
		this.gw = gw;
	}

	public static LeftCommand getInstance(GameWorld gw) {

		return (right == null) ? right = new LeftCommand(gw) : right;
	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

	public void actionPerformed(ActionEvent event) {
		gw.steerLeft();
	}
}
