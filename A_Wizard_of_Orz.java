import java.util.Scanner;

public class A_Wizard_of_Orz{
	
	static Scanner in=new Scanner(System.in);
	
	static int testCases,n;
	
	static void solve(){
		
		if(n==1){
			
			System.out.println("9");
			
		}else if(n==2){
			
			System.out.println("98");
			
		}else if(n==3){
			
			System.out.println("989");
			
		}else{
			
			StringBuilder s=new StringBuilder();
			
			s.append("989");
			
			int y=0;
			
			for(int i=0;i<n-3;i++){
				
				s.append(y);
				
				y++;
				
				y%=10;
				
			}
			
			System.out.println(s);
			
		}
		
	}
	
	public static void main(String[] args){
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			solve();
			
		}
		
	}
	
}