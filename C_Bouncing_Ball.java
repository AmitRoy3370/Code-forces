import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Bouncing_Ball{

	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases,n,p,k,x,y;
	
	static char a[];
	
	static void solve(){
		
		int v[]=new int[n];
		
		for(int i=n-1;i>=0;i--){
			
			if(i+k<n){
				
				if( a[i]-'0'==1 ){
					
					v[i]=v[i+k];
					
				}else{
					
					//if(a[i]-'0'==0){
					
					v[i]=v[i+k]+1;
					
					//}
					
				}
				
			}else{
				
				if(a[i]-'0'==0){
				
				v[i]=1;
				
				}
				
			}
			
		}
		
		p--;
		
		long ans=Long.MAX_VALUE;
		
		for(int i=p;i<n;i++){
			
			long sum=(i-p)*y+v[i]*x;
			
			ans=Math.min( ans,sum );
			
		}
		
		out.println(ans);
		out.flush();
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			p=in.nextInt();
			
			k=in.nextInt();
			
			a=in.next().toCharArray();
			
			x=in.nextInt();
			
			y=in.nextInt();
			
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