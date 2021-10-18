import java.util.Scanner;
import java.util.Arrays;

public class B_Divisors_of_Two_Integers{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static int a[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
				
		}
		
		Arrays.sort(a);
		
		for(int i=n-1;i>=0;i--){
			
			if( a[n-1]%a[i]!=0 ){
				
				System.out.print(a[n-1]+" "+a[i]);
				
				break;
				
			}else{
				
				if(i>0){
					
					if( a[i]==a[i-1] ){
					
					System.out.print(a[n-1]+" "+a[i]);
					
					break;
					
					}
					
				}
				
			}
			
		}
		
	}
	
}