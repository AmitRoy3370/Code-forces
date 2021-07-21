
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class G_Grade_Point_Average {

                static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,k;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new int[n];
        
        long sum=0;
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
            sum+=a[i];
            
        }
        
        long avg=sum/n;
        
        long point=sum%n;
        
        long p[]=new long[k];
        
        for(int i=0;i<k;i++){
            
            point*=10;
            
            p[i]=point/n;
            
            point%=n;
            
        }
        
        out.print(avg+".");
        out.flush();
        
        for(long i: p){
            
            out.print(i);
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
        
    }
    
}
/*

3 10
94 100 99


*/