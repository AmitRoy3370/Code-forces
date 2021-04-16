
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Sale {

    static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,m;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        m=in.nextInt();
        
        a=new int[n];
       
        int minus=0;
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
            if( a[i]<0 ){
                
                minus++;
                
            }
            
        }
        
        Arrays.sort(a);
        
        int ans=0;
        
       if( minus>m ){
           
           for(int i=0;i<m;i++){
               
               ans+=a[i];
               
           }
           
       }else{
           
           for(int i=0;i<minus;i++){
               
               ans+=a[i];
               
           }
           
       }
        
        out.print(-1*ans);
        out.flush();
        
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

5 3
-6 0 35 -2 4

*/

/*

4 2
7 0 0 -7

*/

/*

6 6
756 -611 251 -66 572 -818

*/

/*

5 3
-2 -2 -2 -2 -2

*/