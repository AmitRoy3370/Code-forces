
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Ring {

     static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,k;
  
  static String s;
  
  static void solve(){
      
      char a[]=s.toCharArray();
      
      boolean done=false;
      
      int n=s.length();
     
      int c1=n+1;
      
      for(int i=0;i<n;i++){
          
          if( a[i]=='0' ){
              
            // out.println( 1+" "+(i+1)+" "+1+" "+i );
              //out.flush();
   
              c1=i;
              
              done=true;
              
              break;
              
          }
          
      }
      
     if( c1<n/2 ){
         
         out.println( (c1+1)+" "+n+" "+(c1+2)+" "+n );
         out.flush();
         
         return;
         
     }
      
     if( c1>=n/2 && c1<n+1 ){
         
         out.println( 1+" "+(c1+1)+" "+1+" "+c1 );
         out.flush();
         
         return;
         
     }
     
     out.println(1+" "+(n-1)+" "+2+" "+n );
     out.flush();
     
  }  
  
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            k=in.nextInt();
            s=in.next();
            
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

7
6
101111
9
111000111
8
10000000
5
11011
6
001111
3
101
30
100000000000000100000000000000


*/