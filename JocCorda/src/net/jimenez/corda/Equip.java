package net.jimenez.corda;

import java.util.List;

/**
 * 
 * @author alumne1daw
 *
 */
public class Equip {

	List<Participant> Equip;
	Corda c;

	/**
	 * Constructor principal de l'objecte Equip, on passem un List com a
	 * parametre.
	 * 
	 * @param E List que conte la meitat dels objectes "Participant" totals.
	 */
	public Equip(List<Participant> E, Corda corda) {

		Equip = E;
		c = corda;

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
	
	public void moureEquip(int a, int b) {
		
		int posY = c.getPosY() - Equip.get(0).heightImg();
		
		int mov = a - b;
		
		for(int i = 0; i < Equip.size(); i++) {
			
			Equip.get(i).setPos(Equip.get(i).getPosX() + mov, posY);
			
		}
	}
}
