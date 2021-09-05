
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Carrying_Conundrum {
    
      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

  static int testCases;
    
  static char a[];
  
  static boolean isPerfectSquare(long x)
{
 
    if (x >= 0) {
 
        long sr = (long) Math.sqrt(x);
 
 
        return (sr * sr == x);
    }
 
    return false;
}
  
  static void solve(){
      
      int n=a.length;
      
      int even=0,odd=0;
      
      for(int i=((n%2==1)?0:1);i<n;i+=2){
          
      odd=odd*10+( a[i]-'0' );
          
      }
      
        for(int i=((n%2==1)?1:0);i<n;i+=2){
          
      even=even*10+( a[i]-'0' );
          
      }
      
      out.println((long)(even + 1) * (long)(odd + 1) -2);
      out.flush();
        
  }
  
    public static void main(String[] amit) throws IOException {
        
      testCases=in.nextInt();
        
      for(int t=0;t<testCases;t++){
          
          a=in.next().toCharArray();
          
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
100
12
8
2021
10000


*/