import java.util.Scanner;

public class A_Copy_paste{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n,k;
	
	static int a[];
	
	static void solve(){
		
		int min=a[0];
		
		for(int i: a){
			
			min=Math.min(i,min);
			
		}
		
		int ans=0;
		
		for(int i: a){
			
			ans+=( k-i )/min;
			
		}
		
		System.out.println( ( ans-(k-min)/min ) );
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			k=in.nextInt();
			
			a=new int[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
	}
	
}