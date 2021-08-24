import java.util.Scanner;

public class A_Add_sweets {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            int n=in.nextInt();
            
            System.out.println(n);
            
            for(int i=1;i<=n;i++){
            
                System.out.print(i+" ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
