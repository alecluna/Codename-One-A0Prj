package com.mycompany.Starter;

import java.util.Observer;
import java.util.Observable;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.charts.util.ColorUtil;

public class ScoreView extends Container implements Observer {
	private Label foodLevel;
	private Label sound;
	private Label amountOfTime;
	private Label livesLeft;
	private Label healthLevel;
	private Label lastFlagReached;
	private int currentFoodLevel;
	private int currentAmountOfTime;
	private int currentLivesLeft;
	private int currentHealthLevel;
	private int currentLastFlagReached;

	public ScoreView() {
		foodLevel = new Label("Current Food Level: XXX");
		sound = new Label("Sound: XXX");
		amountOfTime = new Label("Current Time: XXX");
		livesLeft = new Label("Number of Lives: XXX");
		healthLevel = new Label("Health Level: XXX");
		lastFlagReached = new Label("Last Flag Reached: XXX");
		foodLevel.getAllStyles().setFgColor(ColorUtil.rgb(77, 166, 255));
		sound.getAllStyles().setFgColor(ColorUtil.rgb(77, 166, 255));
		amountOfTime.getAllStyles().setFgColor(ColorUtil.rgb(77, 166, 255));
		livesLeft.getAllStyles().setFgColor(ColorUtil.rgb(77, 166, 255));
		healthLevel.getAllStyles().setFgColor(ColorUtil.rgb(77, 166, 255));
		lastFlagReached.getAllStyles().setFgColor(ColorUtil.rgb(77, 166, 255));

		this.add(foodLevel);
		this.add(sound);
		this.add(amountOfTime);
		this.add(livesLeft);
		this.add(healthLevel);
		this.add(lastFlagReached);

	}

	public void update(Observable o, Object arg) {

		GameWorld gw = (GameWorld) o;
		this.currentFoodLevel = ((GameWorld) o).getfoodLevel();
		this.currentAmountOfTime = ((GameWorld) o).getTime();
		this.currentLivesLeft = ((GameWorld) o).getLivesLeft();
		this.currentHealthLevel = ((GameWorld) o).getHealthLevel();
		this.currentLastFlagReached = ((GameWorld) o).getLastFlagReached();

		foodLevel.setText("Current Food Level: " + Integer.toString(this.currentFoodLevel));
		amountOfTime.setText("Current Time: " + Integer.toString(this.currentAmountOfTime));
		livesLeft.setText("Number of Lives: " + Integer.toString(this.currentLivesLeft));
		healthLevel.setText("Health Left: " + Integer.toString(this.currentHealthLevel));
		lastFlagReached.setText("Last Flag Reached: " + Integer.toString(this.currentLastFlagReached));

		if (gw.getSound() == true) {
			sound.setText("Sound: ON");
		} else {
			sound.setText("Sound: OFF");
		}
	}
}
