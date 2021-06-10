import java.util.Scanner;

public class A_Search_for_Pretty_Integers{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] amit){
		
		int n=in.nextInt();
		int m=in.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[m];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		for(int i=0;i<m;i++){
			
			b[i]=in.nextInt();
			
		}
		
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<m;j++){
				
				if(a[i]==b[j]){
					
					ans=Math.min( ans,a[i] );
					
				}else{
					
					ans=Math.min(ans,10*a[i]+b[j] );
					ans=Math.min(ans,10*b[j]+a[i] );
					
				}
				
			}
			
		}
		
		System.out.println(ans);
		
	}
	
}