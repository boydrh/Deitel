package chapter04;

public class StudentTest {
	
	public static void main(String[] args){
		Student account1 = new Student("Jane Green", 98.0);
		Student account2 = new Student("John Blue", 72.75);
		
		System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());
	}

}
