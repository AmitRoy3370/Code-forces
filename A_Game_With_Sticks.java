import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Game_With_Sticks{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
	
	static int a,b;
	
	public static void main(String[] amit) throws IOException{
		
		a=in.nextInt();
		b=in.nextInt();
		
		String s[]={"Akshat","Malvika"};
		
		int i=0,n=a*b;
		
		while( n>0 ){
			
			i=(i+1)%2;
			
			n-=Math.max(a,b);
			
		}
		
		i=(i+1)%2;
		
		out.println(s[i]);
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