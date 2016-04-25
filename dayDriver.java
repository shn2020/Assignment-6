import javax.swing.JOptionPane;

public class dayDriver {
	public static void main(String[] args) {
		JOptionPane JOPane;
		Day.weekDay[] choices = {Day.weekDay.MON, Day.weekDay.TUE, 
				Day.weekDay.WED, Day.weekDay.THU, Day.weekDay.FRI,
				Day.weekDay.SAT, Day.weekDay.SUN};
		Day.weekDay day = (Day.weekDay) JOptionPane.showInputDialog(null,"Select day","Day",
				JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		int addDay = (Integer.parseInt(JOptionPane.showInputDialog("Enter number of day to add: ")));
		Day weekday = new Day(day);
		System.out.println("Day chosen: " + Day.printDay(weekday.returnDay()));
		System.out.println("Next day: " + Day.printDay(weekday.returnNextDay()));
		System.out.println("Previous day: " + Day.printDay(weekday.returnPreviousDay()));
		System.out.println("Next " + addDay + " day : " + Day.printDay(weekday.returnAddDay(addDay)));
		
		
	}
}
