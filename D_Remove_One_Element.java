import java.util.Scanner;

public class D_Remove_One_Element{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static long a[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		a=new long[n];
		
		long dp[][]=new long[n][2];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
		}
		
		dp[0][0]=1;
		dp[0][1]=0;
		
		long ans=Long.MIN_VALUE;

        for(int i=1;i<n;i++){
			
			if( a[i]>a[i-1] ){
				
				dp[i][0]=dp[i-1][0]+1;
				dp[i][1]=dp[i-1][1]+1;
				
			}else{
				
				dp[i][0]=1;
				dp[i][1]=1;
				
			}
			
			if(i-2>=0){
				
				if(a[i]>a[i-2]){
				
				dp[i][1]=Math.max( dp[i][1],dp[i-2][0]+1 );
				
				}
				
			}
			
            ans=Math.max(ans,Math.max(dp[i][0],dp[i][1]) );
		
		} 

		/*for(long i: dp){
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();*/
		
		System.out.print(ans);
		
	}
	
}