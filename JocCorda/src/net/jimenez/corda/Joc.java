package net.jimenez.corda;

import java.util.List;

/**
 * 
 * @author Surrui
 *
 */
public class Joc {

	List<Participant> EquipA;
	List<Participant> EquipB;
	Corda corda;

	/**
	 * Contructor principal de l'objecte Joc. L'hi passem per parametre
	 * l'objecte Corda i els objectes List EquipA i EquipB. Tambe crida el
	 * metode posicionament.
	 * 
	 * @param c Parametre que conte l'objecte Corda
	 * @param A Parametre que conte el List EquipA
	 * @param B Parametre que conte el List EquipB
	 */
	public Joc(Corda c, List<Participant> A, List<Participant> B) {
		corda = c;
		EquipA = A;
		EquipB = B;
		posicionament();
	}

	/**
	 * Metode encarregat de donar posicions als objectes Participant.
	 */
	private void posicionament() {

		int posA = corda.getPosX();
		int posB = corda.getPosX() + corda.getWidth();
		int posY = corda.getPosY() - EquipB.get(0).heightImg();

		for (int i = 0; i < EquipA.size(); i++) {

			posA = posA - EquipA.get(i).widthImg();

			EquipA.get(i).setPos(posA, posY);
			EquipB.get(i).setPos(posB, posY);

			posB = posB + EquipB.get(i).widthImg();

		}
	}

	/**
	 * Metode que s'encarrega de moure els objectes per el Canvas depenen de la
	 * força total que fan els objectes Participant de cada List.
	 */
	public void estirarCorda() {

		Equip A = new Equip(EquipA, corda);
		Equip B = new Equip(EquipB, corda);

		int fuerEquipA = A.totalFue();
		int fuerEquipB = B.totalFue();

		A.moureEquip(fuerEquipA, fuerEquipB);
		B.moureEquip(fuerEquipA, fuerEquipB);
		corda.setPosition(corda.getPosX() + (fuerEquipA - fuerEquipB), corda.getPosY());
		
	}
}
