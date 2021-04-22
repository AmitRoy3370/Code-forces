
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Insomnia_cure {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long k,l,m,n,d,ans=0;
    
    public static void main(String[] amit) throws IOException {
        
        k=in.nextLong();
        
        l=in.nextLong();
        
        m=in.nextLong();
        
        n=in.nextLong();
        
        d=in.nextLong();
        
        for(long i=1;i<=d;i++){
            
            if( i%k==0 || i%l==0 || i%m==0 | i%n==0 ){
                
                ans++;
                
            }
            
        }
        
        out.print(ans);
        out.flush();
                
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
/*1
2
3
4
12
*/

/*

2
3
4
5
24

*/