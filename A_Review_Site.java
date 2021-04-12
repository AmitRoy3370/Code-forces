
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Review_Site {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
        int c1=0,c2=0,added;
        
        for(int i: a){
            
            if( i==1 ){
                
                c1++;
                
            }else if(i==0){
                
                c2++;
                
            }
            
        }
        
        added=Math.max(c2, c1);
        
        if( added==c1 ){
            
            for(int i: a){
                
                if( i==3 ){
                    
                    c1++;
                    
                }
                
            }
            
        }
        
        out.println(c1);
        out.flush();
        
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

4
1
2
3
1 2 3
5
1 1 1 1 1
3
3 3 2

*/