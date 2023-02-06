
public class stringdemo {

	public static void main(String[] args) {
		
		String s1 = " This is Java String programme";
		String s2 = "Javadeveloper"; // created by using literal
		String s3 = new String("NewDeveloper"); // with New key word
		String s4 = "This is JaVA Str4464ing programme";
		String s5 = "programme";
		
		
		// Length method
		System.out.println("Length of this string is :"+" "+ s1.length());
		//CharAt method - used to get the index - 5th index of s3 variable
		System.out.println(" Index value of this string is :"+" "+ s3.charAt(5));
		//Equals method
        System.out.println(s1.equals(s2));
        //equalsIgnoreCase method
        System.out.println(s1.equalsIgnoreCase(s4));
        //Triming  - removes space from start and end of the string not middle spaces
        System.out.println(s4.trim());
        //Substring - Part of string will be displayed from the Index provided
        System.out.println(s1.substring(6)) ;
        System.out.println(s1.substring(6,12)) ;
        
        //IndexOf method - will return index int value of string
        System.out.println(s1.indexOf("a")) ;// index of char
        System.out.println(s1.indexOf("av")) ;// index of string
        System.out.println(s1.indexOf("e",2)) ;//second 2nd index
        System.out.println(s1.indexOf("va",2)) ;//second 2nd index
        System.out.println(s1.indexOf("x")) ;//-1 if value not present
        
        //toUpperCase Method
        System.out.println(s4.toUpperCase());
        //toLowerCase Method
        System.out.println(s4.toLowerCase());
        //startsWith Method - Boolean
        System.out.println(s4.startsWith("This"));
      //endsWith Method - Boolean
        System.out.println(s4.endsWith("String"));
      //contains Method - Boolean
        System.out.println(s4.contains("String"));
        //isEmpty Method - Boolean
        System.out.println(s4.isEmpty());
        //concat Method
        System.out.println(s4.concat(s3));
        
        //replace method - - replace char
        System.out.println(s4.replace("a","x"));
        //replaceAll method - replace strings
        System.out.println(s4.replaceAll("This","That"));
        //replaceAll method - regular expressions
        System.out.println(s4.replaceAll("[A-Z]",""));// cap letters removed
        System.out.println(s4.replaceAll("[a-z]",""));// small letters removed
        System.out.println(s4.replaceAll("[0-9]",""));// all numbers removed
        System.out.println(s4.replaceAll("[aeiouAEIOU]",""));// aeiouAEIOU letters removed
        
        //equals() ---> compares two strings based on string data
        //==       ---> compares two strings based on reference
        
        //split(args) - returns value in String[]        
        String x1 [] = s1.split(" ");// store string value in an array
        System.out.println(x1[1]);
        System.out.println(x1[2]);
        System.out.println(x1[3]);
        System.out.println(x1[4]);
        System.out.println(x1[5]);
        
        String ch[]= s5.split("");// store char value in an array
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[3]);
        System.out.println(ch[4]);
        System.out.println(ch[5]);
        
        //toCharArray() - it converts string into character array
        char y1[] = s5.toCharArray();
        System.out.println(y1[0]);
        System.out.println(y1[1]);
        System.out.println(y1[2]);
        System.out.println(y1[3]);
        System.out.println(y1[4]);
        System.out.println(y1[5]);
        
        
        
      
	}

}
