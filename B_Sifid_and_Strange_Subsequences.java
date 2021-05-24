
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Sifid_and_Strange_Subsequences {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
     static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
        if(n==1){
            
            out.println(1);
            out.flush();
            
            return;
            
        }
        
        Arrays.sort(a);
        
        int min=a[1]-a[0],cnt=1;
        
        for(int i=1;i<n;i++){
            
            min=Math.min(min,a[i]-a[i-1]);
            
            if(a[i]<=min){
                
                cnt++;
                
            }else{
                
                break;
                
            }
            
        }
        
        out.println(cnt);
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
    
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
    }
    
}
/*

6
4
-1 -2 0 0
7
-3 4 -2 0 -4 6 1
5
0 5 -3 2 -5
3
2 3 1
4
-3 0 2 0
6
-3 -2 -1 1 1 1


*/