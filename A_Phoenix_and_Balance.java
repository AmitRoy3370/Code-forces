
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Phoenix_and_Balance {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,n;
    
    static void solve(){
        
        if(n==2){
            
            out.println( (long)Math.abs( Math.pow(2,1)-Math.pow( 2,2 ) ) );
            out.flush();
            
            return;
            
        }
        
        int sum1=0,sum2=0;
            for(int i=1;i<n/2;i++){
             
                sum1+=(1<<i);
                
            }
                
                sum1+=(1<<n);
           
                for(int i=n/2;i<n;i++){
                sum2+=(1<<i);

                }
                
            out.println(Math.abs(sum1-sum2));
out.flush();  
            
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            solve();
            
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

2
2
4


*/