import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class A_New_Year_and_Counting_Cards{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static Map<Character,Boolean> map=new HashMap<>();
	
	public static void main(String[] amit) throws IOException{
		
		char ch[]=in.next().toCharArray();
		
		map.put( 'a',true );
		map.put( 'e',true );
		map.put( 'i',true );
		map.put( 'o',true );
		map.put( 'u',true );
		
		int ans=0;
		
		for(char i: ch){
			
			try{
			
			if( map.get(i) ){
				
				ans++;
				
			}
			
			}catch(Exception e){
				
				try{
				
				int t=Integer.parseInt( String.valueOf(i) );
				
				if(t%2==1){
					
					ans++;
					
				}
				
				}catch(Exception f){
					
					
				}
				
			}
			
		}
		
		out.println(ans);
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