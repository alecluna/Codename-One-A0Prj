package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class QuitCommand extends Command {
	private static GameWorld gw;
	public static QuitCommand quit;

	public QuitCommand() {
		super("Quit");
	}

	public static QuitCommand getInstance(GameWorld gw) {

		return (quit == null) ? quit = new QuitCommand() : quit; // ternary syntactic sugar

	}

	public static void setPlace(GameWorld gameWorld) {
		if (gw == null)
			gw = gameWorld;

	}

	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}
}