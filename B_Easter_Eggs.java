import java.util.Scanner;

public class B_Easter_Eggs{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		char a[]={'R','O','Y','G','B','I','V','G'};
		
		int n=a.length;
		
		int len=in.nextInt();
		
		int index=0;
		
		if( n>=len ){
			
			for(int i=0;i<len;i++){
				
				System.out.print( a[i] );
				
			}
			
		}else{
		
		char ans[]=new char[len];
		
		for(int i=0;i<n;i++){
			
			ans[i]=a[i];
			
		}
		
		for(int i=n;i<len;i++){
			
			ans[i]=ans[i-4];
			
		}
		
		for(char i: ans){
			
			System.out.print(i);
			
		}
		
		}
		
	}
	
}