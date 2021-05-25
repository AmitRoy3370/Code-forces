import java.util.Scanner;

public class A_Expression{
	
	static Scanner in=new Scanner(System.in);
	
	static int a,b,c;
	
	public static void main(String[] amit){
		
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		int ans=Math.max( Math.max(a+b*c, a*(b+c) ),Math.max( a*b*c,(a+b)*c ) );
		
		ans=Math.max(ans,a+b+c);
		
		System.out.println(ans);
		
	}
	
}