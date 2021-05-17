import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class A_Chips{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
	
	static int n,m;
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		m=in.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=i+1;
			
		}
		
		int i=0;
		
		while(true){
			
			if( (m-a[i])<0 ){
				
				break;
				
			}
			
			m-=a[i];
			
			if(m==0){
				
				break;
				
			}
			
			i=(i+1)%n;
			
		}
		
		out.println(m);
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
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
	
}