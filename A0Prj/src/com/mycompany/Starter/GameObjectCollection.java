package com.mycompany.Starter;

import com.mycompany.Starter.GameObject;
import java.util.Vector;

public class GameObjectCollection implements MyCollection{
	@SuppressWarnings("rawtypes")
	private Vector collection;

	@SuppressWarnings("rawtypes")
	public GameObjectCollection() {
		collection = new Vector();
	}

	@SuppressWarnings("unchecked")
	public void add(GameObject newObject) { // pass in new Objects when adding objects in game
		collection.addElement(newObject);
	}

	public boolean remove(GameObject obj) { // remove object in collection
		return collection.remove(obj);
	}

	public GameObjectIterator getIterator() { // create new Iterator that is created below
		return new GameObjectIterator(); // will be using multiple iterators within the program
	}

	public int size() {
		return collection.size();
	}

	public class GameObjectIterator implements MyIterator { // my implementation of an iterator

		private int cur;

		public GameObjectIterator() {
			cur = -1;
		}

		public GameObject getNext() {

			cur++;
			return (GameObject) (collection.elementAt(cur));
		}

		public boolean hasNext() {

			boolean isHasNextTrue = true;
			return (collection.size() < 0 || cur == collection.size() - 1) ? false : isHasNextTrue; // ternary
		}

		// needed to implement iterator
		public void remove() {

		}

		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		// private int cur;
		//
		// public GameObjectIterator() {
		// cur = -1;
		// }
		//

		//

		//
		// public void remove() { // remove is not needed
		//
		// }

	}
}
