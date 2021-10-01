import java.util.Scanner;
import java.math.BigInteger;

public class B_High_School_Become_Human{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		long x=in.nextLong();
		
		long y=in.nextLong();
		
		double X=(double)(x*Math.log10(y));
		
		double Y=(double)(y*Math.log10(x));
		
		if(X<Y){
			
			System.out.println(">");
			
		}else if(X>Y){
			
			System.out.println("<");
			
		}else{
			
			System.out.println("=");
			
		}
		
	}
	
}