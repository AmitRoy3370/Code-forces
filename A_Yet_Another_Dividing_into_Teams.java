
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class A_Yet_Another_Dividing_into_Teams {

    static Scanner in=new Scanner(System.in);
    
    static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
        Arrays.sort(a);
        
     Queue<Integer> q=new PriorityQueue<>();
            
     q.add(a[0]);
     
     for(int i=1;i<n;i++){
         
         if( !q.contains(a[i]-1) ){
             
             q.add(a[i]);
             
         }
         
     }    
     
        System.out.println( q.size()==n?1:2 );
     
    }
    
    public static void main(String[] args) {
        
         testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            solve();
            
        }
        
    }
    
}
/*

4
4
2 10 1 20
2
3 6
5
2 3 4 99 100
1
42


*/

/*

1
4
4 5 2 3

*/