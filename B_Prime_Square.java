
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Prime_Square {

    static int testCases,n;
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static Scanner in=new Scanner();
    
    static void solve(){
    
        int ans[][]=new int[n][n];
        
        if(n%2==0){
        
       for(int i=0;i<n;i++){
           
           ans[i][i]=1;
           
           ans[i][n-i-1]=1;
           
       }
        
        }else{
            
            for(int i=0;i<n;i++){
           
           ans[i][i]=1;
           
           ans[i][n-i-1]=1;
           
          // ans[i][n/2-1]=1;
           
       }
           
            ans[n/2+1][n/2]=1;
            
            ans[n/2][n/2-1]=1;
            
        }
       
        for(int i[] : ans){
            
            for(int j: i){
                
                out.print(j+" ");
                out.flush();
          
            }
          
            out.println();
            
            out.flush();
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
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
/*

2
4
2

*/
//1 4