package net.jimenez.corda;

import java.util.Random;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

	private static final int MIN_PER = 4;
	private static final int MAX_PER = 12;
	private static final int MIN_FOR = 5;
	private static final int MAX_FOR = 10;
	
	private static Random RND = new Random();

	private static final long serialVersionUID = 4179378993475675411L;

	public void run() {

		Joc j = new Joc();
		Corda c = new Corda(490, 350, 300, 10);
		add(c.crearCorda());

		int persones = totalParticipants();

		System.out.println("Total participants " + persones);

		GImage img = new GImage("pawn-147060_1280.png");
		img.scale(0.05);
		add(img);

		for (int i = 0; i < persones; i++) {

			System.out.println("Entra");
			
			j.afegirPersona(crearParticipant(img));

		}
	}

	public void init() {

		setSize(1280, 720);

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
