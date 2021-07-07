
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Exciting_Bets {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases;

static long a,b;

static void solve(){
    
    if(a==b){
        
        out.println(0+" "+0);
        out.flush();
        
        return;
        
    }
    
    long difference=Math.abs(b-a);
      
    out.println( difference+" "+Math.min( Math.min(a,b)%difference,difference-Math.min(a,b)%difference ) );
    out.flush();
    
}
    
    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextInt();
        
    for(int t=0;t<testCases;t++){
        
        a=in.nextLong();
        b=in.nextLong();
        
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
    
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
    }
    
}
/*

4
8 5
1 2
4 4
3 9


*/