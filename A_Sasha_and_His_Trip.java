import java.util.Scanner;

public class A_Sasha_and_His_Trip{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,v;
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		v=in.nextInt();
		
		if( v>=n-1 ){
			
			System.out.println(n-1);
			
			return;
			
		}
		
		int ans=v-1;
		
		for(int i=1;i<=n-v;i++){
			
			ans+=i;
			
		}
		
		System.out.println(ans);
		
	}
	
}