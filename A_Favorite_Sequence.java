
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Favorite_Sequence {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int n,testCases;
    
    static long a[];
    
    static void solve(){
        
        long b[]=new long[n];
        
        int l=0;
        
        for(int i=0;i<n/2;i++){
            
            b[l++]=a[i];
            
            b[l++]=a[n-i-1];
            
        }
        
        if( b[n-1]==0 ){
            
            b[n-1]=a[n/2];
            
        }
        
        for(long i: b){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
            }
            
            solve();
            
        }
        
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

6
7
3 4 5 2 9 1 1
4
9 2 7 1
11
8 4 3 1 2 7 8 7 9 4 2
1
42
2
11 7
8
1 1 1 1 1 1 1 1


*/

/*

1
7
3 4 5 2 9 1 1

*/