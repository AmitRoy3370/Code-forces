import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C_Yet_Another_Array_Restoration{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static int x,y;
	
	static void solve(){
		
		List<Integer> list=new ArrayList<>();
		
		int difference=0;
		
		for(int i=1;i<=y-x;i++){
			
			if( (y-x)%i==0 && (1+(y-x)/i)<=n ){
				
				difference=i;
				
				break;
				
			}
			
		}
		
		list.add( x );
		list.add(y);
		
		for(int i=x+difference;i<y;i+=difference){
			
			list.add(i);
			
		}
		
		int maximum_reach=y;
		int current=x-difference;
		
		while(list.size()<n && current>0 ){
			
			list.add(current);
			
			current-=difference;
			
			if(list.size()==n ){
				
				break;
				
			}
			
		}
		
		current=y+difference;
		
		while(list.size()<n ){
			
			list.add(current);
			
			current+=difference;
			
			if(list.size()==n ){
				
				break;
				
			}
			
		}
		
		for(int i: list){
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			x=in.nextInt();
			
			y=in.nextInt();
			
			solve();
			
		}
		
	}
	
}