
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Orac_and_Models {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        int dp[]=new int[n+1];
        
        for(int i=1;i<=n;i++){
            
            dp[i]=1;
            
        }
        
        int ans=0;
        
       /* for(int i=1;i<n;i++){
            
            if(a[0]<a[i]){
                
                dp[i]=Math.max(dp[i],dp[0]+1);
                
                ans=Math.max(ans,dp[i]);
                
            }
            
        }*/
        
        for(int i=1;i<=n;i++){
            
            for(int j=2*i;j<=n;j+=i){
                
         //       if( j==0 || i%j==0){
                    
                    if( a[i]<a[j] ){
                        
                        dp[j]=Math.max(dp[j], dp[i]+1);
                        
                        ans=Math.max(ans,dp[j]);
                        
                    }
                    
           //     }
                
               // out.println("stped at j: "+j);
                //out.flush();
                
            }
            
        }
        
        ans=0;
        
        for(int i: dp){
            
            ans=Math.max(ans,i);
            
        }
        
        out.println(ans);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n+1];
            
            for(int i=1;i<=n;i++){
                
                a[i]=in.nextLong();
                
            }
            
            solve();
            
        }
        
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
    }
    
}
/*

4
4
5 3 4 6
7
1 4 2 3 6 4 9
5
5 4 3 2 1
1
9


*/

/*

1
4
5 3 4 6

*/