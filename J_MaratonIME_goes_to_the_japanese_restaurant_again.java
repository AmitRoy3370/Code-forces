
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class J_MaratonIME_goes_to_the_japanese_restaurant_again {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
        
    public static void main(String[] amit) throws IOException {
        
    int n=in.nextInt();
        
    long a[]=new long[n];
    long b[]=new long[n];
    long c[]=new long[n];
    
    for(int i=0;i<n;i++){
        
        a[i]=in.nextLong();
        b[i]=in.nextLong();
        c[i]=in.nextLong();
        
    }
    
    for(int i=0;i<n-1;i++){
        
        for(int j=i+1;j<n;j++){
            
            long x=(long) Math.pow( a[i]-a[j],2 );
            long y=(long)Math.pow( b[i]-b[j],2 );
            long z=(long)Math.pow( c[i]+c[j],2 );
            
            if( x+y<=z ){
                
                out.println( (i+1)+" "+(j+1) );
                out.flush();
                
            }
            
        }
        
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
/*

3
0 0 2
5 0 3
10 10 1


*/