class methodoverloading_demo {
	
	String name;
	int age;
	int roll;
	
	public void school(String name,int age)
	
	{
		System.out.println(name +" "+age);
	}
	
	public void school(String name,int age,int roll)
	
	{
		System.out.println(name +" "+age+" "+roll);
	}
	

	public static void main(String[] args) {

		methodoverloading_demo md = new methodoverloading_demo();
				
				md.school("Rocky", 44);
				md.school("sunny", 33, 45346346);

	}

}
