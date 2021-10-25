import java.util.Scanner;

public class B_Luntik_and_Subsequences {

    static Scanner in=new Scanner(System.in);
    
    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        long one=0,zero=0;
        
        for(long i: a){
            
            if(i==0){
                
                zero++;
                
            }else if(i==1){
                
                one++;
                
            }
            
        }
        
        System.out.println( ( (1L<<zero)*one ) );
        
    }
    
    public static void main(String[] amit) {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
            }
            
            solve();
            
        }
        
    }
    
}
/*

5
5
1 2 3 4 5
2
1000 1000
2
1 0
5
3 0 2 1 1
5
2 1 0 3 0


*/