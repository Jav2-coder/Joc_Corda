package net.jimenez.corda;

import java.awt.Color;

import acm.graphics.GRect;

public class Corda {

	GRect r;	
	
	public Corda(GRect c) {

		r = c;
		r.setFilled(true);
		r.setFillColor(Color.YELLOW);

	}

		
	public void setPosition(int x, int y){
				
		r.setLocation(x, y);
		
	}
	
	public int getPosX(){
		return (int) r.getX();
	}
	
	public int getPosY(){
		return (int) r.getY();
	}
	
	public int getWidth(){
		return (int) r.getWidth();
	}

}
