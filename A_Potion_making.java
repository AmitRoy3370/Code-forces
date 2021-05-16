
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Potion_making {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,k;
    
    static int gcd(int a,int b){
    
    if(b==0){
    
        return a;
        
    }
        
    return gcd(b,a%b);    
    
    }
    
    static void solve(){
    
        if(k==100)
        {
            
            out.println(1);
            out.flush();
        
            return;
            
        }    
    
      int g=gcd(k,100-k);
        
      out.println( ( (k/g)+(100-k)/g ) );
      out.flush();
      
    }
    
    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextInt();
        
    for(int t=0;t<testCases;t++){
    
        k=in.nextInt();
        
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

3
3
100
25


*/