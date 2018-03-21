package com.mycompany.Starter;

import com.mycompany.Starter.GameObject;
import com.mycompany.Starter.MyIterator;

public interface MyCollection {
	void addGameObject(GameObject gameObject);

	MyIterator getIterator();

}
