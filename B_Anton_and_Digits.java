
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Anton_and_Digits {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long k2,k3,k5,k6;
    
    public static void main(String[] amit) throws IOException {
        
        k2=in.nextLong();
        
        k3=in.nextLong();
        
        k5=in.nextLong();
        
        k6=in.nextLong();
        
        long n256=Math.min(k2, Math.min(k5, k6));
        
        //out.println( n256 );
        
        //out.flush();
        
        long n32=( Math.min( k3,k2-n256 ) );
        
        out.print( (32*n32+256*n256) );
        
        out.flush();
        
    }
    
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer( in.readLine() );
                
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

double nextDouble() throws IOException{
    
    return Double.parseDouble( next() );
    
}
        
    }
    
}
/*

5 1 3 4

1 1 1 1

*/