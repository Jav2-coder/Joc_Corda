package net.jimenez.corda;

import java.awt.Color;

import acm.graphics.GRect;

public class Corda {

	int posX;
	int posY;
	int w;
	int h;

	public Corda(int x, int y, int width, int height) {

		posX = x;
		posY = y;
		w = width;
		h = height;

	}

	public GRect crearCorda() {

		GRect r = new GRect(w, h);
		r.setFilled(true);
		r.setFillColor(Color.YELLOW);
		r.setLocation(posX, posY);
		return r;

	}

}
