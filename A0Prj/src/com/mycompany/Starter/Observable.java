package com.mycompany.Starter;

public interface Observable {
	public void addObserver(Observer obj);
	public void notifyObserver();
}
