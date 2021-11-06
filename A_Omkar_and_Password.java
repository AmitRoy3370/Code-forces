import java.util.Scanner;

public class A_Omkar_and_Password{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static long a[];
	
	static void solve(){
		
		int ans=n;
		
		for(int i=0;i<n-1;i++){
			
			if(a[i]!=a[i+1]){
				
				ans=1;
				
				break;
				
			}
			
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String[] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new long[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextLong();
				
			}
			
			solve();
			
		}
		
	}
	
}