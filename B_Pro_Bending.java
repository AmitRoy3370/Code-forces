import java.util.Scanner;

public class B_Pro_Bending {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int n,k;
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
        }
        
        for(int i: a){
            
            if(i>k){
                
                System.out.println("Difficult Loss");
                
                return;
                
            }
            
        }
        
        System.out.println("Easy Win!");
        
    }
    
}
