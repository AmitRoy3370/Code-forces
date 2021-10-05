import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class A_Santa_Claus_and_Candies{
		
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

	public static void main(String [] amit) throws IOException{
		
		int n=in.nextInt();
		
		int y=n;
		
		int cut=n%2==0?2:3;
		
		int u=cut,ans=0,k=n%2;
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;n>=1;i++){
			
			if(n-i<0){
				
				break;
				
			}
			
			n-=i;
			
			list.add(i);
			
		}
		
		if( n>=1 ){
			
			list.set(list.size()-1, list.get( list.size()-1 )+n );
			
		}
		
		out.println( list.size() );
		out.flush();
		
		for(int i: list){
			
			out.print(i+" ");
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