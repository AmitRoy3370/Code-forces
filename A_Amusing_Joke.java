import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A_Amusing_Joke{
	
	static Scanner in=new Scanner(System.in);
	
	static char []ch={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public static void main(String[] amit){
		
		StringBuilder sb=new StringBuilder();
		
		sb.append( in.next() );
sb.append( in.next() );		
	
	String c=in.next();
	
	Map<Character,Integer> map=new HashMap<>();
	
	Map<Character,Integer> map1=new HashMap<>();
	
	String s=sb.toString();
	
	for(int i=0;i<ch.length;i++ ){
		
		map.put( ch[i],0 );
		
		map1.put( ch[i],0 );
		
	}
	
	for(int i=0;i<s.length();i++ ){
		
		map.put( s.charAt(i),map.get( s.charAt(i) )+1 );
		
	}
	
	for(int i=0;i<c.length();i++ ){
		
		map1.put( c.charAt(i),map1.get( c.charAt(i) )+1 );
		
	}
	
	for(int i=0;i<26;i++){
		
		if( map.get( ch[i] )!=map1.get(ch[i]) ){
			
			System.out.println("NO");
			return;
			
		}
		
	}
	
	System.out.println("YES");
	
	}
	
}