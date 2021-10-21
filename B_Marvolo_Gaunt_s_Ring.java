
import java.util.Scanner;

public class B_Marvolo_Gaunt_s_Ring {
    
    static Scanner in=new Scanner(System.in);
    
    static int n,p,q,r;
    
    static long a[];
    
    public static void main(String[] amit) {
        
        n=in.nextInt();
        p=in.nextInt();
        q=in.nextInt();
        r=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        long dp[][]=new long[n+1][4];
        
        for(int i=0;i<=n;i++){
            
            for(int j=0;j<=3;j++){
                
                dp[i][j]=Long.MIN_VALUE;
                
            }
            
        }
        
        dp[0][0]=0;
        
        for(int i=1;i<=n;i++){
            
            dp[i][1]=Math.max( dp[i-1][1],a[i-1]*p );
            dp[i][2]=Math.max( dp[i-1][2],a[i-1]*q+dp[i][1] );
            dp[i][3]=Math.max(dp[i-1][3],a[i-1]*r+dp[i][2]);
            
        }
        
        System.out.println(dp[n][3]);
        
    }
    
}
/*

5 1 2 3
1 2 3 4 5


*/

/*

5 1 2 -3
-1 -2 -3 -4 -5


*/