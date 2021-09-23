import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Approximating_a_Constant_Range{
static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n;
	
static long a[];	
	
static class Element{
	
	long element;
	int index;
	
	public Element(long element,int index){
		
		this.element=element;
		
		this.index=index;
		
	}
	
	public Element(){
		
		
	}
	
	public String toString(){
		
		return element+" "+index;
		
	}
	
}	
	
	static Element dp[][];
	
	static void solve(){
		
		long left=0,res=0;
		int j=0,i=0,l=0;
		
		for( i=1;i<n;i++){
			
			if( a[i]-a[i-1]==0 ){
				
				continue;
				
				
			}
			
			if( a[i]-a[i-1]==left ){
				
				res=Math.max( res,i-j );
				
				j=l;
				
			}else{
				
				left=a[i]-a[i-1];
				
			}
			
			l=i;
			
		}
		
		out.println( Math.max( res,i-j ) );
		out.flush();
		
		/*long  max=a[0],min=a[0];
		
		int maxIndex=1,minIndex=1;
		
		for(int i=0;i<n;i++){
			
			dp[i][0]=new Element();
			
			dp[i][1]=new Element();
			
		}
		
		dp[0][0]=new Element( a[0],1 );
		
		dp[0][1]=new Element( a[0],1 );
		
		//0 for the lowest
		//1 for the highest
		
		for(int i=0;i<n;i++){
			
			if( min>a[i] ){
				
				dp[i][0]=new Element(a[i],i+1 );
				
				min=a[i];
				
				minIndex=i+1;
				
			}else{
				
				dp[i][0]=new Element( min,minIndex );
				
			}
			
			if( max<=a[i] ){
				
				dp[i][1]=new Element( a[i],i+1 );
				
				max=a[i];
				
				maxIndex=i+1;
				
			}else{
				
				dp[i][1]=new Element( max,maxIndex );
			
			}
			
		}*/
		
	/*	for(int i=0;i<n;i++){
			
			out.println( "min: "+dp[i][0].toString() );
			out.flush();
			
			out.println( "max: "+dp[i][1].toString() );
			out.flush();
			
		}*/
		
		/*int diff;
		
		int ans=0;
		
		for(int i=0;i<n;i++){
			
			if( dp[i][1].element-dp[i][0].element<=1 ){
				
				if( a[i]<=dp[i][1].element || a[i]>=dp[i][0].element ){
					
					diff=Math.abs((i+1)-Math.min( dp[i][0].index,dp[i][1].index ))+1;
					
					ans=Math.max( ans,diff );
					
					out.println( (i+1)+" "+Math.min( dp[i][0].index,dp[i][1].index ) );
					out.flush();
					
				}
				
				//diff=dp[i][1].index-dp[i][0].index+1;
				
				//ans=Math.max(ans,diff);
				
			}
			
		}
		
		out.println(ans);
		out.flush();*/
		
	}
	
	public static void main(String amit[]) throws IOException{
	
	n=in.nextInt();
		
		a=new long[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextLong();
			
		}
		
		dp=new Element[n][2];
		
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