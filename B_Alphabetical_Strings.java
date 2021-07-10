import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class B_Alphabetical_Strings{
	
	static Scanner in=new Scanner(System.in);
	
	static char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
	'q','r','s','t','u','v','w','x','y','z'};
	
	static Map<Character,Integer> map=new HashMap<>();
	
	static int testCases;
	
	static String s;
	
	static void solve(){
		
		char a[]=s.toCharArray();
		
		int n=a.length;
		
		boolean contains[]=new boolean[26];
		
		for( char i: a ){
			
			contains[ map.get(i)-1 ]=true;
			
		}
		
		for(int i=0;i<n;i++){
			
			if( !contains[i] ){
				
				System.out.println("NO");
				
				return;
				
			}
			
		}
		
		for(int i=1;i<n-1;i++){
			
			if( map.get( a[i+1] )<map.get( a[i] ) && map.get(a[i])>map.get( a[i-1] ) ){
				
				System.out.println("NO");
				
				return;
				
			}
			
		}
		
		System.out.println("YES");
		
	}
	
	public static void main(String[] amit){
		
		for(int i=0;i<26;i++){
			
			map.put( ch[i],i+1 );
			
		}
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			s=in.next();
			
			solve();
			
		}
		
		
	}
	
}
