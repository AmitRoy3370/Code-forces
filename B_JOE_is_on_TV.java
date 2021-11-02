import java.util.Scanner;

public class B_JOE_is_on_TV{
	
	static Scanner in=new Scanner(System.in);
	
	static double n;
	
	public static void main(String [] amit){
		
		n=in.nextDouble();
		
		double ans=0.0;
		
		double copy=n;
		
		for(double  i=n;i>=1;i--){
			
			ans+=1/i;
			
		}
		
		System.out.println(ans);
		
	}
	
}