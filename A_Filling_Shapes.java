
import java.util.Scanner;


public class A_Filling_Shapes {

    static Scanner in =new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int n=in.nextInt();
        
        if(n==1){
            
            System.out.println(0);
            
            return;
            
        }
        
        int f[]=new int[n+1];
        
        f[1]=0;
        f[0]=1;
        
        for(int i=2;i<=n;i++){
            
            f[i]=2*f[i-2];
            
        }
        
        System.out.println( f[n] );
        
    }
    
}
