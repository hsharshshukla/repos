package codechef;

import java.util.Scanner;
public class Remainder {
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int n = in.nextInt(),a=0,b=0,r=0;
	for (int i=0;i<n;i++){
		a = in.nextInt();
		b= in.nextInt();
		r = a%b;
		System.out.println(r);
	}
}
	
}
