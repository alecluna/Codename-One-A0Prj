package com.mycompany.Starter;

import java.util.Observer;

public interface Observable {
	public void addObserver(Observer obj);
	public void notifyObserver();
}
