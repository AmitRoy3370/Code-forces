import java.util.Scanner;

public class A_Magic_Numbers {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        String s=in.next();
        
        s = s.replaceAll("144", "a");
        s = s.replaceAll("14", "b");
        s = s.replaceAll("1", "c");
        
       char a[]=s.toCharArray();
        
       /*if(a[0]!='1'){
           
           System.out.println("NO");
           
           return;
           
       }*/
       
       int c=0;
       
        for( char i: a ){
            
           if( i>='0' && i<='9' ){
               
               c++;
               
           }
            
        }
        
        if(c>0){
            
            System.out.println("NO");
            
            return;
            
        }
        
        System.out.println("YES");
        
    }
    
}
