package oops;

public class Stu2 {
	String name;
	int id;
Stu2(String name,int id){
	this.name = name;
	this.id = id;
}
public static void main(String[] args) {
	Stu2 s2= new Stu2("siva",101);
	System.out.println(s2.name);
}
}