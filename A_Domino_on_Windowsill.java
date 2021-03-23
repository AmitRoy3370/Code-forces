
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Domino_on_Windowsill {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);

static int testCases,n,k1,k2,w,b;
    
static void solve(){
    
  if( 2*w<=k1+k2 && 2*b<=(n-k1)+(n-k2) ){
      
      out.println("YES");
      
      out.flush();
      
      return;
      
  }
    
    out.println("NO");
    
    out.flush();
    
}

    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();

for(int t=0;t<testCases;t++){
    
    n=in.nextInt();
    k1=in.nextInt();
    k2=in.nextInt();
    w=in.nextInt();
    b=in.nextInt();
    
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
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

5
1 0 1
1 0
1 1 1
0 0
3 0 0
1 3
4 3 1
2 2
5 4 3
3 1

*/

/*

1
1 0 1
1 0

*/