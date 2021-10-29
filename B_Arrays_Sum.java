import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class B_Arrays_Sum{
	
	static int testCases,n,k;
	
	static long a[];
	
	static Scanner in=new Scanner(System.in);
	
	static void solve(){
		
		Set<Long> set=new HashSet<>();
		
		for(long i: a){
			
			set.add(i);
			
		}
		
		if(k==1){
			
			System.out.println( (set.size()>1?-1:1) );
			
		}else{
			
		    if( set.size()==1 ){
				
				System.out.println(1);
				return;
				
			}
			
			System.out.println( (long)Math.ceil(Math.max(1, (set.size()+k-3) )/(k-1)) );
			
		}
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
	    for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			k=in.nextInt();
			
			a=new long[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextLong();
				
			}
			
			solve();
			
		}
		
	}
	
}