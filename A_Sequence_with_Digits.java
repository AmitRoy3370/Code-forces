import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class A_Sequence_with_Digits{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int testCases;
	static long k,a1;
	
	static void solve(){
		
		if(k==1){
			
			out.println(a1);
			out.flush();
			
			return;
			
		}
		
		for(int i=2;i<=k;i++){
			
			long a[]=new long[ String.valueOf(a1).length() ];
			
			String s=String.valueOf(a1);
			
			int n=s.length();
			
			for(int j=0;j<n;j++){
				
				a[j]=Long.parseLong( String.valueOf(s.charAt(j) ) );
				
			}
			
			Arrays.sort(a);
			
			if( a[0]*a[n-1]==0 ){
				
				break;
				
			}
			
			a1+=a[0]*a[n-1];
			
		}
		
		out.println(a1);
		out.flush();
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			a1=in.nextLong();
			k=in.nextLong();
			
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