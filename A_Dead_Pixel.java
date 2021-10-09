import java.util.Scanner;

public class A_Dead_Pixel{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,a,b,x,y;
	
	static void solve(){
	
	x++;
	y++;
	
		System.out.println( Math.max(a*(b-y), Math.max(a*(y-1),Math.max(b*(x-1),b*(a-x)))) );
		
	}
	
   public static void main(String [] amit){
	
	testCases=in.nextInt();
	
	for(int t=0;t<testCases;t++){
		
		a=in.nextInt();
		
		b=in.nextInt();
		
		x=in.nextInt();
		
		y=in.nextInt();
		
		solve();
		
	}
	
    }
	
}