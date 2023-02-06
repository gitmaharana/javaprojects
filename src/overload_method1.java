
public class overload_method1 {

	public static void main(String[] args) {
		
		add();//declare the methods
		add(100,200);//declare the methods
		add('A','B');//A=65,B=66////declare the methods
		add(100,"java");//declare the methods
		add("SQL",200);//declare the methods
		}
		
		public static void add()
		{
		System.out.println(10+20);
		}
		
		public static void add(int i,int j)
		{
		System.out.println(i+j);
		}
		
		public static void add(char ch1,char ch2)
		{
		System.out.println(ch1+ch2);
		}
		
		public static void add(int i,String s)
		{
		System.out.println(i+s);
		}
		
		public static void add(String s,int i)
		{
		System.out.println(s+i);

	}

}
