import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class B_Cutting{
	
	static int n,k;
	
	static int a[];
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] amit){
		
		n=in.nextInt();
		
		k=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		List<Integer> list=new ArrayList<>();
		
		int even=0,odd=0;
		
	for(int i=0;i<n;i++){
		
		if( a[i]%2==0 ){
			
			even++;
			
		}else{
			
			even--;
			
		}
		
		if(i<n-1 && even==0){
			
		//	System.out.println("even: "+even+" odd: "+odd);
			
			list.add( Math.abs( a[i]-a[i+1] ) );
			
		}
		
	}
	
	int m=list.size(),ans=0;
	
	Collections.sort(list);
	
	int have=0;
	
for(int i: list){
	
	have+=i;
	
	if( have>k ){
		
		break;
		
	}else{
		
		ans++;
		
	}
	
	//System.out.println(i+" ");
	
}
	
	//System.out.println("\n");
	
	System.out.println(ans);
	
	}
	
}