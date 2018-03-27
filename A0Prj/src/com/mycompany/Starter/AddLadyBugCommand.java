package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AddLadyBugCommand extends Command {
	private static GameWorld game;
	private static AddLadyBugCommand addLadybug; //instance of the current object to call and return an increaseSpeed()
	private GameWorld gw;

	public AddLadyBugCommand(GameWorld gw) {
		super("Add Ladybug"); // set text in parent button class
		this.gw = gw; // new gameworld instance
	}

	public static AddLadyBugCommand getInstance(GameWorld gw) { //return type is of AccelerateCommand object

		//return (addLadybug == null) ? addLadybug = new AddLadyBugCommand(gw) : addLadybug; // ternary syntactic sugar
		if(addLadybug == null)
		{
			addLadybug = new AddLadyBugCommand(gw);
		}
		
		return addLadybug;
	}

	public static void setPlace(GameWorld gw) {
		if (game == null)
			game = gw;
	}

	public void actionPerformed(ActionEvent event) { //call increase speed function in gameworld when onClick event is fired
		gw.addLadyBug();
	}
}