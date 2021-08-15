import java.util.Scanner;

public class B_Sereja_and_Suffixes{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] amit){
		
		int n,m;
		
		n=in.nextInt();
		
		m=in.nextInt();
		
		int a[]=new int[n];
		
		int l[]=new int[m];
		
		int max=0;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			max=Math.max(a[i],max);
			
		}
		
		boolean visit[]=new boolean[max+1];
		
		int cnt[]=new int[n];
		
		for(int i=n-1;i>=0;i--){
			
		if( !visit[ a[i] ] ){
			
			cnt[i]++;
			
			visit[a[i]]=true;;
			
		}
			
		}
		
		//cnt[n-1]=1;
		
		for(int i=n-2;i>=0;i--){
			
			cnt[i]+=cnt[i+1];
			
		}
		
		for(int i=0;i<m;i++){
			
			l[i]=in.nextInt()-1;
			
			System.out.println( cnt[l[i]] );
			
		}
		
	
	}
	
}