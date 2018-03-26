package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class RightCommand extends Command {
	private static GameWorld game;
	private static RightCommand right;
	private GameWorld gw;

	public RightCommand(GameWorld gw) {
		super("Right");
		this.gw = gw;
	}

	public static RightCommand getInstance(GameWorld gw) {

		return (right == null) ? right = new RightCommand(gw) : right;
	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

	public void actionPerformed(ActionEvent event) {
		gw.steerRight();
	}
}
