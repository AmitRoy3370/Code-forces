import java.util.Scanner;

public class B_Eugeny_and_Play_List{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,m;
	
	static long c[],v[],t[],prefixSum[];
	
	static StringBuilder sb=new StringBuilder();
	
	static void solve(long search){
		
		int left=1,right=n;
		
		int ans=-1;
		
		while(right>=left){
			
			int mid=(left+right)/2;
			
			if( prefixSum[mid]<search ){
				
				left=mid+1;
				
			}else{
				
				right=mid-1;
				
				ans=mid;
				
			}
			
		}
		
		//System.out.println(ans);
		
		sb.append(ans).append("\n");
		
	}
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		m=in.nextInt();
		
		c=new long[n];
		
		t=new long[n];
		
		v=new long[m];
		
		for(int i=0;i<n;i++){
			
			c[i]=in.nextLong();
			
			t[i]=in.nextLong();
			
		}
		
		prefixSum=new long[n+1];
		
		for(int i=1;i<=n;i++){
			
			prefixSum[i]=prefixSum[i-1]+t[i-1]*c[i-1];
			
		}
		
		for(int i=0;i<m;i++){
			
			v[i]=in.nextLong();
			
			solve(v[i]);
			
		}
		
		System.out.println(sb);
		
	}
	
}