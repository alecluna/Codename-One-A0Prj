package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class BrakeCommand extends Command {
	private static GameWorld game;
	private static BrakeCommand brake;
	private GameWorld gw;

	public BrakeCommand(GameWorld gw) {
		super("Brake");
		this.gw = gw;
	}

	public static BrakeCommand getInstance(GameWorld gw) {
		
		return (brake == null) ? brake = new BrakeCommand(gw) : brake; // ternary syntactic sugar

	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

	public void actionPerformed(ActionEvent event) {
		gw.decreaseSpeed();
	}
}
