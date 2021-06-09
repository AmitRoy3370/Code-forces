import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class A_Restoring_Three_Numbers{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static long ab,ac,bc,abc;
	
	public static void main(String[] amit) throws IOException{
		
		ab=in.nextLong();
		ac=in.nextLong();
		bc=in.nextLong();
		abc=in.nextLong();
		
		long arr[]={ab,bc,ac,abc};
		
		Arrays.sort(arr);
		
		long a=arr[3]-arr[0];
		
		long b=arr[3]-arr[1];
		
		long c=arr[3]-arr[2];
		
		out.print(a+" "+b+" "+c);
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