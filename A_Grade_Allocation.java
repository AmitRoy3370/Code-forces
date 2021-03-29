
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Grade_Allocation {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,m,testCases;
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            m=in.nextInt();
            
            long sum=0;
            
            for(int i=0;i<n;i++){
                
                sum+=in.nextInt();
                
            }
            
            out.println( Math.min( sum,m ) );
            
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
    
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
    }
    
}
/*

2
4 10
1 2 3 4
4 5
1 2 3 4

*/