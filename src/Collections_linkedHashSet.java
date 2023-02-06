import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class Collections_linkedHashSet {

	//It is a class which extends HashSet and implements set interface.Duplicates are not allowed.
	
	public static void main(String[] args) {
		
		LinkedHashSet s1 = new LinkedHashSet<> ();
		
		s1.add("Rohan");
		s1.add("Riya");
		s1.add("Pooja");
		s1.add(445);
		s1.add('A');
		System.out.println("Hash set objectss are: "+s1);
		
		s1.add("Riya");
		s1.add(445);
		System.out.println("After add duplicates: "+s1);// no duplicates values allowed in Set
		
		s1.add(null);
		s1.add(null);
		System.out.println("After adding null objects: "+s1);// no duplicates null values allowed in Set
		
		System.out.println("-------Forward direction-----");
		Iterator i1=s1.iterator();//Iterator interface is  being used print the  elements in collections
		while(i1.hasNext())
		{
		System.out.println(i1.next());
		
		}

		//Treeset - It is a class which implements set interafce.
		//It allows only homogenous objects i.e it allows only comparable type of objects, if we add heterogeneous objects it gives ClassCastExc.
		//If we add null objects it gives NullPointerException.
		//first()-->provides first object
		//last()--->provides last object
		//pollFirst()-->provides first object and delete it from tree
		//pollLast()--->provides last object and delete it from tree
		
		TreeSet t1 = new TreeSet();
		
		t1.add("Rohan");
		t1.add("Riya");
		t1.add("Pooja");
		t1.add("445");
		t1.add("A");
		
		System.out.println("Elements of Treeset are:"+t1);
		
		Iterator l1 = t1.iterator();//ListIterator interface is not applicable here
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		TreeSet <Object> t3 = new TreeSet<>();
		t3.add("rocky");
		t3.add("Vicky");
		t3.add("doncky");
		t3.add("sonocky");
		
		System.out.println("Elements of Treeset are:"+t3);
		System.out.println(t3.pollFirst());
		System.out.println(t3.pollLast());
		System.out.println(t3.first());
		System.out.println(t3.last());
		
	}

}
