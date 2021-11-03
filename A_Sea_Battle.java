import java.util.Scanner;

public class A_Sea_Battle{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		int w1=in.nextInt();
		
		int h1=in.nextInt();
		
		int w2=in.nextInt();
		
		int h2=in.nextInt();
		
		System.out.print( (2*(w1+h1+h2)+4) );
		
	}
	
}