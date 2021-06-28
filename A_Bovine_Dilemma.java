import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class A_Bovine_Dilemma{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static int a[];
	
	static void solve(){
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<n-1;i++){
			
			for(int j=i+1;j<n;j++){
				
				set.add( a[j]-a[i] );
				
			}
			
		}
		
		System.out.println( set.size() );
		
	}
	
	public static void main(String[] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new int[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
	}
	
}