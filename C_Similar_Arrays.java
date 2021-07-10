import java.util.Scanner;
import java.util.Arrays;

public class C_Similar_Arrays{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] amit){
		
		int n;
		
		n=in.nextInt();
		
		long a[]=new long[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
		}
		
		Arrays.sort(a);
		
		long mid=a[n/2];
		
		long sum=0;
		
		for(long i: a){
			
			sum+=Math.abs(i-mid);
			
		}
		
		System.out.println(sum);
		
	}
	
}