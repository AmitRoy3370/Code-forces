import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class D_Same_Differences{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static long a[];
	
	static void solve(){
		
		Map<Long,Long> map=new HashMap<>();
		
		for(int i=0;i<n;i++){
		
		map.put( (a[i])-(i),(long)0 );
		
		}
		
		for(int i=0;i<n;i++){
			
			map.put( (a[i])-(i),map.get( (a[i])-(i) )+1 );
			
		}
		
		long sum=0;
		
		for (Map.Entry<Long, Long> pair : map.entrySet()) {
//    System.out.println(String.format("Key (name) is: %s, Value (age) is : %s", pair.getKey(), pair.getValue()));   

if( pair.getValue()>1 ){

sum+=((pair.getValue()*(pair.getValue()-1))/2);

}

}
		
		System.out.println( sum );
		
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