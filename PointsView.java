package com.mycompany.Starter;

import com.codename1.ui.Container;
import com.codename1.ui.Label;
import java.util.Observable;
import java.util.Observer;
import com.codename1.charts.util.ColorUtil;

public class PointsView extends Container implements Observer {
	private Label score;
	private Label scoreData;
	private Label livesLeft;
	private Label time;
	private Label timeValue;
	private Label missiles;
	private Label missileV;
	private Label sound;
	private Label soundV;
	private Label lives;

	public PointsView() {
		lives = new Label("Lives left: ");
		score = new Label("Score: ");
		time = new Label("Time: ");
		missiles = new Label("Missile Count: ");
		sound = new Label("Sound: ");

		livesLeft = new Label("XXX");
		scoreData = new Label("XXX");
		timeValue = new Label("XXX");
		missileV = new Label("XXX");
		soundV = new Label("XXX");

		time.getAllStyles().setFgColor(ColorUtil.BLUE);
		timeValue.getAllStyles().setFgColor(ColorUtil.BLUE);
		timeValue.getAllStyles().setPadding(1, 1, 1, 5);

		score.getAllStyles().setFgColor(ColorUtil.BLUE);
		scoreData.getAllStyles().setFgColor(ColorUtil.BLUE);
		scoreData.getAllStyles().setPadding(1, 1, 1, 5);

		lives.getAllStyles().setFgColor(ColorUtil.BLUE);
		livesLeft.getAllStyles().setFgColor(ColorUtil.BLUE);
		livesLeft.getAllStyles().setPadding(1, 1, 1, 5);

		sound.getAllStyles().setFgColor(ColorUtil.BLUE);
		soundV.getAllStyles().setFgColor(ColorUtil.BLUE);

		missiles.getAllStyles().setFgColor(ColorUtil.BLUE);
		missileV.getAllStyles().setFgColor(ColorUtil.BLUE);
		missileV.getAllStyles().setPadding(1, 1, 1, 5);

		add(score);
		add(scoreData);
		add(time);
		add(timeValue);
		add(lives);
		add(livesLeft);
		add(missiles);
		add(missileV);
		add(sound);
		add(soundV);
	}

	public void update(Observable o, Object j) {
		

		GameWorld gameWorld = (GameWorld) o;
//		timeValue.setText(String.valueOf(gameWorld.getClock()));
//		timeValue.getParent().revalidate();
//
//		livesLeft.setText(String.valueOf(gameWorld.getLives()));
//		livesLeft.getParent().revalidate();
//
//		missileV.setText(String.valueOf(gameWorld.getMissiles()));
//		missileV.getParent().revalidate();
//
//		scoreData.setText(String.valueOf(gameWorld.getScore()));
//		scoreData.getParent().revalidate();
//
//		if (gameWorld.getSoundOn() == false) {
//			soundV.setText("OFF");
//		} else {
//			soundV.setText("ON");
//		}
//		soundV.getParent().revalidate();

	}
}
