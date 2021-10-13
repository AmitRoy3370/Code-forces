import java.util.Scanner;

public class A_Haiku{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] amit){
		
		String s[]=new String[3];
		
		s[0]=in.nextLine().toLowerCase();
		s[1]=in.nextLine().toLowerCase();
		s[2]=in.nextLine().toLowerCase();
		
		int a=0,b=0,c=0;
		
		for(int i=0;i<s[0].length();i++ ){
			
			if( s[0].charAt(i)=='a' ||
			s[0].charAt(i)=='e' ||
            s[0].charAt(i)=='i' || 
			s[0].charAt(i)=='o' ||
            s[0].charAt(i)=='u'){
				
				a++;
				
			}
			
		}
		
			for(int i=0;i<s[1].length();i++ ){
			
			if( s[1].charAt(i)=='a' ||
			s[1].charAt(i)=='e' ||
            s[1].charAt(i)=='i' || 
			s[1].charAt(i)=='o' ||
            s[1].charAt(i)=='u'){
				
				b++;
				
			}
			
		}
		
			for(int i=0;i<s[2].length();i++ ){
			
			if( s[2].charAt(i)=='a' ||
			s[2].charAt(i)=='e' ||
            s[2].charAt(i)=='i' || 
			s[2].charAt(i)=='o' ||
            s[2].charAt(i)=='u'){
				
				c++;
				
			}
			
		}
		
		if(a==5 && b==7 && c==5){
			
			System.out.print("YES");
			
		}else{
			
			System.out.print("NO");
			
		}
		
	}
	
}