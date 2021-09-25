import java.util.Scanner;
import java.util.Arrays;

public class A_Second_Price_Auction{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		int n=in.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		int max=a[0],maxIndex=-1;
		
		for(int i=0;i<n;i++){
			
			if(max<=a[i]){
				
				max=a[i];
				maxIndex=i+1;
				
			}
			
		}
		
		Arrays.sort(a);
		
		System.out.println( maxIndex+" "+a[n-2] );
		
	}
	
}