package net.jimenez.corda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

	private static final int MIN_PER = 6;
	private static final int MAX_PER = 12;
	private static final int MIN_FOR = 8;
	private static final int MAX_FOR = 10;
	List<Participant> EquipA = new ArrayList<Participant>();
	List<Participant> EquipB = new ArrayList<Participant>();

	private static Random RND = new Random();

	private static final long serialVersionUID = 4179378993475675411L;

	public void run() {

		GRect r = new GRect(300, 10);
		r.setLocation(490, 350);
		Corda c = new Corda(r);
		add(r);

		int persones = totalParticipants();

		for (int i = 0; i < persones; i++) {

			if (i < persones / 2) {

				GImage img = new GImage("Pacman.png");
				img.scale(0.13);
				add(img);

				EquipA.add(crearParticipant(img));

			} else {
				
				String blinky = "2469740-blinky.png";
				String inky = "2469741-inky.png";
				String pinky = "2469744-pinky.png";
				String clyde = "2469743-orange.png";
				String [] ghosts = {blinky, inky, pinky, clyde};
				
				GImage img = new GImage(ghosts[RND.nextInt(4)]);
				img.scale(0.25);
				add(img);

				EquipB.add(crearParticipant(img));

			}
		}

		Joc j = new Joc(c, EquipA, EquipB);

		while (c.getPosX() < 640 && (c.getPosX() + c.getWidth()) > 640) {

			j.estirarCorda();
			pause(230);

		}
	}

	public void init() {

		setSize(1280, 720);
		GRect linia = new GRect(1, 720);
		linia.setLocation(640, 0);
		add(linia);

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
