package collections_practice;
import java.util.*;
public class Book implements Comparable<Book>{

	String bookName;
	float bookPrice;
	int bookId;
	Book(String bName,float bPrice,int bId){
		bookName=bName;
		bookPrice=bPrice;
		bookId=bId;
	}
public int compareTo(Book b){
	if(bookId!=0.0){
		System.out.println("Book ID : "+bookId);
		
	}
	return 1;
}

}
