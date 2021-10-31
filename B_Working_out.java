import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Working_out {
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,m;
    
    static long a[][];
    
    static void solve(){
        
        long upLeftDp[][]=new long[n+2][m+2];
        long downLeftDp[][]=new long[n+2][m+2];
        long rightDownDp[][]=new long[n+2][m+2];
        long upRightDp[][]=new long[n+2][m+2];
        
        for(int i=1;i<n;i++){
            
            for(int j=1;j<=m;j++){
                
                upLeftDp[i][j]=a[i][j]+Math.max(  upLeftDp[i-1][j], upLeftDp[i][j-1] );
                
            }
            
        }
        
        for(int i=1;i<=n;i++){
            
            for(int j=m;j>=1;j--){
                
                upRightDp[i][j]=a[i][j]+Math.max( upRightDp[i-1][j],upRightDp[i][j+1] );
                
            }
            
        }
        
        for(int i=n;i>=1;i--){
            
            for(int j=m;j>=1;j--){
                
                rightDownDp[i][j]=a[i][j]+Math.max( rightDownDp[i+1][j],rightDownDp[i][j+1] );
                
            }
            
        }
        
        for(int i=n;i>=1;i--){
            
            for(int j=1;j<=m;j++){
                
                downLeftDp[i][j]=a[i][j]+Math.max( downLeftDp[i+1][j],downLeftDp[i][j-1] );
                
            }
            
        }
        
        long ans=0;
        
        for(int i=2;i<n;i++){
            
            for(int j=2;j<m;j++){
                
                long ans1=upLeftDp[i-1][j]+rightDownDp[i+1][j]+downLeftDp[i][j-1]+upRightDp[i][j+1];
                
                long ans2=upLeftDp[i][j-1]+rightDownDp[i][j+1]+downLeftDp[i+1][j]+upRightDp[i-1][j];
                
                ans=Math.max( ans,Math.max(ans1,ans2) );
                 
            }
            
        }
        
        out.print(ans);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        m=in.nextInt();
        
        a=new long[n+1][m+1];
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=m;j++){
                
                a[i][j]=in.nextLong();
                
            }
            
        }
        
        in.close();
        
        solve();
        
    }
    		
    static long gcd(long a, long b)   
{   
  
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
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

3 3
100 100 100
100 1 100
100 100 100


*/