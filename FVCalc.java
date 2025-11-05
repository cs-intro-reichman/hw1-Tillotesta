// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		double current = Double.parseDouble(args[0]);
		double interest = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		

		double newInterest = interest/100;
		double value = current * Math.pow((1 + newInterest) ,n);
		
		System.out.println((int) value);
		System.out.println("After " + (int)n + " years, $" + (int)current + " saved at " + interest + "% will yield " + (int)value + ".");

	}
}