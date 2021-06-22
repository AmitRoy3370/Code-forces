import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class A_Happy_XOR_Sad_XOR{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	public static void main(String[] amit) throws IOException{
		
		int n=in.nextInt();
		
	BigInteger a[]=new BigInteger[n];
		
		BigInteger sum=new BigInteger("0");
		
		for(int i=0;i<n;i++){
			
			a[i]=new BigInteger( in.next() );
			
			sum=sum.add(a[i]);
			
		}
		
		BigInteger xor=a[0];
		
		for(int i=1;i<n;i++){
			
			xor=xor.xor(a[i]);
			
		}
		
		BigInteger ans=sum.subtract(xor);
		
		out.println( ans.toString() );
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