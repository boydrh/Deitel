package chapter09;

public class CommissionEmployeeTest {
	
	public static void main(String[] args){
		CommissionEmployee employee = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222",1000, 0.6);
		
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n","First name is",employee.getFirstName());
		System.out.printf("%n%s %s%n","Last name is",employee.getLastName());
		System.out.printf("%n%s %s%n","Social Security Number is",employee.getSocialSecurityNumber());
		System.out.printf("%n%s %.2f%n","Gross sales is",employee.getGrossSales());
		System.out.printf("%n%s %.2f%n","Commission Rate is",employee.getCommissionRate());
		
		employee.setGrossSales(5000);
		employee.setCommissionRate(0.1);
		
		System.out.printf("%n%s:%n%n%s%n","Updated employee information obtained by toString", employee);
	}

}
