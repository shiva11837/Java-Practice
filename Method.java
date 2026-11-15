/*package oops;
class computer{
	public void playmusic() {
		System.out.println("music playing");
	}
	public String getmepen(int cost) {
		if(cost==10)
			return "pen";
		System.out.println("pen cost is 10rs");
		return "no pen";
	}
}
public class Method {
	public static void main(String[] args) {
		computer com = new computer();
		com.playmusic();
		//com.getmepen(10);
		String result = com.getmepen(1);
		System.out.println(result);
	}
}*/
package oops;
class computer{
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int  add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	public double add(double n1, double n2) {
		return n1+n2;
	}
}
public class Method{
	public static void main(String[] args) {
		computer comp = new computer();
		int r1 = comp.add(10,10);
		int r2 = comp.add(1,1,1);
		double r3 = comp.add(1.3,1.4);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}
}