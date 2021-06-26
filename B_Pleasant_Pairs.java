
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Pleasant_Pairs {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        int ans=0;
        
      for(int i=1;i<=n-1;i++){
          
          int multiple=(int) (a[i]-i);
          
         // int j=(int) (a[i]-i);
          
         for(int j=multiple;j<=n;j+=(a[i]) ){
             
             if(j>=1){
                 
                 if(a[i]*a[j]==i+j && j>i ){
                     
                     ans++;
                     
                 }
                 
             }
             
         }
          
      } 
        
      out.println(ans);
      out.flush();
      
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n+1];
            
            for(int i=1;i<=n;i++){
                
                a[i]=in.nextLong();
                
            }
            
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
