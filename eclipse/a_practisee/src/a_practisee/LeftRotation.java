package a_practisee;
import java.util.Scanner;
import java.io.BufferedInputStream;

public class LeftRotation {
	
	public static void main(String args[]){
		//System.out.println("Please provide integer and rotation offset:	 ");
		int n=0,d=0;
	Scanner input = new Scanner(new BufferedInputStream(System.in));
	//Check for number of integers and number of rotations
	n = input.nextInt();
	d = input.nextInt();
	if (n >= 1 && n <= 100000){
		if(d >= 1 && d <= n){		
			
		}
		else{
			System.out.println("Please check the value of Number of Rotations: Range is 1<=d<=n");
		}
		}
	else{
		System.out.println("Please check the value of Number of Integers, Range is 1<= n<=100000");
	}
	
	//Processing Input to generate the Array
	int[] arr = new int[n];
	int count=0;
	for(int i=0;i<n;i++){
		arr[i] = i + 1;
	}
	//Rotate the value of array
	int[] new_arr = new int[n];
	
	
	for(int j=0;j<n-d;j++){
		//Set indexes from 0 to n-d-1
		new_arr[j] = arr[j+d];		
		
		
	}
	//set indexes from n-d to n-1
	for (int k=0;k<d;k++){		
	 new_arr[n-d+k]	= arr[k];
			
			}
	
	//Print New Array 
	System.out.println("The new Array below : ");
	for (int m=0;m<n;m++){		
		System.out.print(new_arr[m]);
	}
	}
}
