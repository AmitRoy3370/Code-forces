import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Saving_the_City{
		
	static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static int testCases,activating,placing;

static char a[];

static void solve(){
	
	int first=-1,last=-1,n=a.length;
	
	if(n==1){
		
		if( a[0]=='0' ){
			
			out.println(0);
			out.flush();
			
		}else{
			
			out.println(activating);
			out.flush();
			
		}
		
		return;
		
	}
	
	for(int i=0;i<n;i++){
		
		if( a[i]=='1' ){
			
			first=i;
			break;
			
		}
		
	}
	
	for(int i=n-1;i>=0;i--){
		
		if( a[i]=='1' ){
			
		last=i;
			
			break;
			
		}
		
	}
	
	if( first==last && first==-1 ){
		
		out.println(0);
		out.flush();
		
		return;
		
	}
	
	long totalCost=activating;
	
	for(int i=first;i<=last;i++){
		
		int addition=0;
		
		while(i<n && a[i]=='0' ){
			
			i++;
			
			addition++;
			
		}
		
		totalCost+=Math.min( activating,addition*placing );
		
	}
	
	out.println(totalCost);
	out.flush();
	
}

	public static void main(String amit[]) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			activating=in.nextInt();
			
			placing=in.nextInt();
			
			a=in.next().toCharArray();
			
			solve();
			
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