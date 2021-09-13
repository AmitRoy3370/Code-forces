import java.util.Scanner;

public class B_New_Skateboard{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] amit){
		
		char a[]=in.next().toCharArray();
		
		long ans=0;
		int n=a.length;
		
		for(int i=0;i<n;i++){
			
			int signleDigit=(a[i]-'0');
			
			if( signleDigit%4==0 ){
				
				ans++;
				
			}
			
			if(i>0){
				
				int secondDigit=(a[i-1]-'0');
				
				if( (secondDigit*10+signleDigit)%4==0 ){
					
					ans+=i;
					
				}
				
			}
			
		}
		
		System.out.println(ans);
		
		
	}
	
}