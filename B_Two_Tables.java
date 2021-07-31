
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Two_Tables {

         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases;    
    
static long w,h,x1,x2,y1,y2,W,H;

    static void solve(){
        
      if( x2-x1+w>W && y2-y1+h>H ){
          
          out.println(-1.00);
          out.flush();
      
          return;
          
      }
        
      long a=Long.MAX_VALUE,b=Long.MAX_VALUE,c=Long.MAX_VALUE,d=Long.MAX_VALUE;
      
      if( x2-x1+w<=W ){
          
          a=w-x1;
          b=x2-(W-w);
          
      }
      
      if(y2-y1+h<=H){
          
          c=h-y1;
          d=y2-(H-h);
          
      }
      
    double  ans=(double)Math.min( a,Math.min( b,Math.min(c,d) ) );
      
      out.println( (double)Math.max(ans,0) );
      out.flush();
      
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            W=in.nextLong();
            H=in.nextLong();
            
            x1=in.nextLong();
            y1=in.nextLong();
            x2=in.nextLong();
            y2=in.nextLong();
            
            w=in.nextLong();
            h=in.nextLong();
            
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

5
8 5
2 1 7 4
4 2
5 4
2 2 5 4
3 3
1 8
0 3 1 6
1 5
8 1
3 0 6 1
5 1
8 10
4 5 7 8
8 5


*/