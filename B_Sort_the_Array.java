import java.util.Scanner;
import java.util.Arrays;

public class B_Sort_the_Array {

    static Scanner in=new Scanner(System.in);
    
    public static void main(String[] amit) {
        
        int n=in.nextInt();
        
        long a[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        int st=0,end=0;
        
        for(int i=0;i<n-1;i++){
            
            if(a[i]>a[i+1]){
                
                st=i;
                
                 end=i;
                
                while(end<n-1 && a[end]>a[end+1] ){
                    
                    end++;
                    
                }
                
                break;
                
            }
            
        }
        
        
        Arrays.sort(a,st,end+1);
        
        for(int i=0;i<n-1;i++){
            
            if(a[i]>a[i+1]){
                
                System.out.println("no");
                
                return;
                
            }
            
        }
        
        System.out.println("yes");
        System.out.println( (st+1)+" "+(end+1) );
        
    }
    
}
/*

4
2 1 3 4


*/

/*

9
6 78 63 59 28 24 8 96 99

*/