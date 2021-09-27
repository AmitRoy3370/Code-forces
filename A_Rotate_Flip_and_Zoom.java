import java.util.Scanner;

public class A_Rotate_Flip_and_Zoom{
	
	static Scanner in=new Scanner(System.in);
	
	static int n,m;
	
	public static void main(String [] amit){
		
		m=in.nextInt();
		
		n=in.nextInt();
		
		char a[][]=new char[n][];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.next().toCharArray();
			
        }
    
	
        for (int i = 0; i < 2 * m; i++) {
            for (int j = 0; j < 2 * n; j++) {
                System.out.print(a[j / 2][i / 2]);
            }
            System.out.println();
        }
		
	}
	
}
	
