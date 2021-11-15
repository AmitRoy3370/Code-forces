import java.util.Scanner;

public class A_Mathematical_Addition{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases;
	static long u,v;
	
	static void solve(){
		
		System.out.println( (u*u*-1)+" "+(v*v) );
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			u=in.nextLong();
			v=in.nextLong();
			
			solve();
			
		}
		
	}
	
}