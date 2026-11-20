/*package oops;

public class Num {
	public static void  PrintNums(int n) {
		if(n==1) {
			System.out.println("1");
			return;
		}
		System.out.println(n);
		PrintNums(n-1);
	}
	public static void main(String[] args) {
		PrintNums(1);
	}
}
*/
/*package oops;
public class Num{
	static int Fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*Fact(n-1);
	}
	public static void main(String[] args) {
		System.out.println(Fact(4));
	}
}*/
package oops;
public class Num{
	static int rev(int n,int result) {
		if(n==0) {
			return result;
		}
		int digit = n%10;
		return rev(n/10,result*10+digit);
	}
	public static void main(String[] args) {
		System.out.println(rev(1234,0));
	}
	}


