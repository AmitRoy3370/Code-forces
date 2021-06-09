import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B_Make_Them_Equal{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n;
	
	static int a[];
	
	public static void main(String[] amit) throws IOException{
		
		n=in.nextInt();
		
		a=new int[n];
	
for(int i=0;i<n;i++){
	
	a[i]=in.nextInt();
	
}
		
		Arrays.sort(a);
		
		int differ=0,count=0;
		
		for(int i=1;i<n;i++){
			
			int diff=a[i]-a[i-1];
			
			if(diff!=0){
				
				if(differ==0 || diff==differ){
					
					differ=diff;
					
					count++;
					
				}else{
					
					out.println(-1);
					out.flush();
					
					return;
					
				}
				
			}
			
		}
		
		if(count==1){
			
			if(differ%2==0){
				
				out.println(differ/2);
				out.flush();
				
			}else{
				
				out.println(differ);
				out.flush();
				
			}
			
			return;
			
		}
		
		if(count==0 || count==2){
			
			out.println(differ);
			out.flush();
			
			return;
			
		}
		
		out.println(-1);
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