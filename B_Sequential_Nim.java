import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Sequential_Nim{
				
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n,testCases;

static long a[];

static void solve(){
	
	long sum=0;
	
	for(long i: a){
		
		sum+=i;
		
	}
	
	if(sum==n){
		
		if( sum%2==1 ){
			
			out.println("First");
			out.flush();
			
		}else{
			
			out.println("Second");
			out.flush();
			
		}
		
	}else{
		
		int i=0;
		
		for( i=0;i<n;i++){
			
			if(a[i]!=1){
				
				break;
				
			}
			
		}
		
		if(i%2==0){
			
			out.println("First");
			out.flush();
			
		}else{
			
			out.println("Second");
			out.flush();
			
		}
		
	}
	
}

	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
for(int t=0;t<testCases;t++){
	
	n=in.nextInt();
	
	a=new long[n];
	
	for(int i=0;i<n;i++){
		
		a[i]=in.nextLong();
		
	}
	
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