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
	private static final int MIN_FOR = 5;
	private static final int MAX_FOR = 10;
	List<Participant> Participants = new ArrayList<Participant>();

	private static Random RND = new Random();

	private static final long serialVersionUID = 4179378993475675411L;

	public void run() {

		GRect r = new GRect(300, 10);
		r.setLocation(490, 350);
		Corda c = new Corda(r);
		add(r);

		Joc j = new Joc(c);

		int persones = totalParticipants();

		System.out.println(persones);

		for (int i = 0; i < persones; i++) {

			GImage img = new GImage("pawn-147060_1280.png");
			img.scale(0.05);
			add(img);

			Participants.add(crearParticipant(img));

		}

		j.crearEquip(Participants);

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
