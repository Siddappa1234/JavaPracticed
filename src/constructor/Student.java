package constructor;

class Student {
	//Parameterized constructor
	int stdID;
	Student(int id)
	{
		stdID=id;
	}

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Student S= new Student(8357);
		System.out.println("Value of stdID:"+S.stdID);
		Student S1= new Student(7357);
		System.out.println("Value of stdid:"+S1.stdID);

	}

}
