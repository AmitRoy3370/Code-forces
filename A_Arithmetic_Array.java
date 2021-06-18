
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Arithmetic_Array {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
        double sum=0;
        
        for(int i: a){
            
            sum+=i;
            
        }
        
        if(sum/n==1){
            
            out.println(0);
            out.flush();
            
            return;
            
        }
        
       if(sum<n){
           
           out.println(1);
           out.flush();
           
       }else if(sum==n){
           
           out.println(0);
           out.flush();
           
       }else{
        
        out.println( (int)(sum-n) );
        out.flush();
        
    }
        
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
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

4
3
1 1 1
2
1 2
4
8 4 6 2
1
-2


*/