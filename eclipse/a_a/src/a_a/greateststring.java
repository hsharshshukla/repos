package a_a;
import java.io.*;
import java.util.*;

public class greateststring {

	public static void main(String args[]){
		long starttime=System.nanoTime();
		Scanner s = new Scanner(System.in);
		String tc = s.nextLine();
		int t = Integer.valueOf(tc);
		int iter = 0;
		while(s.hasNext()){
			iter++;
			String string= s.nextLine();
			String nop = s.nextLine();
			int op = Integer.valueOf(nop);
			int l = string.length();
			int count =0;
		
			for (int j=0;j<l && count<op;j++){
				char ch = string.charAt(j);
	            if(ch == 'a' ){	            	
	            	string = string.substring(0,j)+'b'+string.substring(j+1);
	            	count++;
	            }
	            else if(ch == 'e' ){	            	
	            	string = string.substring(0,j)+'f'+string.substring(j+1);
	            	count++;
	            }
	            else if(ch == 'i' ){	            	
	            	string = string.substring(0,j)+'j'+string.substring(j+1);
	            	count++;
	            }
	            else if(ch == 'o' ){	            	
	            	string = string.substring(0,j)+'p'+string.substring(j+1);
	            	count++;
	            }
	            else if(ch == 'u' ){	            	
	            	string = string.substring(0,j)+'v'+string.substring(j+1);
	            	count++;
	            }else{}
	            	
			}
			System.out.println(string);
			if(iter==t){
			long time = (System.nanoTime() - starttime)/1000000000;
			System.out.println(time);}
		}		
		s.close();
		
		
	}
}
