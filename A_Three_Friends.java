import java.util.Scanner;

public class A_Three_Friends{
	
	static Scanner in=new Scanner(System.in);
	
	static long a,b,c;
	
	static int testCases;
	
	static void solve(){
		
		long ab=Math.abs(a-b );
		long bc=Math.abs(b-c);
		long ac=Math.abs( a-c );
		
		if(ab<=1 && bc<=1 && ac<=1){
			
			System.out.println(0);
			
		}else{
			
			System.out.println( (ab+ac+bc)-4 );
			
		}
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			a=in.nextLong();
			
			b=in.nextLong();
			
			c=in.nextLong();
			
			solve();
			
		}
		
	}
	
}