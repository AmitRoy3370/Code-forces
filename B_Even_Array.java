
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Even_Array {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
        if( n==1 ){
            
            if( a[0]%2==0 ){
                
                out.println(0);
                
                out.flush();
                
            }else{
                
                out.println(-1);
                
                out.flush();
                
            }
            
            return;
            
        }
        
        int odd=0,even=0;
        
        for(int i=0;i<n;i++){
            
            if( a[i]%2==0 ){
                
                even++;
                
            }else{
                
                odd++;
                
            }
            
        }
        
        if( even!=(n-n/2) || odd!=n/2 ){
            
            out.println(-1);
            out.flush();
            
            return;
            
        }
        
       int ans=0;
        
       for(int i=0;i<n;i++){
           
           if( a[i]%2!=i%2 ){
               
               ans++;
               
           }
           
       }
       
       out.println(ans/2);
       out.flush();
       
    }
    
    public static void main(String[] amit) throws IOException {
        
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
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
    
}
