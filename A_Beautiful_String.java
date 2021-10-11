import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A_Beautiful_String{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static char a[];
	
	static char have[]={'a','b','c'};
	
	static Map<Character,Integer> map=new HashMap<>();
	
	static void solve(){
		
		if(n==1){
			
			if( a[1]!='?' ){
				
				System.out.println(a[1]);
				
			}else{
				
				System.out.println( 'a' );
				
			}
			
			return;
			
		}
		
        if( !new String(a).contains("a") && !new String( a ).contains("b")
        && !new String(a).contains("c")){
			
			int j=0;
			
			for(int i=1;i<=n;i++){
				
				a[i]=have[j++%3];
				
			}
			
		//	System.out.println(new String(a) );
			
			for(int i=1;i<=n;i++){
				
				System.out.print(a[i]);
				
			}
			
			System.out.println();
			
		return;	
			
		}
		
	boolean ok=true;
	
	if(a[0]=='?'){
		
	   if( a[1]=='a' ){
		   
		   a[0]='b';
		   
	   }else if(a[1]=='b'){
		   
		   a[0]='a';
		   
	   }else if(a[1]=='c'){
		   
		   a[0]='a';
		   
	   }
		
	}
	
	for(int i=1;i<=n;i++){
		
		if( a[i]=='?' ){
		
		    if(  a[i-1]!='a' && a[i+1]!='a' ){
			
			    a[i]='a';
			
		    }else if(  a[i-1]!='b' && a[i+1]!='b' ){
				
				a[i]='b';
				
			}else{
				
				a[i]='c';
				
			}
		
		/*if( i==n-1 ){
			
			if(a[i-1]=='c'){
				
				a[i]='b';
				
			}else if(a[i-1]=='b'){
				
				a[i]='a';
				
			}else if(a[i-1]=='a'){
				
				a[i]='b';
				
			}
			
		}*/
		
	//	ok &=a[i]!=a[i+1] && a[i]!=a[i-1];
		
		}
		
		ok&=a[i]!=a[i+1] && a[i]!=a[i-1];
		
	}

if(!ok){
	
	System.out.println(-1);
	
	return;
	
}else{
	
	for(int i=1;i<=n;i++){
		
		System.out.print(a[i]);
		
	}
	
	System.out.println();
	
	return;
	
}
	
	//System.out.println( new String(a) );
	
	/*for(int i=0;i<n-1;i++){
		
		if( a[i]!='?' && a[i]==a[i+1]){
			
			System.out.println(-1);
			
			return;
			
		}
		
	}
	
System.out.println( new String(a) );*/
	
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		map.put('a',0);
		map.put('b',1);
		map.put('c',2);
		
		for(int t=0;t<testCases;t++){
			
			a=("."+in.next()+".").toCharArray();
			
			n=a.length-2;
			
			solve();
			
		}
		
	}
	
}