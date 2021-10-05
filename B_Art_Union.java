import java.util.Scanner;

public class B_Art_Union{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,m;
	
	static int a[][];
	
	public static void main(String [] amit){
		
		m=in.nextInt();
		
		n=in.nextInt();
		
		a=new int[m][n];
		
		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				a[i][j]=in.nextInt();
				
			}
			
		}
		
		int dp[]=new int[m];
		
		for(int i=0;i<n;i++){
			
			int startAt=0;
			
			for(int j=0;j<m;j++){
				
				int start=Math.max( startAt,dp[j] );
				
				//System.out.println("startAt: "+startAt);
				
				dp[j]=start+a[j][i];
				
				startAt=dp[j];
			
			/*for(int k=0;k<m;k++){
				
				System.out.print( dp[k]+" " );
				
			}
			
			System.out.println();*/
			
			}
			
		}
		
		for(int i: dp){
			
			System.out.print(i+" ");
			
		}
		
	}
	
}