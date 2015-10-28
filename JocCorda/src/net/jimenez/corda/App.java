package net.jimenez.corda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

	private static final int MIN_PER = 4;
	private static final int MAX_PER = 12;
	private static final int MIN_FOR = 5;
	private static final int MAX_FOR = 10;
	
	private static final long serialVersionUID = 4179378993475675411L;

	public void run() {
		
		Random rnd = new Random();

		Corda c = new Corda(490, 350, 300, 10);
		add(c.crearCorda());
		
		List<Participant> EquipA = new ArrayList<Participant>();
		List<Participant> EquipB = new ArrayList<Participant>();
		
		int persones = totalParticipants(rnd);
		
		System.out.println("Hola");
		
		for (int i = 0; i < persones; i++) {

			int maxFor = rnd.nextInt((MAX_FOR - MIN_FOR) + 1) + MIN_FOR;
			
			Participant P = generarParticipant(maxFor);
			
			if (i < persones / 2) {
				
				EquipA.add(P);
				
			} else {
				
				EquipB.add(P);
				
			}
		}
		
	}
	
	public void init() {
		
		setSize(1280, 720);
		
	}
	
	private int totalParticipants(Random rnd) {
		
		int totalPersones = rnd.nextInt((MAX_PER - MIN_PER) + 1) + MIN_PER;

		if (totalPersones % 2 != 0) {

			totalPersones = totalPersones - 1;

		}
		
		return totalPersones;
		
	}
	
	private Participant generarParticipant(int f) {
		
		GImage img = new GImage("pawn-147060_1280.png");
		img.scale(0.05);
		add(img);
		Participant P = new Participant (f, img);
	    
	    return P;
		
	}

}
