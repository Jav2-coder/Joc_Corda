package net.jimenez.corda;

import java.util.Random;

import acm.graphics.GImage;

/**
 * 
 * @author alumne1daw
 *
 */
public class Participant {

	int posX;
	int posY;
	int Fue;
	GImage img;

	/**
	 * Constructor principal de Participant, on l'hi passem 2 atributs.
	 * 
	 * @param f
	 *            Força maxima que te l'objecte Participant.
	 * @param imatge
	 *            GImatge que te l'objecte Participant.
	 */
	public Participant(int f, GImage imatge) {

		Fue = f;
		img = imatge;
	}

	/**
	 * Metode que retornara una força aleatoria, prenent com a referencia la
	 * força maxima de l'objecte Participant.
	 * 
	 * @return
	 */
	public int getFue() {

		Random rnd = new Random();

		int fueMom = rnd.nextInt(Fue) + 1;

		return fueMom;

	}

	/**
	 * Metode que posiciona el GImatge de l'ojbjecte Participant dins del 
	 * canvas de l'App.
	 * 
	 * @param x Integer que posiciona lobjecte en l'eix X
	 * @param y Integer que posiciona lobjecte en l'eix Y
	 */
	public void setPos(int x, int y) {

		posX = x;
		posY = y;
		img.setLocation(posX, posY);

	}

	/**
	 * Metode que ens retorna l'amplada del GImage.
	 * 
	 * @return
	 */
	public int widthImg() {

		int w = (int) img.getWidth();

		return w;

	}

	/**
	 * Metode que ens retorna la posició X de l'objecte Participant.
	 * 
	 * @return
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * Metode que ens retorna l'alçada del GImage.
	 * 
	 * @return
	 */
	public int heightImg() {

		int h = (int) img.getHeight() / 2;

		return h;

	}
}
