package net.jimenez.corda;

import java.util.List;

public class Equip {

	List<Participant> Equip;
	
	public Equip(List<Participant> E) {
		
		Equip = E;
		
	}
	
	public int totalFue(){
		
		int Fue = 0;
		
		for(int i = 0; i < Equip.size(); i++){
			
			Fue = Fue + Equip.get(i).getFue();
			
		}
		
		return Fue;
		
	}
	
}
