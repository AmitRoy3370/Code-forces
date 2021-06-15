
import java.util.Scanner;


public class A_Divide_it {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            long n=in.nextLong();
            
            if(n==1){
                
                System.out.println(0);
                
                continue;
                
            }
            
            int ans=0;
            
            while(n>1){
                
                ans++;
                
                if(n%5==0){
                    
                    n=(4*n)/5;
                    
                }else if(n%3==0){
                    
                    n=(2*n)/3;
                    
                }else if(n%2==0){
                    
                    n=n/2;
                    
                }else if(n%2!=0 && n%3!=0 && n%5!=0){
                    
                    n=-1;
                    
                    break;
                    
                }
                
            }
            
            if(n<0){
                
                System.out.println("-1");
                
            }else{
                
                System.out.println(ans);
                
            }
            
        }
        
    }
    
}
/*

7
1
10
25
30
14
27
1000000000000000000


*/