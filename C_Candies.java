import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Candies{
			
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases,n,left,right;

static int a[];

static int dp[];

static void solve(){
	
	out.println( (dp[right]-dp[left-1])/10 );
	out.flush();
	
}

	public static void main(String [] amit) throws IOException{
		
	n=in.nextInt();
		
		a=new int[n];
		
		dp=new int[n+1];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
			dp[i+1]=dp[i]+a[i];
			
		}
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			left=in.nextInt();
			
			right=in.nextInt();
			
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