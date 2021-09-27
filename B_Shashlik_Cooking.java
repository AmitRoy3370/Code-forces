import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Shashlik_Cooking{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n,k;

	public static void main(String []amit) throws IOException{
		
		n=in.nextInt();
		
		k=in.nextInt();
		
		if(k>=n){
			
			out.println(1+"\n"+1);
			out.flush();
			
			return;
			
		}
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=i+1;
			
		}
		
		int dp[]=new int[n];
		
		int ans=Integer.MAX_VALUE;
		
		String ans1="";
		
		for(int i=0;i<=k;i++){
			
			int j=i+(2*k+1);
			
			dp[i]=1;
			
			String temp=(i+1)+" ";
			
			for(;j<n;j+=(2*k+1) ){
				
				dp[j]=dp[j-(2*k+1) ]+1;
				
				temp+=(j+1)+" ";
				
			}
			
			if( j-k>=n && dp[j-(2*k+1) ]<ans ){
				
				ans=dp[j-(2*k+1) ];
				
				ans1=temp;
				
			}
			
		}
		
		out.println( ans );
		out.flush();
		
			out.print(ans1);
			out.flush();
			
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