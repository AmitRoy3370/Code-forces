
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Parallelepiped {

    static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static long a,b,c;
    
    public static void main(String[] args) throws IOException {
        
        a=in.nextLong();
        b=in.nextLong();
        c=in.nextLong();
        
        long s1=a,s2=b,s3=c;
        
        a=(long) Math.sqrt( ((s1*s3)/s2) );
        
        b=(long)Math.sqrt( ( (s1*s2)/s3 ) );
        
        c=(long)Math.sqrt( ( (s2*s3)/s1 ) );
        
        out.print( (4*(a+b+c)) );
        
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
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
}
