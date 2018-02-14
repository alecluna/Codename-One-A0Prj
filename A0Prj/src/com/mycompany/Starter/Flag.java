package com.mycompany.Starter;

public class Flag extends GameObject{

	private int height;
	private int width;
	
	public Flag(int height, int width){
		
		this.height = height;
		this.width = width;
	}
	@Override
	public int size() {

		return this.height * this.width;
	}
	
	public int getSize() {

		return this.size();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double location() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}