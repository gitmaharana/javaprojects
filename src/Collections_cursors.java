import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Collections_cursors {

	public static void main(String[] args) {

		// Special characteristics added to collections framework. Cursors are used to retrieve elements one by one from collection
		// 2 types - Iterator & ListIterator
		//Iterator is an interface which is used to traverse the list in forward direction.
		//ListIterator is an interface which provides the facility to traverse the list in forward as well as backward direction.

		ArrayList <String>a1 = new ArrayList<>();//String array list

		a1.add("Rocky");
		a1.add("Joy");
		a1.add("Sam");
		a1.add("Dan");


		Collections.sort(a1);// sort the collections alphabetical order
		System.out.println("Increasing sorted order : "+a1);
		Collections.reverse(a1);// reverse the collections
		System.out.println("Reverse sorted order : "+a1);

		System.out.println("Objects from forward direction");
		
		Iterator it2 = a1.iterator();// Create object for Iterator interface
		
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		System.out.println("Size of the list is :" +a1.size());
		System.out.println("Array list is :" +a1);

		ListIterator it1 = a1.listIterator();// Create object for ListIterator interface

		while (it1.hasNext())

		{
			System.out.println(it1.next());
		}
		System.out.println("Object from backward direction");
		while (it1.hasPrevious())

		{
			System.out.println(it1.previous());
		}


	}

}
