
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Replacing_Elements {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,d,testCases;
    
    static int a[];
    
    static void sort(int a[]){
        
        int max=a[0],min=a[0];
        
        for(int i: a){
            
            max=Math.max(max,i);
            min=Math.min(min,i);
            
        }
        
        int k=max-min+1;
        
        int count[]=new int[k];
        
        int b[]=new int[n];
        
        for(int i=0;i<n;i++){
            
            count[ a[i]-min ]++;
            
        }
        
        for(int i=1;i<k;i++){
            
            count[i]+=count[i-1];
            
        }
        
        for(int i=n-1;i>=0;i--){
            
            b[ count[ a[i]-min ]-1 ]=a[i];
            
            count[a[i]-min]--;
            
        }
        
         System.arraycopy(b, 0, a, 0, n);
        
    }
    
    static void solve(){
        
        sort(a);
        
        out.println( (a[0]+a[1])<=d || a[n-1]<=d?"YES":"NO" );
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            d=in.nextInt();
            
            a=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            solve();
            
        }
        
        in.close();
        
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
5 3
2 3 2 5 4
3 4
2 4 4
5 4
2 1 5 3 6


*/