package net.jimenez.corda;

import java.util.List;

public class Joc {

	List<Participant> Participants;
	List<Participant> EquipA;
	List<Participant> EquipB;

	public Joc() {

	}

	public void afegirPersona(Participant p) {

		Participants.add(p);

	}
}
