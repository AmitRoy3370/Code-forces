import java.util.Scanner;

public class B_Negative_Prefixes{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static int a[],l[];
	
	static void solve(){
		
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				
				if( l[i]==0 ){
					
					if( a[i]<a[j] && l[j]==0 ){
						
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
					
				}else{
					
					break;
					
				}
				
			}
			
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
		
	}
	
	public static void main(String [] amit){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new int[n];
			
			l=new int[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextInt();
				
			}
			
			for(int i=0;i<n;i++){
				
				l[i]=in.nextInt();
				
			}
			
			solve();
			
		}
		
	}
	
}