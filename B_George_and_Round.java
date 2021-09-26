import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_George_and_Round{

	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int n,m;

static int a[],b[];

static void solve(){
	
int i=0,j=0;
	
	while(j<m && i<n){
	
	while(j<m && a[i]>b[j]){
		
		j++;
		
	}
	
if(j>=m){
	
	break;
	
}	
		
i++;
j++;
		
	}
	
	int ans=0;
	
	if(n>i){
		
		ans=n-i;
		
	}
	
	out.println(ans);
	out.flush();
	
}

	public static void main(String[] amit) throws IOException{
		
	n=in.nextInt();

m=in.nextInt();	
		
		a=new  int[n];
		
		b=new int[m];
		
		for(int i=0;i<n;i++){
			
			a[i]=in.nextInt();
			
		}
		
		for(int i=0;i<m;i++){
			
			b[i]=in.nextInt();
			
		}
		
		solve();
		
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