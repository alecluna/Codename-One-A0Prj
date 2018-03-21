package com.mycompany.Starter;

import java.util.Iterator;
import java.util.Vector;

public class GameObjectCollection {
	private Vector<GameObject> collection;

	public GameObjectCollection() {
		collection = new Vector<GameObject>();
	}

	public void add(GameObject newObject) { //pass in new Objects when adding objects in game
		collection.addElement(newObject);
	}

	public boolean remove(GameObject obj) {
		return collection.remove(obj);
	}

	public Iterator<GameObject> getIterator() {
		return new GameObjectIterator();
	}

	public int size() {
		return collection.size();
	}

	private class GameObjectIterator implements Iterator<GameObject> { // my implementation of an iterator

		private int cur;

		public GameObjectIterator() {
			cur = -1;
		}

		public boolean hasNext() {

			boolean isHasNextTrue = true;
			return (collection.size() < 0 || cur == collection.size() - 1) ? false : isHasNextTrue; // ternary
		}

		public GameObject next() {

			cur++;
			return (collection.elementAt(cur));
		}

		public void remove() { // remove is not needed

		}

	}
}
