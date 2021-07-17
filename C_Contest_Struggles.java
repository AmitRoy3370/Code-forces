
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Contest_Struggles {

       
            static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static double n,k,s,d;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextDouble();
        
        k=in.nextDouble();
        
        d=in.nextDouble();
        
        s=in.nextDouble();
        
        double percent=(n*d-s*k)/(n-k);
        
        if( percent<0 || percent>100 ){
            
            out.println("impossible");
            out.flush();
            
        }else{
            
            out.println(percent);
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
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
    
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
}
/*

2 1
70 50


*/

/*

10 3
80 90


*/

/*

2 1
100 10


*/