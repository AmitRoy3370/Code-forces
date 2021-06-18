
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class D_Deleting_Divisors {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static void solve(){
        
        if( (n & 1)>=1 ){
        out.println("Bob");
        out.flush();
    }
    else{
    	int ct=0;
        while(n%2==0){
            n/=2;
            ct++;
        }
        if(n>1){
            out.println("Alice");
            out.flush();
        }
        else{
            if(ct%2>=1){
                out.println("Bob");
                out.flush();
            }
            else{
                out.println("Alice");
                out.flush();
            }
        }
    }
        
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

4
1
4
12
69


*/