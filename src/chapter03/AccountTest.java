package chapter03;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Welcome to the Jungle!!!");
		// create a Scanner object to obtain inputs from the command window
		Scanner input = new Scanner(System.in);
		
		// create an Account object and assign it to myAccount
		Account myAccount = new Account("Jane green", 1.0);
		
		// display initial value of name (null)
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());;
		
		// prompt for and read name
		System.out.println("Please enter the name:");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();
		
		// display the name stored in object myAccount
		System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
		input.close();
	}
}
