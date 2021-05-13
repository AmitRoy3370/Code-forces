
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Soldier_and_Bananas {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long k,n,w;
    
    public static void main(String[] amit) throws IOException {
        
        String s[]=in.nextLine().split(" ");
        
        k=Long.parseLong(s[0]);
        n=Long.parseLong(s[1]);
        w=Long.parseLong(s[2]);
        
        long paid=0;
        
        for(long i=1;i<=w;i++){
            
            paid+=i*k;
            
        }
        
        if((paid-n)>=0 ){
        
        out.println(paid-n);
        out.flush();
        
        }else{
            
            out.println(0);
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
//3 17 4
