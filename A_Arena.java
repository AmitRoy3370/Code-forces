
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Arena {

    static Scanner scanner=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    public static void main(String[] args) throws IOException {
     
       testCases=scanner.nextInt();
        
       for(int t=0;t<testCases;t++){
           
           n=scanner.nextInt();
           
           long a[]=new long[n];
           
           long min=Long.MAX_VALUE;
           
           for(int i=0;i<n;i++){
               
               a[i]=scanner.nextLong();
               
               min=Math.min(min, a[i]);
               
           }
           
           long ans=0;
           
          for(long i: a){
              
              if( min!=i ){
                  
                  ans++;
                  
              }
              
          }
           
          out.println(ans);
          
          out.flush();
          
       }
       
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
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

3
3
3 2 2
2
5 5
4
1 3 3 7

*/