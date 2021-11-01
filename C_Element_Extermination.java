import java.util.Scanner;

public class C_Element_Extermination{
	
	static int testCases,n;
	
	static int a[];
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new int[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			System.out.println( ( a[n-1]>a[0]?"YES":"NO" ) );
			
		}
		
	}
	
}