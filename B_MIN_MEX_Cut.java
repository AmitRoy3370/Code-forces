import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_MIN_MEX_Cut {

      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases;
  
  static char s[];
  
  static void solve(){
      
      int n=s.length,c=0,k=0;
      
      for(int i=0;i<n;i++){
          
          if( s[i]=='0' ){
              
              c=1;
              
          }else if( s[i]=='1' && c==1 ) {
              
              k++;
              
              c=0;
              
          }
          
      }
      
      if( s[n-1]=='0' ){
          
          k++;
          
      }
      
      out.println( Math.min(k,2) );
      out.flush();
      
  }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int i=0;i<testCases;i++){
            
            s=in.next().toCharArray();
            
            solve();
            
        }
   
        in.close();
        
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

6
01
1111
01100
101
0000
01010


*/