import java.util.Scanner;

public class A_Greg_s_Workout{
	
	static Scanner in=new Scanner(System.in);
	
	static int n;
	
	static int a[];
	
	public static void  main(String [] amit){
		
		n=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		int chess=0,biceps=0,back=0;
		
		for(int i=0;i<n;i+=3){
			
			chess+=a[i];
			
		}
		
		for(int i=1;i<n;i+=3){
			
			biceps+=a[i];
			
		}
		
		for(int i=2;i<n;i+=3){
			
			back+=a[i];
			
		}
		
		if( Math.max( chess,Math.max( biceps,back ) )==chess ){
			
			System.out.print( "chest" );
			
		}else if(Math.max( chess,Math.max( biceps,back ) )==biceps ){
			
			System.out.println("biceps");
			
		}else{
			
			System.out.print("back");
			
		}
		
	}
	
}