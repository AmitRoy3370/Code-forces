
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E_Password {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static long mod=(long) (Math.pow(10,9)+7);
    
    static long dp[][];
    
    static String s;
    
    static void solve(){
        
        char ch[]=s.toCharArray();
        
        dp=new long[n+1][10];
        
        for(int i=1;i<10;i++){
            
            dp[0][i]=1;
            
        }
        
        for(int i=1;i<=n;i++){
            
            if( ch[i]>='1' && ch[i]<='9'  ){
                
                dp[i][ch[i]-'0']=dp[i-1][ch[i]-'0'];
                
            }else{
                
                for(int j=1;j<10;j++){
                    
                    dp[i][j]=dp[i-1][j];
                    
                }
                
            }
            
            for(int j=2;j<10;j++){
                
                dp[i][j]+=dp[i][j-1];
                
                dp[i][j]%=mod;
                
            }
            
        }
        
        out.println( dp[n][9] );
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            s=" "+in.next();
            
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
                
                st=new StringTokenizer(in.readLine());
                
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
        
    }
    
}
/*

5
5
1---2
3
3-4
7
2--43-4
8
1---23-4
1
-


*/