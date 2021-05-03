
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Phoenix_and_Puzzle {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    
    static long n;
    
    static boolean perfectSqure(long a){
        // System.out.print("perfect square");
                
        return Math.ceil((double)Math.sqrt(a)) ==
                Math.floor((double)Math.sqrt(a));
        
    }
    
    static void solve(){
        
        if(n==2){
            
            out.println("YES");
            out.flush();
            
            return;
            
        }
        
        if(n%2!=0 && n%4!=0){
            
            out.println("NO");
            out.flush();
            
            return;
            
        }
        
        if(n%2!=0 ){
            
            out.println("NO");
            out.flush();
            
            return;
            
        }
        
       if( perfectSqure(n/2) || ( n%4==0 && perfectSqure(n/4)) ){
           
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
            
            n=in.nextLong();
            
        solve();    
            
        }
        
    }
    
     static class Scanner {
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
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
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
    }
    
}
/*

3
2
4
6


*/