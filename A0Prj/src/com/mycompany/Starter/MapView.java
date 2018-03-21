package com.mycompany.Starter;

import com.codename1.ui.Container;
import java.util.Observer;
import java.util.Observable;

public class MapView extends Container implements Observer {
	public MapView() {

	}

	public void update(Observable observable, Object data) {

		//updating mapview during state changes within the game
//		System.out.println("Map Width: " + Game.getMapWidth() + " Map Height: " + Game.getMapHeight());
//		GameWorld gw = (GameWorld) observable;
//		gameCollection go = gw.getGameObjects();
//		Iiterator gameit = go.getIterator();
//		while (gameit.hasNext()) {
//			System.out.println(gameit.getNext());
//		}

	}

}
