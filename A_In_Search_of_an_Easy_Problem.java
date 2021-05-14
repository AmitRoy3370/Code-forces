import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A_In_Search_of_an_Easy_Problem{
	
	static Scanner in=new Scanner(System.in);
	
	static Map<Integer,Integer> map=new HashMap<>();
	
	public static void main(String[] amit){
		
		map.put(0,0);
		map.put(1,0);
		
		int n=in.nextInt();
		
		for(int i=0;i<n;i++){
			
			int x=in.nextInt();
			
			map.put( x,map.get(x)+1 );
			
		}
		
		if( map.get(1)>0 ){
			
			System.out.println("HARD");
			
		}else{
			
			System.out.println("EASY");
			
		}
		
	}
	
}