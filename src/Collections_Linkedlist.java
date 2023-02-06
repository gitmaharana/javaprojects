import java.util.ArrayList;

public class Collections_Linkedlist {

	public static void main(String[] args) {

		//Collection is nothing but a group of objects represents as single unit.It's main purpose is to store huge amount of data.
		//Collections is used to store heterogeneous data as well as homogeneous data.
		//Collections are numerous (growable in size) and 
		//We should go for collection, when we don't know the elements in advance.
		//All the classes and interfaces of CollectionsFramework are present in java.util package.


		//CollectionsFramework--------->concept
		//Collection------------->Root Interface
		//collections------------------>class

		// Methods used in collections framework
		//add(object):Used to add objects
		//addAll(Collection): Used to copy one collection objects into another
		//remove(Object): Used to Removes object
		//remove(Index): Used to Remove the Object at given index
		//set(Index,Object): it replaces the old object with new object at given index
		//get(index): Retrieves the object at given index
		//isEmpty(): check whether Collections empty or not
		//contains(Object): check whether Object is present or not
		//containsAll(Collection): checks whether content of one collection is present in another collection or not.
		//removeAll(Collection): Removes whole objects of collection
		//size(): Provides size of collection(always calculates from 1)
		//Collections.sort(): Sort the collection in ascending order(In case char's as per unicode order)
		//Collections.reverse(): Sort in reverse way

		// Array List  - implements list interface and all the Array List methods available in javap.java.util.Arraylist
		// Array List allows duplicate value, can add null values and follows insertion order

		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add("Jay");
		a1.add(5345.8098);
		a1.add(4.909);
		System.out.println("Collections objects are :" +a1);

		Integer i=new Integer(100);
		a1.add(i);
		System.out.println("After adding duplicates : "+a1);// duplicate value added

		a1.add(null);
		System.out.println("After adding null : "+a1);//Null value applicable
		a1.remove("Jay");
		System.out.println("After removing : "+a1);//value removed

		a1.remove(i);// Object removed
		System.out.println("After removing numeric object : "+a1);

		a1.set(2,"SQL");// add data in index 2
		System.out.println("After setting object :"+a1);

		a1.add(1,"Full Stack JAVA");// add data in index 1
		System.out.println("After adding at particular index :"+a1);

		ArrayList a2=new ArrayList();// new arraylist created
		a2.addAll(a1);// copy all a1 elements in a2
		System.out.println("After copying :"+a2);

		System.out.println(a2.contains("SQL"));

		System.out.println(a1.isEmpty());

		System.out.println(a1.size());

		for(Object a:a2)// printing Elements using for each loop 
		{
			System.out.println(a);
		}

		for(int j=0;j<a1.size();j++)// printing Elements using for loop

		{
			System.out.println(a1.get(j));
		}

		ArrayList<Integer> c1=new ArrayList<>();// arraylist contains only interger values
		c1.add(111);
		c1.add(222);
		System.out.println("Integer array list : "+c1);

		/*a1.add('A');
		a1.add("Java");*/

		ArrayList<String> c2=new ArrayList<>();// arraylist contains only string values
		c2.add("java");
		c2.add("sql");
		System.out.println("String array list : "+c2);

		ArrayList<Object> c3=new ArrayList<>();// arraylist contains only objects
		c3.addAll(c1);
		c3.addAll(c2);
		System.out.println("Object array list : "+c3);

		//for each loop


	}

}
