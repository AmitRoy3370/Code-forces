import java.util.Scanner;

public class B_Equidistant_String{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		char a[]=in.next().toCharArray();
		
		char b[]=in.next().toCharArray();
		
		StringBuilder ans=new StringBuilder();
		
		int n=a.length,count=0;
		
		for(int i=0;i<n;i++){
			
			if(a[i]!=b[i]){
				
				count++;
				
			}
			
		}
		
		if(count%2!=0){
			
			System.out.print("impossible");
			
			return;
			
		}
		
		count/=2;
		
		for(int i=0;i<n;i++){
			
			if( a[i]!=b[i] ){
				
				if( count>=1 ){
					
					ans.append(a[i]);
					
					--count;
					
				}else{
					
					ans.append(b[i]);
					
				}
				
			}else{
				
				ans.append( a[i] );
				
			}
			
		}
		
		System.out.print(ans);
		
	}
	
}