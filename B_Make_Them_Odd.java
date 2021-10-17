import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class B_Make_Them_Odd{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static long a[];
	
	static void solve(){
		
		Set<Long> set=new HashSet<>();
		
        for(int i=0;i<n;i++){
			
			long x=a[i];
			
			while( x%2==0 ){
				
				set.add(x);
				
				x/=2;
				
			}
			
		}
		
		System.out.println(set.size() );
		
	}
	
	public static void main(String [] amit){
		
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