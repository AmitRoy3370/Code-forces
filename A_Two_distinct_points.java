import java.util.Scanner;

public class A_Two_distinct_points{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases;
	
	static long l1,r1,l2,r2;
	
	static void solve(){
		
		if(r1!=r2){
			
			System.out.println( r1+" "+r2 );
			
		}else if(r1==r2 && l1!=l2){
			
			System.out.println(l1+" "+l2);
			
		}else{
			
			System.out.println( (r1-1)+" "+r2 );
			
		}
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			l1=in.nextLong();
			
			r1=in.nextLong();
			
			l2=in.nextLong();
			
			r2=in.nextLong();
			
			solve();
			
		}
		
	}
	
}