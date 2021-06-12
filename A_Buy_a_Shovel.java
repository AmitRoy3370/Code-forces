
import java.util.Scanner;


public class A_Buy_a_Shovel {

    public static void main(String[] amit) {
        
        Scanner in=new Scanner(System.in);
        
        int k=in.nextInt();
        int r=in.nextInt();
        
        int i=k,count=1;
        
        while(true){
            
            if(k%10==0 || k%10==r){
                
                System.out.println(count);
                
                break;
                
            }
            
            k+=i;
            
            count++;
            
        }
        
    }
    
}
