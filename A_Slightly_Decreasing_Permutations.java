
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Slightly_Decreasing_Permutations {

static Scanner in=new Scanner();
    
static PrintWriter out=new PrintWriter(System.out);

static long n,k;

    public static void main(String[] amit) throws IOException {
        
        n=in.nextLong();
        k=in.nextLong();
        
        for(long i=n;i>=n-k+1;i--){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        for(long i=1;i<=n-k;i++){
            
            out.print(i+" ");
            out.flush();
            
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
