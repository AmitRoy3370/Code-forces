import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A_Journey_Planning{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static long a[];
	
	static void solve(){
		
		 Map<Long,Long> map=new HashMap<>();
		
	for(int i=1;i<=n;i++){
		
		if( map.containsKey( (i-a[i]) ) ){
		
		map.put( ( i-a[i] ), map.get( (i-a[i]) )+a[i] );
		
		}else{
			
			map.put( ( i-a[i] ),a[i] );
			
		}
		
	}
	
long ans=Long.MIN_VALUE;
	
	for(long i: map.keySet() ){
		
		ans=Math.max( ans,map.get(i) );
		
	}
	
	System.out.println(ans);
	
	}
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		a=new long[n+1];
		
		for(int i=1;i<=n;i++){
			
			a[i]=in.nextLong();
			
		}
		
		solve();
		
	}
	
}