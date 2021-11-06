import java.util.Scanner;

public class B_Omkar_and_Infinity_Clock{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static long k;
	
	static int a[];
	
	static StringBuilder ans=new StringBuilder();
	
	static void solve(){
		
		if(n==1){
			
			ans.append(0).append("\n");
			
			return;
			
		}
		
		long haveToRotate=((k%2==0)?2:1);
		
		for(int rotation=1;rotation<=haveToRotate;rotation++){
			
			int max=a[0];
			
			for(int i: a){
				
				max=Math.max(i,max);
				
			}
			
			for(int i=0;i<n;i++){
				
				a[i]=max-a[i];
				
			}
			
		}
		
		for(int i: a){
			
			ans.append(i).append(" ");
			
		}
		
		ans.append("\n");
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			k=in.nextLong();
			
			a=new int[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
		System.out.print(ans);
		
	}
	
}