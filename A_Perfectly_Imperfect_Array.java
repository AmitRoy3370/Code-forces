
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Perfectly_Imperfect_Array {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCase,n;
    
    static long a[];
    
    static boolean isPerfectSquare(long x)
    {
        if (x >= 0) {
           
            
            long sr = (long) Math.sqrt(x);
           
            return ((sr * sr) == x);
        
        }
        
        return false;
    }
    
    static void solve(){
        
        long mul=1,psq=0,psqn=0;
      
        for(long i: a){
            
            if( !isPerfectSquare(i) ){
                
                out.println("YES");
                out.flush();
                
                return;
                
            }
            
        }
        
          out.println("NO");
            
            out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCase=in.nextInt();
        
        for(int t=0;t<testCase;t++){
            
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

2
3
1 5 4
2
100 10000

*/

/*

1
5
1 2 3 4 5

*/

/*

1
2
1444 5452

*/