import java.util.Scanner;

public class A_Oseye_Sort {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int n=in.nextInt();
        
        char ch=in.next().charAt(0);
        
        if(ch=='a'){
            
            for(int i=1;i<=n;i++){
                
                System.out.print(i+" ");
                
            }
            
        }else{
            
            for(int i=n;i>=1;i--){
                
                System.out.print(i+" ");
                
            }
            
        }
        
    }
    
}
