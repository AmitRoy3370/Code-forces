import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class C_Vasya_and_Multisets{
	
	static Scanner in=new Scanner(System.in);
	
	static Map<Integer,Integer> map=new HashMap<>();
	
	static int n;
	
	static int a[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		for(int i: a){
			
			if(map.containsKey(i) ){
			
			map.put(i,map.get(i)+1 );
			
			}else{
				
				map.put(i,1);
				
			}
			
		}
		
		int one=0,more=0;
		
		for(int i: a){
			
			if( map.get(i)==1 ){
				
				one++;
				
			}else if( map.get(i)>2 ){
				
				more++;
				
			}
			
		}
		
		//System.out.println("one: "+one+" more: "+more);
		
		char ans[]=new char[n];
		
		if(one%2==0){
		
		one/=2;
		
		for(int i=0;i<n;i++){
			
			if( map.get(a[i])==1 && one-->0 ){
				
				ans[i]='B';
				
			}else{
				
				ans[i]='A';
				
			}
			
		}
		
		}else if( more>0 ){
			
			one/=2;
			
			more=1;
			
			for(int i=0;i<n;i++){
				
				if( map.get( a[i] )==1 && one-->0 ){
					
					ans[i]='B';
					
				}else if(more==1 && map.get( a[i] )>2){
					
					more=0;
					
					ans[i]='B';
					
				}else{
					
					ans[i]='A';
					
				}
				
			}
			
			
		}else{
			
			System.out.println("NO");
			
			return;
			
		}
		
		System.out.println("YES");
		
		System.out.println( new String(ans) );
		
	}
	
}