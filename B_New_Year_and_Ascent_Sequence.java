import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class B_New_Year_and_Ascent_Sequence{
	
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n,MAX = 1000001;;
	
	static long [] a;
	
	static List<long []> list=new ArrayList<>();
	
	static void solve(){
		
		if( !isSorted(a) ){
			
			list.add( new long[]{a[0],a[n-1]} );
			
		}
		
	}

	public static void main(String [] amit) throws IOException{
		
		long testCases=in.nextLong();
		
		for(int t=0;t<testCases;t++){
			
			n=in.nextInt();
			
			a=new long[n];
			
			for(int i=0;i<n;i++){
				
				a[i]=in.nextLong();
				
			}
			
			solve();
			
		}
		
		long ans=testCases*testCases;
		
		ans-=count();
		
		out.println( (long)Math.abs(ans ) );
		out.flush();
		
		/*for(long i[]: list){
			
			for(long j: i){
				
				out.print(j+" ");
				out.flush();
				
			}
			
			out.println();
			out.flush();
			
		}*/
		
		in.close();
		
	}
	
	static long count(){
		
		//Map<Long,Integer> map=new HashMap<>();
	    
        long count[]=new long[MAX]; 		
     		
		for(long i[] : list){
			
			//map..put(i[0], counts.getOrDefault(i[0], 0)+1);
			
			count[ (int)i[0] ]++;
			
		}
		
		for(int i=1;i<count.length;i++){
			
			count[i]+=count[i-1];
			
		}
		
		long ans=0;
		
		for(long i[]: list){
			
			ans+=count[(int)i[1]];
			
		}
		
		return ans;
		
	}
	
    static boolean isSorted(long a[]){
		
		long sort=a[0];
		
		for(long i: a){
			
			if( sort<i ){
				
				return true;
				
			}
			
			sort=i;
			
		}
		
		return false;
		
	}
	
    static long gcd(long a, long b)   
{   
  
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
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