import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Uncowed_Forces{
	
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int maximumPoint[]={500,1000,1500,2000,2500};
	
	static int m[]=new int[5];
	
	static int w[]=new int[5];
	
	static int h[]=new int[2];
	
	public static void main(String []amit) throws IOException{
		
		for(int i=0;i<5;i++){
			
			m[i]=in.nextInt();
			
		}
		
		for(int i=0;i<5;i++){
			
			w[i]=in.nextInt();
			
		}
	
for(int i=0;i<2;i++){
	
	h[i]=in.nextInt();
	
}
	
	int achive=h[0]*100-h[1]*50,n=5;
	
	for(int i=0;i<n;i++){
		
		achive+=Math.max(0.3*maximumPoint[i], maximumPoint[i]-( maximumPoint[i]*m[i]/250 )-50*w[i] );
		
	}
	
	out.println(achive);
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