import java.util.Scanner;

public class C_Letters{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,m;
	
	static long a[],prefixSum[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		m=in.nextInt();
		
		a=new long[n+1];
		
		prefixSum=new long[n+1];
		
		for(int i=1;i<=n;i++){
			
			a[i]=in.nextLong();
			
			prefixSum[i]=prefixSum[i-1]+a[i];
			
		}
		
		int left=1,right=n;
		
		for(int i=1;i<=m;i++){
			
			long roomNumber=in.nextLong();
			
			right=n;
			
			int ans=1;
			
			while(right>=left){
				
				int mid=(left+right)/2;
				
				if( prefixSum[mid]>=roomNumber ){
					
					ans=mid;
					
					right=mid-1;
					
				}else{
					
					left=mid+1;
					
				}
				
			}
			
			System.out.println( ans+" "+(roomNumber- prefixSum[ans-1]) );
			
			left=ans;
			
		}
		
	}
	
}