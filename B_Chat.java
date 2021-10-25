import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Chat {
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,k;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new int[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
        }
        
        in.close();
        
        int dp[]=new int[n];
        
        for(int i=0;i<n;i++){
            
            dp[i]=1;
            
        }
        
        for(int i=0;i<n;i++){
            
            int up=Math.min( i+k,n-1 );
            
            int low=Math.max(0,i-k);
            
            if( a[i]==0 ){
                
                dp[i]=up-low+1;
                
                continue;
                
            }
            
            int u=Math.min(a[i]-1+k,n-1);
            
            if(u>=low){
                
                low=u+1;
                
            }
            
            dp[i]=dp[ a[i]-1 ]+up-low+1;
            
        }
        
        for(int i: dp){
            
            out.print(i+" ");
            out.flush();
            
        }
        
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

6 0
0 1 1 2 3 2


*/

/*

10 1
0 1 0 3 4 5 2 3 7 0


*/

/*

2 2
0 1


*/