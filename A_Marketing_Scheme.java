import java.util.Scanner;

public class A_Marketing_Scheme{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,l,r;
	
	static void solve(){
		
		if(2*l>r){
			
			System.out.println("YES");
			
		}else{
			
			System.out.println("NO");
			
		}
		
	}
	
    public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			l=in.nextInt();
			
			r=in.nextInt();
			
			solve();
			
		}
		
	}
	
}