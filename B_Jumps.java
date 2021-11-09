import java.util.Scanner;

public class B_Jumps{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases;
	
	static long n;
	
	static void solve(){
		
		if(n==1){
			
			System.out.println(1);
			
			return;
			
		}
		
		long step=0;
		
		while( (step*(step+1))<n*2 ){
			
			step++;
			
		}
		
		if( (step*(step+1)/2)==(n+1) ){
			
			step++;
			
		}
		
		System.out.println(step);
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextLong();
			
			solve();
			
		}
		
	}
	
}