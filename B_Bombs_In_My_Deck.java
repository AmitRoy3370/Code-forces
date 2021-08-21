
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Bombs_In_My_Deck {
    
      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static double a,b,c;
    
    public static void main(String[] amit) throws IOException {
        
        a=in.nextDouble();
        
        b=in.nextDouble();
        
        c=in.nextDouble();
        
        in.close();
        
        int d=(int) Math.ceil( c/5 );
        
        if(d>b){
            
            out.println(1);
            out.flush();
            
        }else{
             
            double sum=1.0;
            
            double p=a;
            double q=b;
            
           while( a>=(p-d+1) && b>=(q-d+1) ){
               
               sum*=(b/a);
               
               a--;
               b--;
               
           }
            
           out.printf("%.9f",1-sum);
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
//4 2 5
