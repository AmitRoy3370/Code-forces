import java.util.Scanner;

public class C1_Skyscrapers_easy_version{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static long a[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		a=new long[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
		}
		
		long ans[]=new long[n];
		
		long finalAns[]=new long[n];
		
		long max=Long.MIN_VALUE;
		
		for(int i=0;i<n;i++){
			
			long left=a[i];
			
			for(int j=i;j>=0;j--){
				
				left=ans[j]=Math.min( left,a[j] );
				
			}
			
			long right=a[i];
			
			for(int j=i+1;j<n;j++){
				
				right=ans[j]=Math.min( right,a[j] );
				
			}
			
			long sum=0;
			
			for(long j: ans){
				
				sum+=j;
				
			}
			
			if( sum>max ){
				
				for(int j=0;j<n;j++){
					
					finalAns[j]=ans[j];
					
				}
				
				max=sum;
				
			}
			
	/*	for(long j: ans){
			
			System.out.print(j+" ");
			
		}
			
			System.out.println();*/
			
		}
		
		for(long i: finalAns){
			
			System.out.print(i+" ");
			
		}
		
	}
	
}