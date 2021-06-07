import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Same_Parity_Summands{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n,k,testCases;
	
	static void solve(){
		
		int a[]=new int[k];
		
		if(k>n || ( n%2==1 && k%2==0) || (n%2==0 && k%2==1 && n<2*k) ){
			
			out.println("NO");
			out.flush();
			
			return;
			
		}
		
		if( (n%2==0 && k%2==0) || ( n%2==1 && k%2==1 ) ){
			
			for(int i=0;i<k-1;i++){
				
				a[i]=1;
				
			}
			
			a[k-1]=n-(k-1);
			
		}else if( (n%2==0) && ( k%2==1 && n>=2*k ) ) {
			
			for(int i=0;i<k-1;i++){
				
				a[i]=2;
				
			}
			
			a[k-1]=n-(k-1)*2;
			
		}
		
		out.println("YES");
		out.flush();
		
		for(int i: a){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			k=in.nextInt();
			
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

/*

8
10 3
100 4
8 7
97 2
8 8
3 10
5 3
1000000000 9


*/