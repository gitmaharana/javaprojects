import java.util.HashMap;
import java.util.ListIterator;

public class Collections_Map {

	public static void main(String[] args) {
		
		//Whenever we want to represents objects as key value pair we go for maps.
		// Map is an interface which stores the objects as a key value pair. Each key,value pair is called as entry
		// Map interface is implemented by 3 different classes - HASHMAP/LINKEDHASHMAP/TREEMAP
		//Methods - put(k,V): Used to add objects as key value pair into Map
		//Methods - keyset(): Returns all key's available in Map
		//Methods - values(): Returns all values available in Map.
		//Methods - containsKey(key) and containsValue(value): checks key and value is present or not respectively.
		//duplicate keys are not allowed but values can be duplicate/only one null key is allowed and multiple null values are allowed
		
		
		HashMap<Integer,String> h1 = new HashMap();//Object created for map
		h1.put(100, "Ramesh");
		h1.put(200, "Dharamesh");
		h1.put(300, "Sursesh");
		
		System.out.println("Total elements are ;" +h1);
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		System.out.println(h1.containsKey(200));
		System.out.println(h1.containsValue("Ramesh"));
		
		h1.put(200,"Ramesh");//Duplicate keys not allowed but values will change against the the duplicate keys
		System.out.println("Total elements are ;" +h1);
		
		h1.put(300, "Null");
		h1.put(400, "Null");
		
		System.out.println("Total elements are ;" +h1);// duplicate null value applied but keys cannt be duplicate
		
		h1.put(null,"Kumar");// Only one null keys applicable
		h1.put(null,"Sukumar");
		
		System.out.println("Total elements are ;" +h1);
		
		
		
	}

}
