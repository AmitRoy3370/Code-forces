import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class C_Yet_Another_Broken_Keyboard{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,k;
	
	static char a[],c[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		k=in.nextInt();
		
		a=in.next().toCharArray(); 
		
		c=new char[k];
		
		for(int i=0;i<k;i++){
			
			c[i]=in.next().charAt(0);
			
		}
		
		Map<Character,Boolean> map=new HashMap<>();
		
		for(char i: c){
			
			map.put(i,true);
			
		}
		
		long ans=0;
		
		for(int i=0;i<n;i++){
			
			long counter=0;
			
	        while( i<n && map.containsKey(a[i]) ){
				
				counter++;
				
				i++;
				
			}
			
			if(counter!=0){
				
			//	++counter;
				
			}
			
			//System.out.println("counter: "+counter);
			
			ans+=((counter+1)*counter)/2;
			
		}
		
		System.out.println(ans);
		
	}
	
}