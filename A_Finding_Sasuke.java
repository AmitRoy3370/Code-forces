import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Finding_Sasuke{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n,testCases;

static int a[];

	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
		
		n=in.nextInt();
		
		a=new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		int b[]=new int[n];
		
		for(int i=0;i<n;i++){
			
			b[i]=1;
			
		}
		
	//	b[n-1]=1;
		
		for(int i=0;i<=n-1;i+=2){
			
			out.print( -a[i+1]+" "+a[i]+" " );
			out.flush();
			
		//	b[i+1]=1;
			
		}
		
		out.println();
		out.flush();
		
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

/*

1
6
-97 22 26 47 72 75

*/