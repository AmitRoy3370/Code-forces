
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Coin_Rows {
    
         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases,m;    
    
static int a[][];

static void solve(){
    
 long sum=0,sum1=0;
    
 long preA[]=new long[m];
 
 long preB[]=new long[m+1];
 
 for(int i=0;i<m;i++){
     
     sum+=a[0][i];
     
     preA[i]=sum;
     
     sum1+=a[1][i];
     
     preB[i+1]=sum1;
     
 }
 
 long ans=Long.MAX_VALUE;
 
 for(int i=0;i<m;i++){
     
     ans=Math.min( ans,Math.max( preB[i],preA[m-1]-preA[i] ) );
     
 }
 
 out.println(ans);
 out.flush();
 
}
    
    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextInt();
        
    for(int t=0;t<testCases;t++){
        
        m=in.nextInt();
        
        a=new int[2][m];
        
        for(int i=0;i<2;i++){
            
            for(int j=0;j<m;j++){
                
                a[i][j]=in.nextInt();
                
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

3
3
1 3 7
3 5 1
3
1 3 9
3 5 1
1
4
7


*/