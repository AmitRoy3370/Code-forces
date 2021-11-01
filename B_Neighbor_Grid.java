import java.util.Scanner;

public class B_Neighbor_Grid{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n,m;
	
	static long a[][];
	
	static void solve(){
		
		n=in.nextInt();
		m=in.nextInt();
		
		a=new long[n][m];
		
		boolean b=true;
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<m;j++){
				
				long k=in.nextLong();
				
				if( i!=0 && j!=0 && i!=n-1 && j!=m-1 ){
					
					a[i][j]=4;
					
				}else if( (i==0 && (j==0 || j==m-1)) || (j==0 && (i==0 || i==n-1)) || (i==n-1 && j==m-1) ){
					
					a[i][j]=2;
					
				}else{
					
					a[i][j]=3;
					
				}
				
				if( a[i][j]<k ){
					
					//System.out.println("NO");
					
					b=false;
					
				//	break;
					
				}
				
			}
			
		}
		
		if(b){
		
		System.out.println("YES");
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<m;j++){
				
				System.out.print(a[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
		
		}else{
			
			System.out.println("NO");
			
		}
		
		in.nextLine();
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		while(testCases-->0){
			
			//n=in.nextInt();
			
			//m=in.nextInt();
			
		//	a=new long[n][m];
			
			solve();
			
		}
		
	}
	
}