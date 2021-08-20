
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Next_Test {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static int n;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new int[n];
        
        int max=0;
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
            max=Integer.max(max, a[i]);
            
        }
         
        boolean b[]=new boolean[max+1];
        
         for(int i: a){
            
            b[i]=true;
            
        }
        
        for(int i=1;i<=max;i++){
            
            if( !b[i] ){
                
                out.println(i);
                out.flush();
                
                return;
                
            }
            
        }
        
        out.println(max+1);
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
