import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Chemistry {

    static Scanner in=new Scanner(System.in);
    
    static char ch[]={'a','e','i','o','u'};
    
    static Map<Character,Boolean> map=new HashMap<>();
    
    static void detect(String s){
        
        char a[]=s.toCharArray();
        
        int n=a.length;
        
        for(int i=0;i<n;i++){
            
            if( map.containsKey(a[i]) && map.get(a[i]) ){
                
                System.out.print(a[i]);
                
                i+=2;
                
            }else{
                
                System.out.print(a[i]);
                
            }
            
        }
        
    }
    
    public static void main(String[] amit) {
        
        String a[]=in.nextLine().split(" ");
        
        for(char i: ch){
            
            map.put(i,true);
            
        }
        
        for(String i: a){
            
            detect(i);
            
            System.out.print(" ");
            
        }
        
    }
    
}
//zepelepenapa papapripikapa