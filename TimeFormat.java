// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String ampm;
		int display;
		
		String str = String.valueOf(minutes);
		
		if (minutes < 10) {
			str = "0" + str;
		}


        if (hours == 0) {
			display = 0;
			ampm = "AM";
		
		} else if (hours < 12) {
			display = hours;
			ampm = "AM";

		} else if (hours == 12){
			display = 12;
			ampm = "PM";
	
		} else {
			display = hours - 12;
			ampm = "PM";
		}	
		
		System.out.println(display+":"+str+" "+ampm);
//::error::The output for test TimeFormat test 2: Args (12:03) did not match%0AExpected:%0A12:03 PM%0AActual:%0A12:03 AM
		
	}
}
