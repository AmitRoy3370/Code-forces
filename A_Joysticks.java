import java.util.Scanner;

public class A_Joysticks{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		int a1=in.nextInt();
		
		int a2=in.nextInt();
		
		int ans=0;
		
		while(a1>=1 && a2>=1 && (a1!=1 || a2!=1) ){
			
			//a1-=2;
			//a2++;
			
			if(a2>a1){
			
			int temp=a1;
			a1=a2;
			a2=temp;
			
			}
			
			a1-=2;
			a2++;
			
			ans++;
			
		}
		
		System.out.println(ans);
		
	}
	
}