package net.jimenez.corda;

import java.util.Random;

import acm.graphics.GImage;

public class Participant {

	int posX;
	int posY;
	int Fue;
	GImage img;
	
	public Participant (int f, GImage imatge) {
		
		Fue = f;
		img = imatge;
	}
	
	public int getFue() {
		
		Random rnd = new Random();
		
		int fueMom = rnd.nextInt(Fue) + 1;
		
		return fueMom;
		
	}
	
	public void setPos(int x, int y){
		
		posX = x;
		posY = y;
		img.setLocation(posX, posY);
		
	}
	
	public int widthImg() {
		
		int w = (int) img.getWidth();
		
		return w;
		
	}
	
	public int getPosX() {
		return posX;
	}
	
	public int heightImg() {
		
		int h = (int) img.getHeight() / 2;
		
		return h;
		
	}
}
