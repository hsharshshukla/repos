package codechef;
import java.util.Scanner;
import java.util.Arrays;

public class AlienChef {
public static void main(String args[]){
	
	Scanner in = new Scanner(System.in); //Input 
	
	//Prepare song Array 
	int n = in.nextInt();//Number of Songs
				//put condition for 1<=N<=100000
	int [] st = new int[2*n];
	int a=0,b=0;
	for(int i=0;i<(2*n);i++){		
		a = in.nextInt();
		b= in.nextInt();
		if(a<b){
			st[i]=a;
			i++;
			st[i]=b;
		}
		else {
			st[i]=-1;
			i++;
			st[i]=-1;
		}
		
		
	}
		int ag = in.nextInt();//total number of Alien Groups
		//put condition for 1<=Q<=5000
		String[] ns = new String[n];
		
		
	//loop for Alien Groups
	for (int j=0;j<ag;j++){			// for every alien group
		int noa = in.nextInt();	
		Arrays.fill( ns, null );
			//put conditin for 1<=k<=20  
		for (int k=0;k<noa;k++){	// for every alien
			 int t = in.nextInt(); //each alien as its time
			 int m=0,y=0;
			for(int l=0;l<2*n;l++){ //for every song time period
				if(st[l] >= 0){
					m = l+1;
					if((st[l] <= t) && (t <= st[m]  ) ){
						ns[y] ="x";
						
					}
				}
				l=l+1;
				y=y+1;
			}
		}
	//Calculate the total number of Songs downloaded by this Group
		int songs_count =0;
		for(int p=0;p<n;p++){
			if(ns[p]=="x"){songs_count++;}
			
		}
		System.out.println(songs_count);
		
	}
	//loop - each Alien for each song 
	
	//
}
	
	
}
