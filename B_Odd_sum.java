import java.util.Scanner;

public class B_Odd_sum{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		int n=in.nextInt();
		
		int a[]=new int[n];
		
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
		
	//	System.out.println("maxNegativeOdd: "+maxNegativeOdd);
		//System.out.println("minPositiveOdd: "+minPositiveOdd);
		
		if(evenSum%2==1){
			
			System.out.print(evenSum);
			
		}else{
		
            if( minPositiveOdd==Integer.MAX_VALUE ){
				
				System.out.print((evenSum+(maxNegativeOdd )));
				
			}else if( maxNegativeOdd==Integer.MIN_VALUE ){
				
				System.out.print( evenSum-minPositiveOdd );
				
			}else{ 
		
			System.out.print( evenSum-Math.min( minPositiveOdd,-maxNegativeOdd ) );
			
			}
			
		}
		
	}
	
}