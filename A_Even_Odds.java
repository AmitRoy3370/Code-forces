
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Even_Odds {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] amit) throws IOException {
        
       long n=in.nextLong();
        
       long k=in.nextLong();
       
     /*if(k>=n/2){
         
         k=Math.abs(k-n);
         
         if(n%2!=0 && k>0 ){
             
             k--;
             
         }
         
         out.print( (2*k) );
         out.flush();
         
     }else{
         
          out.print( (2*k-1) );
         out.flush();
         
     }*/
       
     long jore=0,bijore=0;
     
     if(n%2==0){
         
         jore=n/2;
         bijore=(n/2);
         
     }else{
         
         jore=(n/2-1);
         
         bijore=(n/2)+1;
         
     }
     
     if( bijore>=k ){
         
         out.println( (long)( 2*(Math.abs(k))-1 ) );
         out.flush();
         
     }else{
         
         k=Math.abs(k-bijore);
         
          out.println( (long)( 2*(Math.abs(k)) ) );
         out.flush();
         
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
