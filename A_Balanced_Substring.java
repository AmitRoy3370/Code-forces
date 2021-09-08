
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A_Balanced_Substring {

    static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
    
  static char a[];
  
  static void solve(){
      
      Set<Character> set=new HashSet<>();
      
      for(char i: a){
          
          set.add(i);
          
      }
      
      if( set.size()<=1 ){
          
          out.println(-1+" "+(-1) );
          out.flush();
          
          return;
          
      }
      
     for(int i=0;i<n-1;i++){
         
         if(a[i]!=a[i+1]){
             
             out.println( (i+1)+" "+(i+2) );
             out.flush();
             
             return;
             
         }
         
     }
     
     out.println(-1+" "+(-1) );
     out.flush();
     
  }
    
    public static void main(String[] amit) throws IOException {
        
      testCases=in.nextInt();
        
      for(int t=0;t<testCases;t++){
          
          n=in.nextInt();
          
          a=in.next().toCharArray();
          
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

4
1
a
6
abbaba
6
abbaba
9
babbabbaa


*/

/*

1
6
abbaba

*/