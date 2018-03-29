package com.mycompany.Starter;

import com.codename1.ui.Form;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;
import com.codename1.ui.Command;
import com.codename1.ui.CheckBox;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Container;
import com.codename1.ui.geom.Dimension;
import com.codename1.ui.layouts.Layout;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import java.util.*;

public class Game extends Form {
	private GameWorld gw;
	// private MapView mv; need to build this
	private ScoreView scoreview;
	private MapView mapview;
	private static int mapWidth;
	private static int mapHeight;

	// @SuppressWarnings("deprecation")
	public Game() {
		gw = new GameWorld();
		gw.init();

		mapview = new MapView(); // create an “Observer” for the map sv = new ScoreView();
		scoreview = new ScoreView();

		Form title = new Form("LadyBug");
		this.setLayout(new BorderLayout());

		Container westContainer = new Container(); // east container
		westContainer.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

		// accelerate command
		Button accelerateButton = new Button("Accelerate");
		accelerateButton.setCommand(AccelerateCommand.getInstance(gw));
		accelerateButton.getAllStyles().setBgTransparency(255);
		accelerateButton.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		accelerateButton.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));

		// left command
		Button leftButton = new Button("Left");
		leftButton.setCommand(LeftCommand.getInstance(gw));
		leftButton.getAllStyles().setBgTransparency(255);
		leftButton.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		leftButton.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));

		// inner west buttons - accelerate and left
		Container innerWestContainer = new Container();
		innerWestContainer.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
		innerWestContainer.add(accelerateButton);
		innerWestContainer.add(leftButton);
		westContainer = FlowLayout.encloseMiddle(innerWestContainer);
		westContainer.getAllStyles().setBorder(Border.createLineBorder(1, ColorUtil.rgb(0, 0, 0)));
		this.add(BorderLayout.WEST, westContainer);

		// eastern border layout
		Container eastContainer = new Container();
		eastContainer.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
		//
		// //brake
		Button brakeButton = new Button("Brake");
		brakeButton.setCommand(BrakeCommand.getInstance(gw));
		brakeButton.getAllStyles().setBgTransparency(255);
		brakeButton.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		brakeButton.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));

		// right command
		Button rightButton = new Button("Right");
		rightButton.setCommand(RightCommand.getInstance(gw));
		rightButton.getAllStyles().setBgTransparency(255);
		rightButton.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		rightButton.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));
		//
		// inner east buttons - brake and right
		// Container innerEastContainer = new Container();
		// innerEastContainer.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
		eastContainer.add(brakeButton);
		eastContainer.add(rightButton);
		// eastContainer = FlowLayout.encloseMiddle(innerEastContainer);
		eastContainer.getAllStyles().setBorder(Border.createLineBorder(1, ColorUtil.rgb(0, 0, 0)));
		this.add(BorderLayout.EAST, eastContainer);

		Container center = new Container();
		center.getAllStyles().setBorder(Border.createLineBorder(3, ColorUtil.rgb(255, 102, 255)));
		center.add(mapview);
		this.add(BorderLayout.CENTER, center);

		Container south = new Container();
		south.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		////
		Button tickPress = new Button("Tick the Clock");
		tickPress.getAllStyles().setBgTransparency(255);
		tickPress.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		tickPress.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));
		tickPress.setCommand(CommandTick.getInstance(gw)); // click event is fired and calls tick();
		// tickPress.getAllStyles().setPadding(TOP, 2);
		// tickPress.getAllStyles().setPadding(BOTTOM, 2);

		Button collisionFlag = new Button("Collide with Flag");
		collisionFlag.getAllStyles().setBgTransparency(255);
		collisionFlag.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		collisionFlag.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));
		collisionFlag.setCommand(CollisionFlagCommand.getInstance(gw)); // click event is fired and calls tick();
		// collisionFlag.getAllStyles().setPadding(TOP, 2);
		// collisionFlag.getAllStyles().setPadding(BOTTOM, 2);

		Button collisionFoodStation = new Button("Collide with Flag");
		collisionFoodStation.getAllStyles().setBgTransparency(255);
		collisionFoodStation.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		collisionFoodStation.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));
		collisionFoodStation.setCommand(CollisionFoodStationCommand.getInstance(gw)); // click event is fired and calls
																						// tick();
		// collisionFoodStation.getAllStyles().setPadding(TOP, 2);
		// collisionFoodStation.getAllStyles().setPadding(BOTTOM, 2);

		Button collisionSpider = new Button("Collide with Flag");
		collisionSpider.getAllStyles().setBgTransparency(255);
		collisionSpider.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));
		collisionSpider.getAllStyles().setFgColor(ColorUtil.rgb(250, 250, 250));
		collisionSpider.setCommand(CollisionSpiderCommand.getInstance(gw)); // click event is fired and calls tick();
		// collisionSpider.getAllStyles().setPadding(TOP, 2);
		// collisionSpider.getAllStyles().setPadding(BOTTOM, 2);

		Container innerSouthContainer = new Container();
		innerSouthContainer.setLayout(new FlowLayout());
		innerSouthContainer.add(tickPress);
		innerSouthContainer.add(collisionFlag);
		innerSouthContainer.add(collisionFoodStation);
		innerSouthContainer.add(collisionSpider);
		south = FlowLayout.encloseCenterMiddle(innerSouthContainer);
		south.getAllStyles().setBorder(Border.createLineBorder(1, ColorUtil.rgb(0, 0, 0)));
		this.add(BorderLayout.SOUTH, south);

		mapWidth = center.getWidth();
		mapHeight = center.getHeight();

		gw.addObserver(mapview);
		gw.addObserver(scoreview);

		//northern container holding game data 
		Container northContainer = new Container();
		northContainer.setLayout(new FlowLayout());
		northContainer.getAllStyles().setBorder(Border.createLineBorder(1));
		northContainer.getUnselectedStyle().setBgColor(ColorUtil.rgb(102, 153, 255));

		Label timeAmount = new Label("Time: " + gw.getTime());
		northContainer.add(timeAmount);
		Label livesAmount = new Label("Lives Left: " + gw.getLivesLeft());
		northContainer.add(livesAmount);
		Label foodLevel = new Label("Food Level: " + gw.getfoodLevel());
		northContainer.add(foodLevel);
		Label healthAmount = new Label("Health Amount:  " + gw.getHealthLevel());
		northContainer.add(healthAmount);

		this.add(BorderLayout.NORTH, northContainer);

		Toolbar sideMenuToolbar = new Toolbar(); 
		setToolBar(sideMenuToolbar);
		sideMenuToolbar.setTitle("LadyBug");
		sideMenuToolbar.getAllStyles().setPadding(0, 0, 0, 300);

		CheckBox soundToggle = new CheckBox("Turn sound ON/OFF");
		sideMenuToolbar.addComponentToSideMenu(soundToggle);
		soundToggle.setCommand(SoundCommand.getInstance(gw));
		soundToggle.getAllStyles().setBgTransparency(255);
		sideMenuToolbar.setTitleCentered(true);

		Button addLadybug = new Button("Add a LadyBug");
		addLadybug.setCommand(AddLadyBugCommand.getInstance(gw));
		sideMenuToolbar.addComponentToSideMenu(addLadybug);
		addLadybug.getAllStyles().setBgTransparency(255);

		Button sideQuit = new Button("Quit");
		sideQuit.setCommand(QuitCommand.getInstance(gw));
		sideMenuToolbar.addComponentToSideMenu(sideQuit);
		sideQuit.getAllStyles().setBgTransparency(255);

		this.show();

	}

	public static int getMapWidth() {
		return mapWidth;
	}

	public static int getMapHeight() {
		return mapHeight;
	}

	/*
	 * public class GameWorld extends Observable { public void init(){ //code here
	 * to create the initial game objects } // additional methods here to manipulate
	 * game objects and related game state data } }
	 * 
	 * 
	 * public class ScoreView extends Container implements Observer { public void
	 * update (Observable o, Object arg) { // code here to update labels from the
	 * game state data } } }
	 */

	// private void play() {
	// Label myLabel = new Label("Press S to create a LadyBug: "); // taken from
	// notes
	// this.addComponent(myLabel);
	// final TextField myTextField = new TextField();
	// this.addComponent(myTextField);
	// this.show();
	//
	// myTextField.addActionListener(new ActionListener() {
	//
	// public void actionPerformed(ActionEvent evt) {
	//
	// String sCommand = myTextField.getText().toString();
	//
	// myTextField.clear();
	// switch (sCommand.charAt(0)) {
	//
	// case 's':
	// gw.addLadyBug(); // add ladybug
	// break;
	// case 'z':
	// gw.addSpider(); // press z to add spider
	// break;
	// case 'a':
	// gw.increaseSpeed(); // accelerate ladybug
	// break;
	// case 'b':
	// gw.decreaseSpeed(); // brake, slow down ladybug
	// break;
	// case 'l':
	// gw.steerLeft(); // turn left
	// break;
	// case 'r':
	// gw.steerRight(); // turn left
	// break;
	// case '3':
	// gw.hitFlag(); // simulate flag hit
	// break;
	// case 'f':
	// gw.removeFoodStation(); // remove flag
	// break;
	// case 'g':
	// gw.playerHit(); // simulates spider hit player
	// break;
	// case 't':
	// gw.tick(); // game has ticked
	// break;
	// case 'd':
	// gw.displayGame(); // displays game info
	// break;
	// case 'm':
	// gw.Map();// print a map showing current world state
	// break;
	//
	// case 'q':
	// gw.quit();
	//
	// final TextField myTextField2 = new TextField(); // will ask the user if they
	// want to quit, then will
	// // have to confirm
	// addComponent(myTextField2);
	// removeComponent(myTextField);
	// show();
	// myTextField2.addActionListener(new ActionListener() {
	// public void actionPerformed(ActionEvent evt2) {
	// String sCommand2 = myTextField2.getText().toString();
	//
	// myTextField2.clear();
	//
	// if (sCommand2.charAt(0) == 'y') { // displays the yes or no for if the user
	// wants to quit
	// gw.quit2();
	// } else if (sCommand2.charAt(0) == 'n') {
	// addComponent(myTextField);
	// removeComponent(myTextField2);
	// show();
	// }
	//
	// }
	// });
	// break;
	//
	// }
	//
	// }
	// });
	// }
}