import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Balanced_Array{
	
	static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
	
	static int n,testCases;
	
	static void solve(){
		
		if( (n/2)%2==1 ){
			
			out.println("NO");
			out.flush();
			
			return;
			
		}
		
		long sum=0;
		
		out.println("YES");
		out.flush();
		
		for(long i=2;i<=n;i+=2){
			
			out.print(i+" ");
			out.flush();
			
			sum+=i;
			
		}
		
	//	out.println("sum before: "+sum);
		//out.flush();
		
		long a[]=new long[n/2];
		
		int index=0;
		
		for(int i=1;i<=n-2;i+=2){
			
			//out.print(1+" ");
			//out.flush();
			
			sum-=i;
			
			//out.println("sum: "+sum);
		//out.flush();
			
			a[index++]=i;
			
//	sum-=i;
			
			if(i>=n-1){
				
				break;
				
			}
			
		}
		
		//out.print(sum+" ");
		//out.flush();
		
		//out.println("sum aftr: "+sum);
		//out.flush();
		
		if(sum%2==0){
			
			a[n/2-1]=sum-1;
			
			a[n/2-2]=a[n/2-2]+2 ;
			
			for(long i: a){
				
				out.print(i+" ");
				out.flush();
				
			}
			
			out.println();
			out.flush();
			
		}else{
			
			a[ (n/2)-1 ]=sum;
			
			for(long i: a){
				
				out.print(i+" ");
				out.flush();
				
			}
			
			out.println();
			out.flush();
			
		}
		
	}
	
	public static void main(String[] amit) throws IOException{
		
		testCases=in.nextInt();
		
		for(int i=0;i<testCases;i++){
			
			n=in.nextInt();
			
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
