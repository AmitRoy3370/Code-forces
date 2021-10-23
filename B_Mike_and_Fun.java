import java.util.Scanner;

public class B_Mike_and_Fun{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,m,q;
	
	static int gird[][];
	
	static int dp[];
	
    static void rawCalculations(int raw){
		
		int haveOne=0;
		
		dp[raw]=0;
		
		for(int j=0;j<=m;j++){
			
			if( gird[raw][j]>=1 ){
				
				haveOne++;
				
			}else{
				
				dp[raw]=Math.max(haveOne,dp[raw]);
				
				haveOne=0;
				
			}
			
		}
		
	}
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		m=in.nextInt();
		
		q=in.nextInt();
		
		gird=new int[n+1][m+1];
		
		dp=new int[505];
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<m;j++){
				
				gird[i][j]=in.nextInt();
				
			}
			
			rawCalculations(i);
			
		}
		
		for(int i=0;i<q;i++){
			
			int x=in.nextInt()-1;
			
			int y=in.nextInt()-1;
			
			gird[x][y]^=1;
			
			rawCalculations(x);
			
			int ans=Integer.MIN_VALUE;
			
			for(int j=0;j<n;j++){
				
				ans=Math.max(ans,dp[j]);
				
			}
			
			System.out.println(ans);
			
		}
		
	}
	
}

