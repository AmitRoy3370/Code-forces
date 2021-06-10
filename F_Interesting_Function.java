
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class F_Interesting_Function {

      static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
    
        static int testCases;
    
        static long l,r;
        
        static void solve(){
            
           long ans=0;
            
           while(r>l){
               
               ans+=r-l;
               
               r/=10;
               l/=10;
               
           }
           
           out.println(ans);
           out.flush();
           
        }
        
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            l=in.nextLong();
            r=in.nextLong();
            
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

4
1 9
9 10
10 20
1 1000000000


*/

/*

1
10 20

*/

/*

1
1 1000000000

*/