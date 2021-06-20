
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Taymyr_is_calling_you {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,m,z;
    
      private static int getGcd(Integer n, Integer m) {
        while (m > 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        return n;
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        m=in.nextInt();
        z=in.nextInt();
        
        int gcd= getGcd(n,m);
        
        int lcm=n*m/gcd;
        
        int count=0;
        
        int num=lcm;
        
        while (num <= z) {
            count++;
            num = (count + 1) * lcm;
        }
        
        out.println(count);
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
//1 1 10
