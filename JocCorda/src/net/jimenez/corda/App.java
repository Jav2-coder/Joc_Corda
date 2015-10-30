package net.jimenez.corda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * 
 * @author alumne1daw
 *
 */
public class App extends GraphicsProgram {

	private static final int MIN_PER = 6;
	private static final int MAX_PER = 12;
	private static final int MIN_FOR = 8;
	private static final int MAX_FOR = 10;
	List<Participant> EquipA = new ArrayList<Participant>();
	List<Participant> EquipB = new ArrayList<Participant>();

	private static Random RND = new Random();

	private static final long serialVersionUID = 4179378993475675411L;

	public void init() {

		setSize(1280, 720);
		GRect linia = new GRect(1, getHeight());
		linia.setLocation((getWidth() / 2), 0);
		add(linia);

	}
	
	public void run() {

		GRect r = new GRect(300, 10);
		r.setLocation(490, 350);
		Corda c = new Corda(r);
		add(r);
		
		int persones = totalParticipants();

		for (int i = 0; i < persones; i++) {

			if (i < persones / 2) {

				String blinky = "Blinky2.png";
				String inky = "Inky2.png";
				String pinky = "Pinky2.png";
				String clyde = "Clyde2.png";
				String [] ghosts = {blinky, inky, pinky, clyde};
				
				GImage img = new GImage(ghosts[RND.nextInt(4)]);
				img.scale(0.35);
				add(img);

				EquipA.add(crearParticipant(img));

			} else {
				
				String blinky = "blinky.png";
				String inky = "inky.png";
				String pinky = "pinky.png";
				String clyde = "clyde.png";
				String [] ghosts = {blinky, inky, pinky, clyde};
				
				GImage img = new GImage(ghosts[RND.nextInt(4)]);
				img.scale(0.35);
				add(img);

				EquipB.add(crearParticipant(img));

			}
		}

		Joc j = new Joc(c, EquipA, EquipB);

		while (c.getPosX() < (getWidth() / 2) && (c.getPosX() + c.getWidth()) > (getWidth() / 2)) {

			j.estirarCorda();
			pause(230);

		}
	}

	private Participant crearParticipant(GImage img) {

		int maxFor = RND.nextInt((MAX_FOR - MIN_FOR) + 1) + MIN_FOR;

		Participant P = new Participant(maxFor, img);

		return P;
	}

	private int totalParticipants() {

		int totalPersones = RND.nextInt((MAX_PER - MIN_PER) + 1) + MIN_PER;

		if (totalPersones % 2 != 0) {

			totalPersones = totalPersones - 1;

		}

		return totalPersones;

	}
}
