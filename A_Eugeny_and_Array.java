import java.util.Scanner;

public class A_Eugeny_and_Array{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,m,left,right;
	
	static int a[],prefixSum[];
	
	static StringBuilder ans=new StringBuilder();
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		m=in.nextInt();
		
		a=new int[n];
		
		//prefixSum=new int[n+1];
		
		int one=0,minusOne=0;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			if( a[i]==1 ){
				
				one++;
				
			}else{
				
				minusOne++;
				
			}
			
			//prefixSum[i]=prefixSum[i-1]+a[i];
			
		}
		
		/*for(int i: prefixSum){
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();*/
		
		for(int i=1;i<=m;i++){
			
			left=in.nextInt();
			
			right=in.nextInt();
			
			int distnce=( right-left )+1;
			
			if(distnce%2==0 && distnce/2<=one && distnce/2<=minusOne){
				
				//System.out.println(1);
				ans.append(1).append("\n");
				
			}else{
				
				//System.out.println(0);
				
				ans.append(0).append("\n");
				
			}
			
		}
		
		System.out.print(ans);
		
	}
	
}
/*

6 6
-1 -1 1 -1 -1 1
1 1
3 4
1 1
1 1
1 3
1 4

*/
