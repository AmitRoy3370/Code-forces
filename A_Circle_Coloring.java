import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class A_Circle_Coloring{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static int a[],b[],c[];
	
	static void solve(){
		
		int aux=a[0],ant=a[0];
		
		System.out.print(aux+" ");
		
		for(int i=1;i<n-1;i++){
			
			if( a[i]!=ant ){
				
				System.out.print(a[i]+" ");
				
				ant=a[i];
				
			}else{
				
				System.out.print(b[i]+" ");
				
				ant=b[i];
				
			}
			
		}
		
		Set<Integer> set=new HashSet<>();
		
		set.add(ant);
		
		set.add(a[0]);
		
		if( !set.contains(a[n-1]) ){
			
			System.out.print(a[n-1]);
			
		}else if( !set.contains(b[n-1]) ){
			
			System.out.print(b[n-1]);
			
		}else{
			
			System.out.print(c[n-1]);
			
		}
		
		System.out.println();
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new int[n];
			
			b=new int[n];
			
			c=new int[n];
			
		    for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			for(int i=0;i<n;i++){
				
				b[i]=in.nextInt();
				
			}
			
			for(int i=0;i<n;i++){
				
				c[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
	}
	
}