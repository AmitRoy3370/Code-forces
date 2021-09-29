import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A_Remove_Duplicates1{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String []amit){
		
		int n=in.nextInt();
		
		int a[]=new int[n];
		
		ArrayList<Integer> set=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
					
		}
					
		for(int i=n-1;i>=0;i--){			
					
			if( !set.contains(a[i]) ){
				
			//	System.out.print(a[i]+" ");
				
				set.add(a[i]);
				
			}	
					
		}
		
		System.out.println( set.size() );
		
		for(int i=set.size()-1;i>=0;i-- ){
			
			System.out.print(set.get(i)+" ");
			
		}
		
	}
	
}