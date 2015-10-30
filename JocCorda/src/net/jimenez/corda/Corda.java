package net.jimenez.corda;

import java.awt.Color;

import acm.graphics.GRect;

/**
 * 
 * @author alumne1daw
 *
 */
public class Corda {

	GRect r;

	/**
	 * Constructor principal de Corda, on donem com a atributs l'objecte GRect.
	 * 
	 * @param c Paràmetre que conte l'objecte GRect.
	 */
	public Corda(GRect c) {

		r = c;
		r.setFilled(true);
		r.setFillColor(Color.YELLOW);

	}

	/**
	 * Metode que ens permet posicionar la corda en el canvas.
	 * 
	 * @param x Integer que posiciona lobjecte en l'eix X
	 * @param y Integer que posiciona lobjecte en l'eix Y
	 */
	public void setPosition(int x, int y) {

		r.setLocation(x, y);

	}

	/**
	 * Metode que ens retorna la posicio X de l'objecte Corda.
	 * 
	 * @return
	 */
	public int getPosX() {
		return (int) r.getX();
	}

	/**
	 * Metode que ens retorna la posicio Y de l'objecte Corda.
	 * 
	 * @return
	 */
	public int getPosY() {
		return (int) r.getY();
	}

	/**
	 * Metode que ens retorna la llargada de l'objecte Corda.
	 * 
	 * @return
	 */
	public int getWidth() {
		return (int) r.getWidth();
	}

}
