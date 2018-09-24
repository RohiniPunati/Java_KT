package collections_practice;

//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetPractice {
	

public static void main(String[] args) {
//	LinkedHashSet<Book> book=new LinkedHashSet<Book>();
	TreeSet<Book> set = new TreeSet<Book>();
	Book b1=new Book("C ",240.65f,5);
	Book b2=new Book("Java ",300.54f,76);
	set.add(b2);
	set.add(b1);
	for(Book b:set){
		System.out.println("Book Name : "+b.bookName+",Book Price : "+b.bookPrice+",Book ID : "+b.bookId);
	}
}
}
