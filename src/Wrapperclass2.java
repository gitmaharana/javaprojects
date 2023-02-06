
public class Wrapperclass2 {

	public static void main(String[] args) {
		// new method on auto-boxing since java 1.5 version 
		
		int a =100;
		Integer x = a;
		System.out.println(x.toString());
		
		
		// new method on auto-unboxing since java 1.5 version
		
		Integer b =1000;
		int y = b;
		System.out.println(y);
		
		//parse ()   - It is a method of Wrapper class, it converts the string data into int, double or float.
		
		String s="123";String s1="223.33";// data should be in numbers but within strings
		int i=Integer.parseInt(s);//Converts string into integer
		double d=Double.parseDouble(s1);//converst string to double
		System.out.println(i+d);//123+223.33
		System.out.println(s+s1);//123223.33
	}

}
