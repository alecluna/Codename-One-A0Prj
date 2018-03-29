package com.mycompany.Starter;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class SoundCommand extends Command {
	private GameWorld gw;
	private static SoundCommand sound;

	public SoundCommand(GameWorld gw) {
		super("Toggle Sound");
		this.gw = gw;
	}

	public static SoundCommand getInstance(GameWorld gw) {
	
		if (sound == null) 
			sound = new SoundCommand(gw); 
			return sound;
	}

	public void actionPerformed(ActionEvent event) {
		//toggle the sound function when event is fired
		if (gw.getSound() == false) {
			gw.toggleSound(true);
		} else {
			gw.toggleSound(false);
		}
	}

}