import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A_Drinks_Choosing{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,k;
	
	static int a[];
	
	static Map<Integer,Integer> map=new HashMap<>();
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		k=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			map.put( a[i],map.getOrDefault(a[i],0)+1 );
			
		}
		
		int multipleTwo=0,ans=0;
		
		for(int i: map.keySet() ){
			
			multipleTwo+=map.get(i)%2;
			
			ans+=(map.get(i)/2 )*2;
			
		}
		
		ans+=( multipleTwo+1 )/2;
		
		System.out.print(ans);
		
	}
	
}