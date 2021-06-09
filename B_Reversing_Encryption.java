import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Reversing_Encryption{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n;
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		char s[]=in.next().toCharArray();
		
                for(int i=1;i<=n;i++){
                    
                    if(n%i==0){
                        
                        for(int j=0;j<i/2;j++){
                            
                            char temp=s[j];
                            s[j]=s[i-j-1];
                            s[i-j-1]=temp;
                            
                        }
                        
                    }
                    
                }
                
                out.println(s);
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