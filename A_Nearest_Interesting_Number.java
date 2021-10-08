import java.util.Scanner;

public class A_Nearest_Interesting_Number{
	
	static Scanner in=new Scanner(System.in);
	
	static int sum(int n){
		
		int sum=0;
		
		while(n>0){
			
			sum+=n%10;
			
			n/=10;
			
		}
		
		return sum;
		
	}
	
	public static void main(String [] amit){
		
	int	n=in.nextInt();
		
		while( sum(n)%4!=0 ){
			
			n++;
			
		}
		
		System.out.print(n);
		
	}
	
}