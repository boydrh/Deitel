package chapter03;
import javax.swing.JOptionPane;

public class NameDiag {
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Your name, what do?");
		
		String message = String.format("Welcome, %s, to java programming!", name);
		JOptionPane.showMessageDialog(null, message);
	}

}
