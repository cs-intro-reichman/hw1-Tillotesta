// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		double current = Double.parseDouble(args[0]);
		double interest = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);

		if (current <= 0) {
			System.err.println("Invalid number. Must be posistive.");
			return;
		}

		if (interest < 0) {
			System.err.println("Invalid number. Interest rate must be posistive.");
			return;
		}

		if (n < 0) {
			System.err.println("Invalid number. Number of years must be posistive.");
			return;
		}
		

		//Math.abs
		//double newInterest = interest/100;
		//double value = current * math.pow((1 + newinterest) ,n);
		
		//System.out.println((int) value);
		
		System.out.println(current+interest+n);
	}
}