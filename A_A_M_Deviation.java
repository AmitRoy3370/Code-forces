import java.util.Scanner;

public class A_A_M_Deviation{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,x1,x2,x3;
	
	static void solve(){
		
		if( ( x1+x3-2*x2 )%3==0 ){
			
			System.out.println(0);
			
	    }else{
			
			System.out.println(1);
			
		}
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			x1=in.nextInt();
			x2=in.nextInt();
			x3=in.nextInt();
			
			solve();
			
		}
			
	}
	
}