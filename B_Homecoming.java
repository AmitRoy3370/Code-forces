import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Homecoming{
 
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

	static long a,b,p;
	
	static int testCases,n;
	
	static char s[];
	
	static void solve(){
		
		int next[][]=new int[2][n];
		
		//0 index for the A
		//1 index for the B

long dp[]=new long[n];
		
		for(int i=n-2;i>=0;i--){
			
		   if( s[i+1]=='A' ){
			   
			   next[0][i]=i+1;//remember the index of the A

               next[1][i]=next[1][i+1];//copy the previous index of the B 
			   
		   }else{
			   
               next[1][i]=i+1;//store the index of the B
			   next[0][i]=next[0][i+1];//copy the previous index of the A
			   
		   }
			
		}
		
		for(int i=n-2;i>=0;i--){
			
			if( s[i]=='A' ){//check that the indexed element is A or not
				
				int nextB=next[1][i];//if it is A then have to find the next B from the next array
				
				//add the price of the transport if the next transport equal to n then no transport is available so no ticket will have to buy
				
				dp[i]=a+((nextB==n)?0:dp[nextB]);
				
			}else{
				
				int nextA=next[0][i];//if it is A then have to find the next A from the next array
				
				//add the price of the transport if the next transport equal to n then no transport is available so no ticket will have to buy
				
				dp[i]=b+((nextA==n)?0:dp[nextA]);
				
			}
			
		}
		
		int ans=-1;
		
		/*out.print("nextA: ");
		out.flush();
		
	    for(int i: next[0]){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();
		
		out.print("nextB: ");
		out.flush();
		
		for(int i: next[1]){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();
		
		out.print("dp: ");
		out.flush();
		
		for(long i: dp){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();*/
		
		for(int i=0;i<n;i++){
			
			if( dp[i]<=p){
				
				//collect the index of that element of the transport that has the cost under his range
				
				ans=i;
				break;
				
			}
			
		}
		
		ans=(ans==-1)?n:ans+1;
		
		out.println(ans);
		out.flush();
		
	}
	
	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			a=in.nextLong();
			
			b=in.nextLong();
			
			p=in.nextLong();
			
			s=in.next().toCharArray();
			
			n=s.length;
			
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