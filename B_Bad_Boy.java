
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Bad_Boy {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,m,i,j;
   
    static void solve(){
        
        if(i<=n/2 && j<=m/2){
        out.println("1 "+m+" "+n+" 1");
        out.flush();
    }
    else if(i>=n/2 && j>=m/2){
        out.println("1 "+m+" "+n+" 1");
        out.flush();
    }
    else{
        out.println("1 1 "+n+" "+m);
        out.flush();
    }
        
    }
   
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            m=in.nextInt();
            i=in.nextInt();
            j=in.nextInt();
            
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

7
2 3 1 1
4 4 1 2
3 5 2 2
5 1 2 1
3 1 3 1
1 1 1 1
1000000000 1000000000 1000000000 50


*/