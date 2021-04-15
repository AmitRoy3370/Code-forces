
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Cards_for_Friends {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long w,h,n;
    
    static int testCases;
    
    static void solve(){
        
        long ans=1;
        
       while( w%2==0 ){
           
           w/=2;
           
           ans*=2;
           
       }
        
       while( h%2==0 ){
           
           h/=2;
           
           ans*=2;
           
       }
       
       // out.println(ans);
    //    out.flush();
        
        if( ans>=n ){
            
            out.println("YES");
            
            out.flush();
            
        }else{
            
            out.println("NO");
            
            out.flush();
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            w=in.nextLong();
            h=in.nextLong();
            n=in.nextLong();
            
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

5
2 2 3
3 3 2
5 10 2
11 13 1
1 4 4

*/

/*

1
1 4 4

*/