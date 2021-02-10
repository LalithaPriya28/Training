package assignment3problem2;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setBookNo(1);
		book.setTitle("The ABC Murders");
		book.setAuthor("Agatha Cristie");
		book.setPrice(350);
		System.out.println(book.getBookNo());
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		
		
		EngineeringBook engineeringBook =new EngineeringBook();
		engineeringBook.setBookNo(1234);
		engineeringBook.setCategory("CSE");
		engineeringBook.setTitle("The Complete Reference of Java");
		engineeringBook.setAuthor("Herbert Schildt");
		engineeringBook.setPrice(545);
		System.out.println(engineeringBook.getBookNo());
		System.out.println(engineeringBook.getCategory());
		System.out.println(engineeringBook.getTitle());
		System.out.println(engineeringBook.getAuthor());
		System.out.println(engineeringBook.getPrice());
	}

}
