import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Uniform_String{

 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
	
	static int n,k,testCases;
	
	static char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m',
	'n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	static void solve(){
		
		char a[]=new char[n];
		
		for(int i=0;i<n;i++){
		
int index=-1;
		
		//out.println("index: "+index );
		//out.flush();
		
		int y=i;
		
			for(int j=y;j<y+k && j<n ;j++){
					
				a[j]=ch[ ++index%26 ];
				
			//	out.println("index: "+j+" index: "+index+" "+a[j]);
			//out.flush();
				
				i++;
				
			}
			--i;
			//out.println("index: "+index);
			//out.flush();
			
		}
		
		out.println( new String(a) );
		out.flush();
		
	}
	
	public static void main(String amit[]) throws IOException{
		
		testCases=in.nextInt();
		
		for(int i=0;i<testCases;i++){
			
			n=in.nextInt();
			
			k=in.nextInt();
			
			solve();
			
		}
		
		in.close();
		
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