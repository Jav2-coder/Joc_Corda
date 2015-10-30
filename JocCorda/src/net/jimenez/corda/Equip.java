package net.jimenez.corda;

import java.util.List;

/**
 * 
 * @author alumne1daw
 *
 */
public class Equip {

	List<Participant> Equip;

	/**
	 * Constructor principal de l'objecte Equip, on passem un List com a
	 * parametre.
	 * 
	 * @param E List que conte la meitat dels objectes "Participant" totals.
	 */
	public Equip(List<Participant> E) {

		Equip = E;

	}

	/**
	 * Metode que retorna la força total feta per tots els objectes Participant
	 * que es troben dins del List Equip.
	 * 
	 * @return
	 */
	public int totalFue() {

		int Fue = 0;

		for (int i = 0; i < Equip.size(); i++) {

			Fue = Fue + Equip.get(i).getFue();

		}

		return Fue;

	}
}
