import java.util.Scanner;

public class A_Countdown{
	
	static int testCases,n;
	
	static char a[];
	
	static Scanner in=new Scanner(System.in);
	
	static void solve(){
		
		int ans=0;
		
		for(int i=0;i<n;i++){
			
			if(a[i]!='0'){
			
			ans+=(a[i]-'0');
			
			if(i!=n-1){
				
				ans++;
				
			}
			
			}
			
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String []amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=in.next().toCharArray();
			
			solve();
			
		}
		
	}
	
}