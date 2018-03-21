package com.mycompany.Starter;

import java.util.Observer;
import java.util.Observable;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.charts.util.ColorUtil;

public class ScoreView extends Container implements Observer {
	private Label numberAst;
	private Label sound;

	public ScoreView() {
		numberAst = new Label("LadyBug XXX");
		sound = new Label("Sound: XXX");
		numberAst.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		sound.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		this.add(numberAst);
		this.add(sound);
	}

	public void update(Observable o, Object arg) {
		//// cant type caste gameworld to observable ????
		// GameWorld gw = (GameWorld) o;
		// int numberofFoodStations = ((GameWorld)o).getAsteroidCount();
		// numberAst.setText("Number of Asteroid: " + Integer.toString(numberofAst));
		// if (gw.getSound() == true) {
		// sound.setText("Sound: ON");
		//
		// } else {
		// sound.setText("Sound: OFF");
		// }
	}
}
