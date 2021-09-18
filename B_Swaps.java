import java.util.Scanner;

public class B_Swaps{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static int a[];
	static int b[];
	
	static void solve(){
		
		boolean flag=true;
		
		//best cases
		
		for(int i=0;i<n;i++){
			
			if( a[i]>=b[i] ){
				
				flag=false;
				
			}
			
		}
		
		if(flag){
			
			System.out.println(0);
		
return;
		
		}
		
		int arr[]=new int[2*n+1];
		
		for(int i=0;i<n;i++){
			
			arr[a[i]]=i;
			
			arr[b[i]]=arr[a[i]];
			
		}
		
		int min=Integer.MAX_VALUE,ans=Integer.MAX_VALUE;
		
		for(int i=1;i<=2*n;i++){
			
			if(i%2==1){
				
				min=Math.min(min,arr[i]);
				
			}else{
				
				ans=Math.min(ans,arr[i]+min);
				
			}
			
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String amit[]){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new int[n];
			
			b=new int[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			for(int i=0;i<n;i++){
				
				b[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
	}
	
}