package a_practisee;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
public class testclass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        char[] fut = name.toCharArray();
        int counti=0,counto=0;
        for (int i=0; i<fut.length;i++){
            if (fut[i]=='1'){
                if(counto<6){
                	counto=0;
                	}
                counti++;
            }
            else if(fut[i]=='0'){
                if(counti<6){
                	counti=0;
                	}
                counto++;
            }
        }
        if ((counti>=6 && counto>=6) || (counti>=6) || (counto>=6)){
            System.out.println("Sorry, sorry!");
        }
        else {
            System.out.println("Good luck!");
        } 
        

        // Write your code here
     

    }
}

