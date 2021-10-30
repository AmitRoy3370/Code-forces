import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A_Toy_Cars{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		int n=in.nextInt();
		
		int a[][]=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
			
			   a[i][j]=in.nextInt();
				
			}
			
		}
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=n;i++){
			
			boolean b=true;
			
			//int arr[]=new int[n+1];
			
			for(int j=1;j<=n;j++){
				
				//int input=in.nextInt();
				
				//arr[j]=input;
				
				if( a[i][j]==1 || a[i][j]==3 ){
					
					b=false;
					
					break;
					
				}
				
			}
			
			if( b ){
				
				list.add(i);
				
			}
			
		}
		
		System.out.println( list.size() );
		
		for(int i: list){
			
			System.out.print(i+" ");
			
		}
		
	}
	
}