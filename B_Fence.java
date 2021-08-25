import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Fence {
    
        static Scanner in=new Scanner();
    
   static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
     
   static int n,k;
   
   static int a[];
   
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new int[n+1];
        
        for(int i=1;i<=n;i++){
            
            a[i]=in.nextInt();
            
        }
        
        if(n==1 && k==1){
            
            out.println(1);
            out.flush();
            
            return;
            
            
        }
        
        int dp[]=new int[n+1];
        
        for(int i=1;i<=n;i++){
            
            dp[i]+=a[i]+dp[i-1];
            
          //  out.print(dp[i]+" ");
            //out.flush();
            
        }
        
        //out.println();
        //out.flush();
        
        int diff[]=new int[n-k+3];
        
        for(int i=2;i<=n-k+1;i++){
            
            diff[i]=dp[i+k-1]-dp[i-1];
            
          //  out.print(diff[i]+" ");
        //    out.flush();
            
        }
        
       // out.println();
        //out.flush();
        
        int min=dp[k],index=1;
        
        for(int i=2;i<=n-k+1;i++){
            
            if( min>=dp[i+k-1]-dp[i-1] ){
                
                index=i;
                
                min=dp[i+k-1]-dp[i-1];
                
            }
            
        }
        
        out.println(index);
        out.flush();
        
    }

     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

7 3
1 2 6 1 1 7 1


*/

/*

2 1
10 20

*/