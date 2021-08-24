
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Numbers_Box {

          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases,n,m,neg=0,sum=0,min=Integer.MAX_VALUE;
    
    static int a[][];
    
    static void solve(){
        
        if( neg%2==1 ){
            
            sum-=2*min;
            
        }
        
        out.println(sum);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            m=in.nextInt();
            
            a=new int[n][m];
            
            sum=0;
            neg=0;
            
            min=Integer.MAX_VALUE;
            
            for(int i=0;i<n;i++){
                
                for(int j=0;j<m;j++){
                    
                    a[i][j]=in.nextInt();
                  
                    if( a[i][j]<0 ){
                        
                        neg++;
                        
                    }
                        
                    min=Math.min( min,Math.abs(a[i][j]) );
                    
                    sum+=Math.abs(a[i][j]);
                    
                }
                
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

2
2 2
-1 1
1 1
3 4
0 -1 -2 -3
-1 -2 -3 -4
-2 -3 -4 -5


*/