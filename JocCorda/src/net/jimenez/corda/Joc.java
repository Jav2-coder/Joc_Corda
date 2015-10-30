package net.jimenez.corda;

import java.util.ArrayList;
import java.util.List;

public class Joc {

	List<Participant> EquipA = new ArrayList<Participant>();
	List<Participant> EquipB = new ArrayList<Participant>();
	Corda corda;

	public Joc(Corda c) {
		corda = c;
	}

	public void crearEquip(List<Participant> Participants) {

		for (int i = 0; i < Participants.size(); i++) {

			if (i < Participants.size() / 2) {

				EquipA.add(Participants.get(i));

			} else {

				EquipB.add(Participants.get(i));

			}
		}

		posicionament();
	}

	private void posicionament() {

		int posA = corda.getPosX();
		int posB = corda.getPosX() + corda.getWidth();
		int posY = corda.getPosY() - EquipA.get(0).heightImg();

		for (int i = 0; i < EquipA.size(); i++) {

			posA = posA - EquipA.get(i).widthImg();

			EquipA.get(i).setPos(posA, posY);
			EquipB.get(i).setPos(posB, posY);

			posB = posB + EquipB.get(i).widthImg();

		}
	}

	public void estirarCorda() {

		int posY = corda.getPosY() - EquipA.get(0).heightImg();
		Equip A = new Equip(EquipA);
		Equip B = new Equip(EquipB);

		int fuerEquipA = A.totalFue();
		int fuerEquipB = B.totalFue();

		if (fuerEquipA > fuerEquipB) {

			int mov = fuerEquipA - fuerEquipB;

			for (int i = 0; i < EquipA.size(); i++) {

				EquipA.get(i).setPos(EquipA.get(i).getPosX() - mov, posY);
				EquipB.get(i).setPos(EquipB.get(i).getPosX() - mov, posY);
				
			}
			corda.setPosition(corda.getPosX() - mov, corda.getPosY());

		} else {

			int mov = fuerEquipB - fuerEquipA;

			for (int i = 0; i < EquipA.size(); i++) {

				EquipA.get(i).setPos(EquipA.get(i).getPosX() + mov, posY);
				EquipB.get(i).setPos(EquipB.get(i).getPosX() + mov, posY);
				
			}
			corda.setPosition(corda.getPosX() + mov, corda.getPosY());
		}
	}
}
