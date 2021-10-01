import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Three_displays{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n;

static long s[],c[];

static void solve(){
	
	long ans=Long.MAX_VALUE;
	
	for(int i=0;i<n;i++){
		
		long secondMin=Long.MAX_VALUE,thirdMin=Long.MAX_VALUE;
		
		for(int j=i-1;j>=0;j--){
			
			if( s[i]>s[j] ){
				
				secondMin=Math.min(c[j],secondMin);
				
			}
			
		}
		
		for(int j=i+1;j<n;j++){
			
			if( s[i]<s[j] ){
				
				thirdMin=Math.min(thirdMin,c[j]);
				
			}
			
		}
		
		if( secondMin!=Long.MAX_VALUE && thirdMin!=Long.MAX_VALUE ){
		
		ans=Math.min( ans,c[i]+secondMin+thirdMin );
		
		}
		
	}
	
	if(ans!=Long.MAX_VALUE){
	
	out.println(ans);
	out.flush();
	
	}else{
		
		out.println(-1);
		out.flush();
		
	}
	
}

	public static void main(String []amit) throws IOException{
		
	n=in.nextInt();	
		
		s=new long[n];
		
		c=new long[n];
		
		for(int i=0;i<n;i++){
			
			s[i]=in.nextLong();
			
		}
		
		for(int i=0;i<n;i++){
			
			c[i]=in.nextLong();
			
		}
		
		solve();
		
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