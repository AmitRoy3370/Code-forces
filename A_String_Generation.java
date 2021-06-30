
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_String_Generation {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,k;
    
      static char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    static void solve(){
        
        if(k==1){
            
            int j=0;
            
            for(int i=0;i<n;i++){
                
                out.print(a[j++]);
                out.flush();
                
                if(j>=3){
                    
                    j=0;
                    
                }
                
                if(j>=26){
                    
                    j=0;
                    
                }
                
            }
            
            out.println();
            out.flush();
            
            return;
            
        }
        
        for(int i=0;i<k;i++){
            
            out.print('a');
            out.flush();
            
        }
        
        int j=1;
        
        for(int i=k;i<=n-1;i++){
            
            out.print(a[j++]);
            out.flush();
            
            if(j>=3){
                
                j=0;
                
            }
            
            if(j>=26){
                
                j=0;
                
            }
            
        }
        
        out.println();
        out.flush();
        
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            k=in.nextInt();
            
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

2
3 2
4 1


*/