import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class A_Mishka_and_Game{

 static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n;
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		int Mishka=0,Chris=0,draw=0;
		
		for(int i=0;i<n;i++){
			
			int a=in.nextInt();
			
			int b=in.nextInt();
			
			if(a>b){
				
				Mishka++;
				
			}else if(b>a){
				
				Chris++;
				
			}else if(a==b){
				
				draw++;
				
			}
			
		}
		
		if(Mishka>Chris){
			
			out.println("Mishka");
			out.flush();
			
		}else if(Chris>Mishka){
			
			out.println("Chris");
			out.flush();
			
		}else if(Mishka==Chris){
			
			out.println("Friendship is magic!^^");
			out.flush();
			
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