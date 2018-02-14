package com.mycompany.Starter;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

public class Game extends Form {
	private GameWorld gw;

	public Game() {
		gw = new GameWorld();
		gw.init();
		play();

	}

	private void play() {
	
		
		Form hi = new Form("mobile App", BoxLayout.y());
		hi.add(new Label("hello"));

		hi.show();

		System.out.println("play() method output from the Game Object\n");

	}
}