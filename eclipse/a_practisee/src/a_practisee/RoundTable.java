package a_practisee;
import java.util.Scanner;

public class RoundTable {

	public static void main(String args[]){
		Scanner stdin = new Scanner(System.in);
		int l = stdin.nextInt();
		int q = stdin.nextInt();
		char [] unv_list= new char[10];
		String list = stdin.nextLine();
		list = stdin.nextLine();
				
		if(1<=l&&l<=50000){}
		else {
			System.exit(0);
		}
		if(1<=q&&q<=100){}else{
			System.exit(0);
		}
//Prepare Student list	
		int listind=0; 
		
		for (int i=0;i<2*l-1;i++){
			if(list.charAt(i)==' '){
				i++;
			}
			
			unv_list[listind] = list.charAt(i);
			listind++;
		}
		
//for every Query you need to check the minimum movement 		
		for(int j=0;j<q;j++){
			
			int is1 = stdin.nextInt();
			int is2 = stdin.nextInt();			
			char s1 =(char)(is1+'0');
			char s2 =(char)(is2+'0');
			int [] qsol = new int[2*l];
			int qsol_ind = 0;
			//Test case 
			for(int k=0; k<l;k++){
				
				int sind1 =l;
				int sind2=0;
				if(s1==unv_list[k]){
					
					for (int p=0;p<l;p++){
						
						if(s2==unv_list[p]){
							sind2=k;
						  if(sind1>sind2){
							 if(sind1-sind2>(l/2)){
								 
								 qsol[qsol_ind]= ((100-sind1)+sind2)/2;
								 
							 }else {
							 qsol[qsol_ind]=(sind1-sind2)/2;}
							 
						  }
						  else if(sind2>sind1){
							  if(sind1-sind2>(l/2)){
									 
									 qsol[qsol_ind]= ((100-sind2)+sind1)/2;
									 
								 }else {
								 qsol[qsol_ind]=(sind2-sind1)/2;}
							  
						  }
						  qsol_ind++;
						}
					}
					
					
				}
			}
//Calculate Minimum of Each query and Print
			int result=0;
			for (int t=0;t<2l;t++){
				if(result >=qsol[t]){}
				else{
					result=qsol[t];
				}
			}
			System.out.println(result);
		}
		stdin.close();
		
	}
}
