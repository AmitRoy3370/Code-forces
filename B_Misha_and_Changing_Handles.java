import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class B_Misha_and_Changing_Handles{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n;

	public static void main(String []amit) throws IOException{
		
		n=in.nextInt();
		
		Map<String,String> direct=new HashMap<>();
		
		Map<String,String> reverse=new HashMap<>();
		
		for(int i=0;i<n;i++){
			
			String a[]=in.nextLine().split(" ");
			
			if( direct.containsKey( a[1] ) ){
				
				String n=direct.remove( a[0] );
				
				direct.put( a[0],n );
				
				reverse.put( n,a[0] );
				
			}else if( reverse.containsKey( a[0] ) ){
				
				String n=reverse.remove( a[0] );
				
				direct.put( n,a[1] );
				
				reverse.put( a[1],n );
				
			}else{
				
				direct.put( a[0],a[1] );
				
				reverse.put( a[1],a[0] );
				
				
			}
			
		}
		
		out.println( direct.size() );
		out.flush();
		
		for(String i: direct.keySet() ){
			
			out.println( i+" "+direct.get(i) );
			out.flush();
			
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