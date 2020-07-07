import java.util.Scanner;

public class SnailJourney {

	public double daysToTop(double h, double a, double b) {
		
	double days = 0.0;	
	double sum = 0.0;
	
	while(sum!=h) {
		
	sum += a-b;	
		
	days++;	
		
	}
	
	
	return days;	
		
	}
	
	
	
	public static void main(String[] args) {
		
	// Assumes that h > a > b	
	SnailJourney program = new SnailJourney();
		
	Scanner scan = new Scanner(System.in);	
		
	double h = 0;
	double a = 0;
	double b = 0;
	
	String input = scan.nextLine();
	
	String[] values = input.split(",");
	
	h = Double.parseDouble(values[0]);
	a = Double.parseDouble(values[1]);
	b = Double.parseDouble(values[2]);
	
	System.out.println(program.daysToTop(h, a, b));
		
	}
	
	
	
}
