package a_a;
import java.util.*;
import java.io.*;
import java.nio.*;
public class threeEqualParts {

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
        int t = Integer.valueOf(name);
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        for (int tc=0;tc<t;tc++){       	
        
        
        String case_size = s.nextLine();
        int size = Integer.valueOf(case_size);
        
        String array = s.nextLine();
        String strarray[] =array.split(" ") ;        

        int[] arr = Arrays.stream(strarray).mapToInt(Integer::parseInt).toArray();
        
        array = array.replaceAll("\\s+","");
       
    //Process array to get the 3 part theory
        long count = array.chars().filter(ch -> ch == '1').count();
        
        if(count%3==0 && count !=0){
        	long kl = (count / 3);
        	int k = (int)kl;
        	int posf = array.indexOf("1");       	
        	
        	int pos = array.indexOf("1");
        	int ln = k+1;
        	while (--ln > 0 && pos != -1){
                pos = array.indexOf("1", pos + 1);}
            
        	int poss = pos;
        	pos=0;ln=0;        	
        	ln=(2*k)+1;
        	pos = array.indexOf("1");
        	while (--ln > 0 && pos != -1){
                pos = array.indexOf("1", pos + 1);}
            
        	int post =pos;
            
            int postil=0;
            
            String flag = "";
            String part="";
            int posfi=posf,possi=poss,posti=post;
            
            for (int i=0;post<=(size-1) ;i++){
            	//set position           
            	char fp = array.charAt(posf);
            	char sp = array.charAt(poss);
            	char tp = array.charAt(post);
            	posf++;
            	poss++;
            	post++;
            	if (fp == sp){
            		if (sp==tp){
            			part = part + fp;
            		}else{
            			flag="-1";
            		}
            	}
            	else {
            		flag="-1";
            	}
            }
            
            if(flag=="-1"){
            	System.out.println("-1");
            }else{           	
            	part = part.replaceAll("\\s+","");
            	//System.out.println(Long.parseLong(part,2)%1000000007);          	
            	long decimal = 0;
            	int len = part.length();
                
                for (int pow = (part.length()-1); pow > -1; pow--) {
                    if (part.charAt(pow)=='1'){
                   // decimal += (Math.pow(2, pow));
                    	decimal += (Math.pow(2, (len - pow - 1)));
                    }
                }
                System.out.print(decimal%1000000007);
            	
            	}
            
        }
        else if (count==0){
        	System.out.println("0");
        }
        else{
        	System.out.println("-1");
        }
        
        // Write your code here 
        }
    }
    
    
}
