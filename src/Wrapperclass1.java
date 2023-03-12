
public class Wrapperclass1 {
	
	//In order to represent primitive datatype as an object we use wrapper classes
	//For every primitive data type, there is a corresponding wrapper class available in java.
	// Since java is 100 % object oriented, we have to represent everything as object
	//Therefore to represent primitive datatype as object we use wrapper classes.
	//All wrapper classes are final classes and present in java.lang package

	public static void main(String[] args) {
	
		Integer a=new Integer(100);
		System.out.println(a.toString());//100
		System.out.println(a);//100
		 
		//boxing - converting primitive type into Wrapperclass is called as Boxing.
		//Boxing can be performed by using valueOf()
		
		int s = 500;
		Integer box = Integer.valueOf(s);// int value converted to Integer wrapper class
		System.out.println(box.toString());// printing the wrapper class value
	
		//Unboxing - The process of converting Wrapperclass into primitive type is called as UnBoxing.
		//UnBoxing can be performed by using xxxvalue()(xxx--->primitivedatatype)
		
		Integer x =new Integer(1000);
		int y = x.intValue();
		System.out.println(y);
	
	}

}
