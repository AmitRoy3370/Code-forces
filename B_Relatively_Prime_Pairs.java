import java.util.Scanner;

public class B_Relatively_Prime_Pairs{
	
	static Scanner in=new Scanner(System.in);
	
	static long a,b;
	
	public static void main(String [] amit){
		
		a=in.nextLong();
		
		b=in.nextLong();
		
		if( a==b || (b-a+1)/2!=(b-a+1)/2 ){
			
			System.out.print("NO");
			
		}else{
			
			System.out.println("YES");
			
			long y=0;
			
			for(long i=a;i<=b && y<=(b-a+1)/2 ;i+=2,y++){
				
				System.out.println(i+" "+(i+1) );
				
			}
			
		}
		
	}
	
}