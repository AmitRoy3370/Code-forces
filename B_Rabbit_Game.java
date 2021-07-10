import java.util.Scanner;

public class B_Rabbit_Game{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static int a[];
	
	public static void main(String[] amit){
		
		n=in.nextInt();
		
		a=new int[n];
		
		boolean visit[]=new boolean[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		if(n==1 || n==2){
			
			System.out.println(n);
			
			return;
			
		}
		
		int left=1,right=1;
		
		int i=0;
		
		if(left>=n){
			
			System.out.println(n);
			return;
			
		}
		
		while( i+1<=n-1 && a[i]<=a[i+1] ){
			
			left++;
			
			visit[i]=true;
			
			i++;
			
		}
		
		//left++;
		
		i=n-1;
		
		while( i>0 && a[i]<=a[i-1] ){
			
			if( !visit[i] ){
			
			right++;
			
			visit[i]=true;
			
			i--;
			
			}else{
				
				break;
				
			}
			
		}
		
	//	right++;
		
		int ans=left+right;
		
		if(ans>n){
			
			ans=n;
			
		}
		
		System.out.println(ans);
		
	}
	
}