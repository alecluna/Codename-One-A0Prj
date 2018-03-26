package com.mycompany.Starter;

import com.mycompany.Starter.GameObject;
import com.mycompany.Starter.MyIterator;

public interface MyCollection {
	
	void add(GameObject gameObject);

	MyIterator getIterator();

}
