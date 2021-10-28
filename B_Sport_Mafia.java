import java.util.Scanner;

public class B_Sport_Mafia{
	
	static Scanner in=new Scanner(System.in);
	
	static long n,k;
	
	public static void main(String [] amit){
		
		n=in.nextLong();
		
		k=in.nextLong();
		
		long left=-1,right=n;
		
	    while(right-left>1){
			
			long mid=(left+right)/2;
			
		    if( (( n-mid )*(n-mid-1)/2-mid)>k ){
				
				left=mid;
				
			}else{
				
				right=mid;
				
			}
			
		}
		
		System.out.println(right);
		
	}
	
}