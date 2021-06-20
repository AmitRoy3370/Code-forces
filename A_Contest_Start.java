
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Contest_Start {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long testCases,n,x,t;
    
    static void solve(){
        
        long value=Math.min(n-1,t/x);
        
        if(value==0){
            
            out.println(0);
            out.flush();
            
            return;
            
        }
        
        long y=value*(value-1)/2;
        
        long sum=Math.max(0,y)+value*(n-value);
        
        out.println(sum);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextLong();
        
        for(long i=0;i<testCases;i++){
            
            n=in.nextLong();
            x=in.nextLong();
            t=in.nextLong();
            
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
4 2 5
3 1 2
3 3 10
2000000000 1 2000000000


*/