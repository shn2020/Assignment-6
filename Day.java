public class Day {
	public enum weekDay {MON,TUE,WED,THU,FRI,SAT,SUN};
	weekDay day;
	int dayIndex;
	
	public Day() {
		this.day = weekDay.MON;
		dayIndex = 0;
	}
	
	public Day(weekDay day) {
		this.day = day;
		dayIndex = getIndex(day);
	}
	
	public int getIndex(weekDay day) {
		int iday = 0;
		switch (day) {
		case MON: iday = 0; break;
		case TUE: iday = 1; break;
		case WED: iday = 2; break;
		case THU: iday = 3; break;
		case FRI: iday = 4; break;
		case SAT: iday = 5; break;
		case SUN: iday = 6; break;
		}
		return iday;
	}
	
	public weekDay getDay(int dayIndex) {
		weekDay wday = weekDay.MON;
		switch (dayIndex) {
		case 0: wday = weekDay.MON; break;
		case 1: wday = weekDay.TUE; break;
		case 2: wday = weekDay.WED; break;
		case 3: wday = weekDay.THU; break;
		case 4: wday = weekDay.FRI; break;	
		case 5: wday = weekDay.SAT; break;
		case 6: wday = weekDay.SUN; break;
		}
		return wday;
	}
	
	public void setDay(weekDay newDay) {
		this.day = newDay;
	}
	
	public static String printDay(weekDay day) {
		String pDay = "Monday";
		switch (day) {
		case MON: pDay = "Monday"; break;
		case TUE: pDay = "Tuesday"; break;
		case WED: pDay = "Wednesday"; break;
		case THU: pDay = "Thursday"; break;
		case FRI: pDay = "Friday"; break;
		case SAT: pDay = "Saturday"; break;
		case SUN: pDay = "Sunday"; break;
		}
		return pDay;
	}
	
	public weekDay returnDay() {
		return this.day;
	}
	
	public weekDay returnNextDay() {
		return getDay((getIndex(this.day)+1)%7);
	}
	
	public weekDay returnPreviousDay() {
		return getDay((getIndex(this.day)+6)%7);
	}
	
	public weekDay returnAddDay(int num) {
		return getDay((getIndex(this.day)+num)%7);
	}
	
}
