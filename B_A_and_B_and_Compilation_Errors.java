import java.util.Scanner;

public class B_A_and_B_and_Compilation_Errors{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static long a[],b[],c[];
	
	public static void main(String[] amit){
		
		n=in.nextInt();
		
		a=new long[n];
		
		b=new long[n-1];
		
		c=new long[n-2];
		
		long sumA=0,sumB=0,sumC=0;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
			sumA+=a[i];
			
		}
		
		for(int i=0;i<n-1;i++){
			
			b[i]=in.nextLong();
			
			sumB+=b[i];
			
		}
			
		for(int i=0;i<n-2;i++){
			
			c[i]=in.nextLong();
			
			sumC+=c[i];
			
		}
		
		System.out.println( sumA-sumB );
		
		System.out.println( sumB-sumC );
		
	}
	
}