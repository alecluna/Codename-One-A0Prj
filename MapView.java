package com.mycompany.Starter;

import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.mycompany.Starter.GameObjectCollection;
import com.mycompany.Starter.GameObjectCollection.GameObjectIterator;

import java.util.Observer;
import java.util.Observable;

public class MapView extends Container implements Observer {

	// private Label mapView;
	// private String currentMapView;

	public MapView() {

		// mapView = new Label("Map");
		// this.add(mapView);
	}

	public void update(Observable observable, Object data) {

		// updating mapview during state changes within the game
		GameWorld gw = (GameWorld) observable;
		GameObjectCollection gameObjects = gw.getGameObjects(); // return getter function from GameWorld class that
																// contains all game objects
		GameObjectIterator iIterator = gameObjects.getIterator(); // creating new Iterator from this gameObjects Vector
																	// class
		while (iIterator.hasNext()) {
			System.out.println(iIterator.next());
		}

	}
}
