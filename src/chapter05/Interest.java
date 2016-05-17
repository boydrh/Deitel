package chapter05;
import javax.swing.JOptionPane;

public class Interest {
	public static void main(String[] args){
		double amount;
		
		double principal;
		double rate;
		String principalString = JOptionPane.showInputDialog("Principal amount?");
		String rateString = JOptionPane.showInputDialog("Interest Rate?");
		
		principal = Double.parseDouble(principalString);
		rate = Double.parseDouble(rateString);
		
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; year++){
			amount = principal * Math.pow(1.0 + rate, year);
			
			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}
}
