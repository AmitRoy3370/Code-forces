import java.util.Scanner;

public class A_Yellow_Cards{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		int a1=in.nextInt();
		int a2=in.nextInt();
		int k1=in.nextInt();
		int k2=in.nextInt();
		int n=in.nextInt();
	
		if( k2>k1 ){
			
			int temp=k1;
			k1=k2;
			k2=temp;
			
			temp=a1;
			a1=a2;
			a2=temp;
			
		}
		
		int max=Math.max(0,n-(k1-1)*a1-(k2-1)*a2 );
		
		int mm=Math.min(a2,n/k2  );
		
		 mm+=Math.min( a1,(n-mm*k2)/k1 );
		
		System.out.println( max+" "+mm );
		
	}
	
}