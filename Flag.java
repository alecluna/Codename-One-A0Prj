package com.mycompany.Starter;

import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Graphics;

public class Flag extends Fixed{

	private int x;
	private int y;
	private int size;
	private int sequenceNumber;
		
	
	public Flag(int x, int y){ //locations are chosen by user
		
		this.x = x;
		this.y = y;
		this.size = 10; //fixed size for the flags
		sequenceNumber = super.getId();
		super.setLocX(this.x);
		super.setLocY(this.y);
	}
	
	public int getSequenceNumber() {
		
		return this.sequenceNumber;
	}
	
	public int getSize() {

		return this.size;
	}

	public String toString() {
		return ("Flag: loc="+super.getLocX() +", " + super.getLocY() +" color=["+ super.getRed() + ", "+ super.getGreen()+", "
				+ ""+ super.getBlue() + "]" + " Sequence Number= " + getSequenceNumber() + "  Flag Size: " + getSize());
	}
	
	public void draw(Graphics g, Point relativePoint) {
		
			g.setColor(ColorUtil.BLUE);
			int x = (int) (relativePoint.getX() + super.getLocX());
			int y = (int) (relativePoint.getY() + super.getLocY());

			g.fillRect(x, y, 80, 80);
			g.drawRect(x, y, 80, 80);
			// move();

	}
	
	
}