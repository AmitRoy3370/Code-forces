
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Minimum_Product {

      static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static long testCases,a,b,x,y,n;
    
    static void solve(){
        
        long ans=Long.MAX_VALUE;
        
        for(int i=0;i<2;i++){
            
            long da=Math.min(n,a-x);
            long db=Math.min(n-da,b-y);
            
            ans=Math.min(ans, (a-da)*(b-db) );
            
            long temp=x;
            x=y;
            y=temp;
            
            temp=a;
            a=b;
            b=temp;
            
        }
        
        out.println(ans);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextLong();
        
        for(int t=0;t<testCases;t++){
            
            a=in.nextLong();
            b=in.nextLong();
            x=in.nextLong();
            y=in.nextLong();
            n=in.nextLong();
            
            solve();
            
        }
        
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader(new InputStreamReader(System.in));
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
}
/*

7
10 10 8 5 3
12 8 8 7 2
12343 43 4543 39 123212
1000000000 1000000000 1 1 1
1000000000 1000000000 1 1 1000000000
10 11 2 1 5
10 11 9 1 10


*/