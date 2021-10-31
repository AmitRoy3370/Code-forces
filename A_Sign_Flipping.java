import java.util.Scanner;

public class A_Sign_Flipping{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static long a[];
	
	static void solve(){
		
		for(int i=0;i<n;i++){
			
			if( i%2==0 ){
				
				System.out.print( Math.abs(a[i])+" " );
				
			}else{
				
				System.out.print(-Math.abs(a[i])+" ");
				
			}
			
		}
		
		System.out.println();
		
	}
	
	public static void main(String [] amit){
		
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