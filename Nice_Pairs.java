import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Nice_Pairs{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static char a[];
	
	static void solve(){
		
		Map<Integer,Integer> map=new HashMap<>();
		
		Map<Integer,Integer> map1=new HashMap<>();
		
		for(int i=0;i<n;i++){
			
			if( map.containsKey( ( a[i]-'0' )+i ) ){
				
				map.put( (( a[i]-'0' )+i ),map.get(( a[i]-'0' )+i )+1 );
				
			}else{
				
				map.put( (( a[i]-'0' )+i ),1 );
				
			}
			
		}
		
		for(int i=0;i<n;i++){
			
			if( map1.containsKey( (( a[i]-'0' )-i ) ) ){
				
				map1.put( (( a[i]-'0' )-i ),map1.get( (( a[i]-'0' )-i ) )+1 );
				
			}else{
				
				map1.put( (( a[i]-'0' )-i ),1 );
				
			}
			
		}
		
		int ans1=0,ans2=0;
		
	    for(int i: map.values() ){
			
			ans1+=( i*(i-1) )/2;
			
		}
		
		for(int i: map1.values() ){
			
			ans2+=( i*(i-1) )/2;
			
		}
		
		System.out.println( (ans1+ans2) );
		
	}
	
    public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=in.next().toCharArray();
			
			solve();
			
		}
		
	}
	
}