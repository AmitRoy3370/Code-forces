import java.util.Scanner;

public class A_CQXYM_Count_Permutations{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases;
	
	static long n;
	
	static void solve(){
		
		long ans=1;
		
		for(int i=3;i<=n*2;i++){
			
			ans=(ans*i)%1000000007;
			
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextLong();
			
			solve();
			
		}
		
	}
	
}