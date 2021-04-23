
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class A_Sum_of_2050 {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    
    static String s;
    
    static void solve(){
        
        BigInteger big=new BigInteger(s);
        
        if( big.mod(BigInteger.valueOf(2050))!=BigInteger.valueOf(0) ){
           
            out.println(-1);
           
            out.flush();
        
        } else {
        
            long ans=0;
            
         BigInteger b=big.divide(BigInteger.valueOf(2050));
            
         String t=b.toString();
         
         for(int i=0;i<t.length();i++){
             
             ans+=Long.parseLong( String.valueOf(t.charAt(i)) );
             
         }
         
            out.println(ans);
            out.flush();
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            s=in.next();
            
            solve();
            
        }
        
    }
    
      static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
    
}
/*

6
205
2050
4100
20500
22550
25308639900

*/