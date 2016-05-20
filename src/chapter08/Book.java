package chapter08;

public enum Book {
	JHTP("Java How to Program", "2012"),
	CHTP("C How to Program","2007"),
	IW3HTP("Internet and world wide web How to Program","2008");
	
	private final String title;
	private final String copyrightYear;
	
	Book(String bookTitle, String year){
		title = bookTitle;
		copyrightYear = year;
	}

}
