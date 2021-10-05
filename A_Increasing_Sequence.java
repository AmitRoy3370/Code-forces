import java.util.Scanner;

public class A_Increasing_Sequence{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,d;
	
	static int a[];
	
	public static void main(String [] amit){
		
		n=in.nextInt();
		
		d=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		long ans=0;
		
		for(int i=1;i<n;i++){
			
			if( !(a[i]>a[i-1]) ){
				
				int added=0;
				
				if( a[i]==a[i-1] ){
					
					a[i]+=d;
					
					added++;
					
				}else{
					
					long diff=Math.abs(a[i]-a[i-1])+1;
					
					added=(int)Math.ceil((double)diff/(double)d);
					
					a[i]+=(int)Math.ceil((double)diff/(double)d)*d;
					
				}
				
				/*while( a[i]<=a[i-1] ){
					
					a[i]+=d;
					
					added++;
					
				}*/
				
				ans+=added;
				
			}
			
		}
		
		/*for(int i: a){
			
			System.out.print(i+" ");
			
		}
		
		System.out.println();*/
		
		System.out.println(ans);
		
	}
	
}