import java.util.Scanner;

public class B_Petr_and_a_Combination_Lock{
	
	static Scanner in=new Scanner(System.in);
	
	static boolean dp[];
	
	static int n;
	
	static int a[];
	
	static boolean solve(int i,long sum){
		
		if(i>=n){
			
			if( sum%360==0 || sum==0 ){
				
				return true;
				
			}
			
			return false;
			
		}
	
//dp[i]=true;
	
	//if(i+1<n && !dp[i+1]){
	
		return solve( i+1,sum+a[i] ) || solve( i+1,sum-a[i] );
		
	//}
		
		//if(i+1<n && !dp[i+1]){
		
		//return solve( i+1,sum-a[i] );
		
		//}
		
		//return false;
		
	}
	
	public static void main(String [] amit){
		
		 n=in.nextInt();
		
		 a=new int[n];
		
		dp=new boolean[n];
		
		int sum=0;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			sum+=a[i];
			
		}
		
		if(sum==360){
			
			System.out.println("YES");
			
			return;
			
		}
		
	if( solve(0,0) ){
		
		System.out.println("YES");
		
	}else{
		
		System.out.println("NO");
		
	}
		
	}
	
}