
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Yet_Another_Two_Integers_Problem {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long a,b,testCases;
    
    static void solve(){
    
        long max=a>b?a:b;
    
        long min=a>b?b:a;
       
        long diff=(max-min);
       
        if(diff%10==0){
        
            out.println( diff/10 );
            out.flush();
            
        }else{
            
            out.println( (diff/10)+1 );
            out.flush();
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextLong();
        
    for(int t=0;t<testCases;t++){
        
        a=in.nextLong();
        b=in.nextLong();
        
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
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
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
        
    }
    
}
/*

6
5 5
13 42
18 4
1337 420
123456789 1000000000
100500 9000


*/