import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class D_Moderate_Modular_Mode{
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

	static int testCases;
	
	static long x,y;
	
    static void solve(){
		
		long ans=0;
		
	  if( x>y ){
		  
		  ans=x+y;
		  
	  }else if(x==y){
		  
		  ans=x;
		  
	  }else{
		  
		  if( y%x==0 ){
			  
			  ans=x;
			  
		  }else{
			  
			  long bigestMultiple=y/x;
			  long now=bigestMultiple*x;
			  ans=(now+y)/2L;
			  
		  }
		  
	  }
		
		out.println(ans);
		out.flush();
		
	}
	
	public static void main(String [] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			x=in.nextLong();
			
			y=in.nextLong();
			
			solve();
			
		}
		
		in.close();
		
	}
		
    static long gcd(long a, long b)   
{   
  
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
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