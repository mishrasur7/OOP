package Chapter_10;

import java.util.ArrayList;

public class Crew {
	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

	public Crew() {
	
	}

	public void addCrewMember(Sailor sailor) {
		sailorList.add(new Sailor(sailor.getName(),sailor.getEmail()));
	}
	
	public String toString() {
		String outPut = ""; 
		for(Sailor sailor : sailorList) {
			outPut += sailor.getName() + " (" + sailor.getEmail() + ")" + "\n"; 
		}
		return outPut; 
	}

}
