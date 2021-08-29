
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_A_Variety_of_Operations {

      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases;
    
  static long c,d;
  
  static void solve(){
      
      if(c==d && c!=0){
          
          out.println(1);
          out.flush();
          
      }else if(c==d && c==0 ){
          
          out.println(0);
          out.flush();
          
      }else if( (c+d)%2==0 ){
          
          out.println(2);
          out.flush();
          
      }else{
          
          out.println(-1);
          out.flush();
          
      }
      
  }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            c=in.nextLong();
            
            d=in.nextLong();
            
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
1 2
3 5
5 3
6 6
8 0
0 0


*/