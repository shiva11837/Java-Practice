package oops;

import java.util.Random;
import java.util.Scanner;

public class Rock {
static int us;
static int cs;
static int tie;
public void StartGame() {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	String arr[]= {"r","p","s"};
System.out.println("enter user input");
while(true) {
	int uci = sc.nextInt();
	int csi = rd.nextInt(3);
	System.out.println("computer choice"+arr[csi]);
	System.out.println("user choice"+arr[uci]);
	if(uci==csi) {
	System.out.println("tie");
	tie++;
	}
if(uci<0||uci>2) {
	System.out.println("invalid user input");
}
else if((uci==0&&csi==1) || (uci==2&&csi==1) || (uci==2&&csi==0)){
	System.out.println("user wins");
	us++;
}
else{
	System.out.println("compter wins");
	cs++;
}
}
}

	public static void main(String[] args) {
		Rock r = new Rock();
		r.StartGame();

	}
}
