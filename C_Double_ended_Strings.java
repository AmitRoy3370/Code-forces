import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Double_ended_Strings{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
	
	static int testCases;
	
	static String a,b;
	
	static void solve(){
		
		if( a.equals(b) ){
			
			out.println(0);
			out.flush();
			
			return;
			
		}
		
		char x[]=a.toCharArray();
		
		char y[]=b.toCharArray();
		
		int ans=0,n=x.length,m=y.length;
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=m;j++){
				
				if( x[i-1]==y[j-1] ){
					
					dp[i][j]=dp[i-1][j-1]+1;
					
					ans=Math.max( ans,dp[i][j] );
					
				}
				
			}
			
		}
		
		out.println( ((n+m)-ans*2) );
		out.flush();
		
	}
	
	public static void main(String[] amit ) throws IOException {
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			a=in.next();
			b=in.next();
			
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
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
	
}