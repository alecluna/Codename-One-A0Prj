package com.mycompany.Starter;

import com.codename1.ui.Container;
import com.codename1.charts.models.Point;
import com.codename1.ui.Graphics;
import com.codename1.ui.Label;
import com.mycompany.Starter.GameObjectCollection;
import com.mycompany.Starter.GameObjectCollection.GameObjectIterator;

import java.util.Observer;
import java.util.Observable;

public class MapView extends Container implements Observer {

	
	private GameObjectCollection game;

	public MapView() {
	
	}

	public void update(Observable observable, Object data) {

		// updating mapview during state changes within the game
		GameWorld gw = (GameWorld) observable;
		GameObjectCollection gameObjects = gw.getGameObjects(); // return getter function from GameWorld class that
		this.game = 	gameObjects;									// contains all game objects
		GameObjectIterator iIterator = gameObjects.getIterator(); // creating new Iterator from this gameObjects Vector
																	// class
		while (iIterator.hasNext()) {
			System.out.println(iIterator.next());
		}
	}

	public void paint(Graphics g) {
		
		super.paint(g);
		if (game == null) 
			return;
		
		MyIterator it2 = (MyIterator) this.game.getIterator();
		
		while (it2.hasNext()) {
			Point relativePoint = new Point(getX(), getY());
			//it2.getNext().draw(g,relativePoint;)
		}
	}
}
