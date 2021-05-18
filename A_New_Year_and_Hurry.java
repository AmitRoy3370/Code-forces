import java.util.Scanner;

public class A_New_Year_and_Hurry{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,k;
	
	public static void main(String[] amit){
		
		n=in.nextInt();
		k=in.nextInt();
		
		int remaining=4*60-k;
		
		int i=1,count=0;
		
		while(remaining>0){
			
			count++;
			
			remaining-=(5*i);
			
			if( remaining<0 ){
				
				count--;
				
			}
			
			i++;
			
			if(i>n){
				
				break;
				
			}
			
		}
		
		System.out.println(count);
		
	}
	
}