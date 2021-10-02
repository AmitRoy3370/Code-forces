import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Benches{
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n,m;

static int a[];

static void solve(){
	
	int max=a[0],min=a[0];
	
	int sum=0;
	
	for(int i: a){
		
		max=Math.max(max,i);
		
		sum+=i;
		
	}
	
	sum+=m;
	
	long maximum=max+m,minimum=Math.max((int)Math.ceil((double)sum/(double)n),max);
		
	//	out.println("d: "+(double) ((double)sum/(double)n));
		//out.flush();
		
		/*if( Math.ceil( (double)sum/(double)n )-(int)Math.ceil(sum/n)>=0.5 ){
			
			minimum=Math.max((int)Math.ceil(sum/n)+1,max);
			
		}*/
		
	out.println( minimum +" "+maximum);
	out.flush();
	
}

	public static void main(String [] amit) throws IOException{
	
n=in.nextInt();	
		
m=in.nextInt();		
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
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