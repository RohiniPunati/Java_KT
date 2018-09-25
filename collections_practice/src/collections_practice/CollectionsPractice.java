package collections_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.print.attribute.HashAttributeSet;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionsPractice {
	public static void main(String[] args) {
		//ArrayList(generic ArrayList)
		ArrayList<String> al =new ArrayList<String>();
		al.add("Rohini");
		al.add("Adhvik");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Aswini");
		al1.add("Nag");
		al.addAll(al1);
		System.out.println(al);
		ArrayList<Integer> ali=new ArrayList<Integer>();
		ali.add(12);
		ali.add(122);
		ArrayList<Integer> ali1=new ArrayList<Integer>();
		ali1.add(56);
		ali.addAll(ali1);
		System.out.println(ali);
		//LinkedList
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(2);
		ll.add(6);
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll1.add(3);
		ll1.add(5);
		ll.addAll(ll1);
		System.out.println(ll);
		//NonGenericArrayList
		ArrayList gal=new ArrayList();
		gal.add("Rohini");
		gal.add(14);
		System.out.println(gal);
		//Iterator
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");
		  for(String s:list){
			  System.out.println("For Each loop data :"+s);
		  }
//		 System.out.println( al.retainAll(al1));
//		  
//		 al.removeAll(al1);
//		 System.out.println(al);
		  ListIterator<String> li=list.listIterator();
		while(li.hasNext()){
			System.out.println("while loop data :"+li.next());
		}
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(50);
		hs.add(60);
		hs.add(70);
		Iterator<Integer> itr= (Iterator) hs.iterator();
		while(itr.hasNext()){
			System.out.println("Hashset example data : "+itr.next());
		}
	}
}
