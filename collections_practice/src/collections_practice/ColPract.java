package collections_practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Queue;

import org.omg.Messaging.SyncScopeHelper;

public class ColPract {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohini");
		al.add("Premnath");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("34");
		al1.add("33");
		al.addAll(al1);
		System.out.println("al vales are : "+al+", "+al1);
//		al.remove(2);
//		System.out.println("remove al(2) : "+al);
		al.removeAll(al1);
		;
//		al1.removeAll(al1)
		System.out.println("removeAll elements of al1  : "+al);
		ArrayList al2=new ArrayList();
		al2.add("Rohini");
		al2.add(34);
		System.out.println("Non Generic ArrayList is "+al2);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println("itr.next() : "+itr.next());
		}
		for(String s:al){
			System.out.println("for each element "+s);
		}
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		q.add(1);
		q.add(2);
		System.out.println("Priority Queue data is "+q);
		PriorityQueue<String> q1=new PriorityQueue<String>();
//		Book b1=new Book("Rohini",50.23f,32);
//		Book b2=new Book("Adhvik",45.12f,22);
		
		q1.add("Rani");
		q1.add("Raju");
		Iterator itr1=q1.iterator();
		while(itr1.hasNext()){
			System.out.println("Priority queue book details are "+itr1.next());
		} 
		ArrayDeque<Integer> d=new ArrayDeque<Integer>();
		d.add(222);
		d.add(221);
		System.out.println("Deque values are "+d);
		
		//Hashmap
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		if(hm.isEmpty()){
			System.out.println("Hm set is empty ");
		}
		else{
			System.out.println("Hm set has some key value pairs");
		}
		hm.put(2, "Hello ");
		hm.put(4,"Hello world");
		System.out.println("HashMap empty or not? "+hm.isEmpty());
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(14,"ro");
		hm1.put(15,"roh");
		hm.putAll(hm1);
		System.out.println("get value from hashmap for key=15 : "+hm.get(15));
		System.out.println("remove value from hashmap for key=15 : "+hm.remove(15));
		System.out.println("replace hashmap value for key=14 : "+hm.replace(14, "Rohini Punati"));
		System.out.println("After replacing HashMap hm is "+hm);
		
		//LinkedHashMap
		LinkedHashMap lhm=new LinkedHashMap();
		System.out.println("Retrieving values from LinkedHashMap : "+lhm.values());
		
		System.out.println("Retrieving only one values based on key from LinkedHashMap : "+lhm.get(7));
		System.out.println("LinkedHashMap object : "+lhm);
		System.out.println("LinkedHashMap value where key=2 is : "+lhm.containsKey(2));
		LinkedHashMap lhm1=new LinkedHashMap();
		lhm.put(1, "rohini");
		lhm.put("ro",2);
		lhm1.put(3, "Adhvik");
		lhm1.put("Aswini", 4);
		lhm.putAll(lhm1);
		System.out.println("LinkedHashMap after putAll : "+lhm);
		
	}
}
