package a_a;
import java.util.*;
public class MaxDial {
	public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        
        // Write your code here
        int amt = Integer.valueOf(name);int count=12;
        int[][] button = new int[10][10];
        while(count>0){
        	count--;
        	String line = s.nextLine();
        	String[] line_arr = line.split(" ");
        	int cnt = 3;
        	while(cnt>0){
        		cnt--;
        		//2 1 3 -> button u v 
        button[Integer.valueOf(line_arr[0]) ][Integer.valueOf(line_arr[1])] = Integer.valueOf(line_arr[2]);
        button[Integer.valueOf(line_arr[1]) ][Integer.valueOf(line_arr[0])] = Integer.valueOf(line_arr[2]);		
        	}
        	
        }
       
       
    }

}
