
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Red_and_Blue_Beans {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    
    static long r,b,d;
    
    static void solve(){
        
        if(d==0){
            
            if(r==b){
                
                out.println("YES");
          out.flush();
                
          return;
          
            }else{
                
                 out.println("NO");
          out.flush();
                
          return;
          
            }
            
        }
        
  if(b>r){
      
      long x=r*d+r;
      
      if(x>=b){
          
            out.println("YES");
          out.flush();
          
      }else{
          
            out.println("No");
          out.flush();
          
      }
      
  }else{
      
      long x=b*d+b;
      
      if(x>=r){
          
            out.println("YES");
          out.flush();
          
      }else{
          
            out.println("No");
          out.flush();
          
      }
      
  }
    
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            r=in.nextLong();
            b=in.nextLong();
            d=in.nextLong();
            
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
1 1 0
2 7 3
6 1 4
5 4 0


*/

/*

1
2 7 3

*/
