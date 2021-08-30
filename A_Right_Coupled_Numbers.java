import java.util.Scanner;

public class A_Right_Coupled_Numbers{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] amit){
		
		int testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			long n=in.nextLong();
			
			int ans=0;
			
			for(long i=1;i*i<=n;i++){
				
				if(n%i==0){
					
					long j=n/i;
					
					if( Math.min(i,j)*2>=Math.max(i,j) ){
						
						ans=1;
						
						break;
						
					}
					
				}
				
			}
			
			System.out.println(ans);
			
		}
		
	}
	
}