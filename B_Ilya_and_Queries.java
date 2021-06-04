import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Ilya_and_Queries{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int m,a,b;
	
	static String s;
	
	public static void main(String[] amit) throws IOException{
		
		s=in.next();
		
		m=in.nextInt();
		
		char []ch=s.toCharArray();
		
		int ans[]=new int[ch.length ];
		
		int n=ch.length,cnt=0;
		
		for(int i=1;i<=n-1;i++){
			
			if( ch[i]==ch[i-1] ){
				
				//ans[i+1]++;
	//			ans[i+1]=ans[i]+1;
				
				cnt++;
				
			}
			
			ans[i]=cnt;
			
		}
		
		/*for(int i: ans){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();*/
		
		for(int i=0;i<m;i++){
			
			a=in.nextInt()-1;
			b=in.nextInt()-1;
			
			/*int counter=0;
			
			for(int j=a;j<=b-1;j++){
				
				if(ch[j]==ch[j+1]){
					
					counter++;
					
				}
				
			}
			
			out.println(counter);
			out.flush();*/
			
			out.println( ( ans[b]-ans[a] ) );
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