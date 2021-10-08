import java.util.Scanner;

public class B_Equalize_Prices {

    static Scanner in=new Scanner(System.in);
    
    static int n,k,testCases;
    
    static int a[];
    
    static void solve(){
        
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        
        for(int i: a){
            
            min=Math.min(i,min);
            
            max=Math.max(i,max);
            
        }
        
        int need=min+k;
        
        for(int i: a){
            
            if( (i-k>need) ){
                
                System.out.println(-1);
                
                return;
                
            }
            
        }
        
        if( need>=max-k ){
            
            System.out.println( (min+k) );
            
        }
        
    }
    
    public static void main(String[] amit) {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            k=in.nextInt();
            
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
5 1
1 1 2 3 1
4 2
6 4 8 5
2 2
1 6
3 5
5 2 5


*/