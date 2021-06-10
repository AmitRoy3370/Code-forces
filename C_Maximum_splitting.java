import java.util.Scanner;

public class C_Maximum_splitting{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	public static void main(String[] amit){
		
		n=in.nextInt();
		
		for(int i=0;i<n;i++){
			
			int x=in.nextInt();
			
			if(x<=3 || x==5 || x==7 || x==11){
				
				System.out.println(-1);
				
			}else{
				
				if( x%2==0 ){
					
					System.out.println(x/4);
					
				}else{
					
					System.out.println( (x-9)/4+1 );
					
				}
				
			}
			
		}
		
	}
	
}