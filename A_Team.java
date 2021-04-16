
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Team {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,count=0;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        for(int j=0;j<n;j++){
            
            int a[]=new int[2];
            
            for(int i=0;i<3;i++){
                
                a[in.nextInt()]++;
                
            }
            
            if( a[1]>=2 ){
                
                count++;
                
            }
            
        }
        
        out.print(count);
        
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
                
                st=new StringTokenizer( in.readLine() );
                
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

double nextDouble() throws IOException{
    
    return Double.parseDouble( next() );
    
}
        
    }
    
}
/*

3
1 1 0
1 1 1
1 0 0

*/

/*

2
1 0 0
0 1 1

*/