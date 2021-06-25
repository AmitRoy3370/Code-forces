import java.util.Scanner;

public class B_Pillars{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static int a[];
	
	public static void main(String[] amit){
		
		n=in.nextInt();
		
		a=new int[n];
		
		int element=-1,pos=-1;
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			if(a[i]>element){
				
				element=a[i];
				pos=i;
				
			}
			
		}
		
		for(int i=1;i<n-1;i++){
			
			if( a[i-1]>a[i] && a[i+1]>a[i] ){
				
				System.out.println("NO");
				//out.flush();
			
return;
			
			}
			
		}
		
		System.out.println("YES");
	//	out.flush();
		
	}
	
}