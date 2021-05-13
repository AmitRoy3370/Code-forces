
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Hit_the_Lottery {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int count=0;
    
    static int solve(long n){
        
        if(n<=0){
            
            return count;
            
        }
        
        if(n>=100  ){
            
            count+=n/100;
            
            return solve(n%100);
            
        }
        
        if(n>=50  ){
            
            count+=n/50;
            
            return solve(n%50);
            
        }
        
        if(n>=20  ){
            
            count+=n/20;
            
            return solve(n%20);
            
        }
        
        if(n>=10  ){
            
            count+=n/10;
            
            return solve(n%10);
            
        }
        
        if(n>=5  ){
            
            count+=(n/5);
            
            return solve(n%5);
            
        }
        
        if(n>=1  ){
            
            count+=n;
            
            return count;
            
        }
        
        return 0;
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        long n=in.nextLong();
        
        long c=n/100;
  long d=n%100;
  long e=d/20;
  long f=d%20;
  long g=f/10;
  long h=f%10;
  long i=h/5;
  long j=h%5;
  long k=j/1;
        
        out.println( (c+e+g+i+k) );
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
