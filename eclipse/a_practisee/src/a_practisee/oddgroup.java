package a_practisee;
//1<=input<=1000000 
import java.util.Scanner;
public class oddgroup {
	public static void main(String args[]){
		Scanner stdin = new Scanner(System.in);
	    int n = stdin.nextInt(); //3
		if(1<=n&&n<=1000000){
	    int sum = (n*(n-1))/2; //3
		sum++; //4
		int a = (2*sum)-1; //7
		a = n*(a+n-1);
		System.out.println(a);
		
	}
	}

}
