import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class B_Maximum_of_Maximums_of_Minimums{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n,k;
	
	static List<Integer> list=new ArrayList<>();
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		k=in.nextInt();
		
		for(int i=0;i<n;i++){
			
			list.add( in.nextInt() );
			
		}
		
		if(k==1){
			
			out.println( Collections.min(list) );
			out.flush();
			
		}else if(k>=3){
			
			out.println(Collections.max(list) );
			out.flush();
			
		}else if(k==2){
			
			int max=Collections.max(list);
			
			if( list.indexOf(max)==list.size()-1 || list.indexOf( max )==0 ){
				
				out.println(max);
				out.flush();
				
				return;
				
			}
			
			out.println( Math.max( list.get(0),list.get( list.size()-1 ) ) );
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