
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Cubes {

          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
        long sum=0,max=a[0];
        
        for(int i: a){
            
            sum+=i;
            
            max=Math.max(i,max);
            
        }
        
        long avg=(long) Math.ceil((double)(((double)sum*1.0)/(double)(n-1)));
        
        long s=avg*(n-1);
        
        if( max>avg ){
            
            s=max*(n-1);
            
        }
        
        out.println( Math.abs(s-sum) );
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

3
3
3 2 2
4
2 2 3 2
3
0 3 0


*/