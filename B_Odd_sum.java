import java.util.Scanner;

public class B_Odd_sum{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static int a[];
	
    static void solve(){
		
		long dp[][]=new long[n][2];
		
		//0 for the even
		//1 for the odd

    /*for(int i=0;i<n;i++){
	
	    if( a[i]%2==0 ){
			
			dp[i][0]=a[i];
			
		}else{
			
			dp[i][1]=a[i];
			
		}
	
    }*/
	
	for(int i=0;i<n;i++){
		
		dp[i][0]=Integer.MIN_VALUE;
		dp[i][1]=Integer.MIN_VALUE;
		
	}
	
	if( a[0]%2!=0 ){
		
		dp[0][1]=a[0];
		
	}else{
		
		dp[0][0]=a[0];
		
	}
	
		for(int i=1;i<n;i++){
			
        if(a[i]%2!=0){
        
		  dp[i][1]=Math.max(Math.max(dp[i-1][1],dp[i-1][0]+a[i]),a[i]);
          dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+a[i]);

        }else{
        
          dp[i][1]=Math.max(dp[i-1][1],dp[i-1][1]+a[i]);
          dp[i][0]=Math.max(Math.max(dp[i-1][0],dp[i-1][0]+a[i]),a[i]);
        
		}
			
		}
		
		System.out.print( dp[n-1][1] );
		
	}
	
	public static void main(String [] amit){
		
		 n=in.nextInt();
		
		 a=new int[n];
		
		int evenSum=0,minPositiveOdd=Integer.MAX_VALUE;
		int maxNegativeOdd=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			if( a[i]>0 ){
				
				evenSum+=a[i];
				
			}
			
		    if( a[i]%2!=0&& a[i]<0  ){
				
				maxNegativeOdd=Math.max( maxNegativeOdd,a[i] );
				
			}
			
			if( a[i]%2!=0 && a[i]>0 ){
				
				minPositiveOdd=Math.min( minPositiveOdd,a[i] );
				
			}
			
		}
		
		solve();
		
	//	System.out.println("maxNegativeOdd: "+maxNegativeOdd);
		//System.out.println("minPositiveOdd: "+minPositiveOdd);
		
		/*if(evenSum%2==1){
			
			System.out.print(evenSum);
			
		}else{
		
            if( minPositiveOdd==Integer.MAX_VALUE ){
				
				System.out.print((evenSum+(maxNegativeOdd )));
				
			}else if( maxNegativeOdd==Integer.MIN_VALUE ){
				
				System.out.print( evenSum-minPositiveOdd );
				
			}else{ 
		
			System.out.print( evenSum-Math.min( minPositiveOdd,-maxNegativeOdd ) );
			
			}
			
		}*/
		
	}
	
}
