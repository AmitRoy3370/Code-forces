
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Basketball_Exercise {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int n;
    
    static long a[][];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new long[2][n];
        
        for(int i=0;i<2;i++){
            
            for(int j=0;j<n;j++){
                
                a[i][j]=in.nextLong();
                
            }
            
        }
        
        if(n==1){
            
            out.println(Math.max(a[0][0],a[1][0]) );
            out.flush();
            
            return;
            
        }
        
        a[0][1]=Math.max(a[0][1],a[0][1]+a[1][0]);
        a[1][1]=Math.max(a[1][1],a[0][0]+a[1][1]);
        
        for(int i=2;i<n;i++){
            
            a[0][i]=Math.max( a[0][1],Math.max( a[0][i]+a[1][i-1],a[0][i]+a[1][i-2] ) );
            a[1][i]=Math.max( a[1][1],Math.max( a[1][i]+a[0][i-1],a[1][i]+a[0][i-2] ) );
            
        }
      
        out.println( Math.max( a[0][n-1],a[1][n-1] ) );
        out.flush();
      
       /* for(long i[]: a){
            
            for(long j: i){
                
                out.print(j+" ");
                out.flush();
                
            }
            
            out.println();
            out.flush();
            
        }*/
        
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
/*

5
9 3 5 7 3
5 8 1 4 5


*/

/*

3
1 2 9
10 1 1


*/