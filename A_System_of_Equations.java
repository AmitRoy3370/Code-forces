
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_System_of_Equations {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long n,m;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextLong();
        m=in.nextLong();
        
        long size=Math.max(n,m),count=0;
        
        for(int i=0;i<=size;i++){
            
            for(int j=0;j<=size;j++){
                
               if( Math.pow(j, 2)+i==n && Math.pow(i, 2)+j==m ){
                   
                   count++;
                   
               }
                
            }
            
        }
        
        out.print(count);
        out.flush();
        
    }
 
      static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer( in.readLine() );
                
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

double nextDouble() throws IOException{
    
    return Double.parseDouble( next() );
    
}
        
    }
    
}
//9 3
//14 28
//4 20
