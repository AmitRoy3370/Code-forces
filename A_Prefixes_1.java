
import java.util.Scanner;


public class A_Prefixes_1 {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int n=in.nextInt();
        
        char ch[]=in.next().toCharArray();
        
        int count=0;
        
        for(int i=0;i<n-1;i+=2){
            
            if(ch[i]=='a'){
                
                if(ch[i+1]!='b'){
                    
                    count++;
                    
                    ch[i+1]='b';
                    
                }
                
            }else{
                
                if(ch[i+1]!='a'){
                    
                    count++;
                    
                    ch[i+1]='a';
                    
                }
                
            }
            
        }
        
        System.out.println(count);
        
        System.out.println(ch);
        
    }
    
}
