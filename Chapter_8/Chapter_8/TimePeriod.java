package Chapter_8;

public class TimePeriod {
	private int hours; 
	private int minutes; 
	
	public TimePeriod() {
		hours = 0; 
		minutes = 0; 
	}
	
	public void addHours(int hoursToAdd) {
		if(hoursToAdd < 0 || hoursToAdd > 99) {
			hours = hours; 
		} else {
			hours += hoursToAdd;
			if(hours >= 99) {
				hours = 99; 
			}
		}
	}
	
	public void addMinutes(int minutesToAdd) {
		if((minutesToAdd < 0) || (minutesToAdd > 59)) {
			minutes = minutes; 
		} else {
			minutes += minutesToAdd;
			if(minutes > 59) {
				hours++;
				minutes = minutes - 60;
				if(hours > 99) {
					hours = 99;
					minutes = minutes - minutesToAdd + 60; 
				} 
			}
		}
		
	}
	
	public String toString() {
		return hours + " h " + minutes + " min"; 
	}
}
