package oops;

public class Student1 {
	int sid; 
	String name ;
	String course;
	static{
		System.out.println("student managment system started");
	}
	{
		System.out.println("student object created");
	}
	public static void main(String[] args) {
		Student1  s1= new Student1();
		s1.sid = 101;
		s1.name = "ravi";
		s1.course = "java";
		System.out.println("id "+s1.sid + " name "+s1.name +" course "+s1.course);
	}
}
