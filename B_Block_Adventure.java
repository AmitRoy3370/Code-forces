import java.util.Scanner;

public class B_Block_Adventure{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n,m,k;
	
	static int a[];
	
	static void solve(){
		
		boolean res=true;
		
		for(int i=1;i<n;i++){
			
			int num1=a[i];
			
			int num2=Math.max(0,num1-k );
			
			if( a[i-1]>num2 ){
				
				m+=a[i-1]-num2;
				
			}else{
				
				int diff=num2-a[i-1];
				
				if(diff>m){
					
					res=false;
					
					break;
					
				}else{
					
					m-=diff;
					
				}
				
			}
			
		}
		
		if(res){
			
			System.out.println("YES");
			
		}else{
			
			System.out.println("NO");
			
		}
		
		
	}
	
	public static void main(String[] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			 m=in.nextInt();
			 k=in.nextInt();
			
			a=new int[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
	}
	
}