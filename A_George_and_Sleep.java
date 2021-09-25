
import java.util.Scanner;

public class A_George_and_Sleep{
	
	static Scanner in=new Scanner(System.in);
	
	public static void main(String a[]){
		
		int h[]=new int[2];
		int m[]=new int[2];
		
		 for(int i = 0; i < 2; i++){
    	
		String s[]=in.next().split(":");
		
		h[i]=Integer.parseInt( s[0] );
		
		m[i]=Integer.parseInt( s[1] );
		
		 }
    h[0] -= h[1];
    m[0] -= m[1];
    if (m[0] < 0){
	
	m[0] += 60; h[0]--;
	
	}
    if (h[0] < 0)
    	h[0] += 24;
    System.out.printf("%02d:%02d\n", h[0], m[0]);
		
	}
	
}