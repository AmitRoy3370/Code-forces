import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class B_Divine_Array {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n,q;
    
    static long a[],dp[][];
    
    static long x,k;
	
	static StringBuilder ans=new StringBuilder();
	
	static Map<Long,Integer> map=new HashMap<>();
        
    static void solve(){
        
        /*if(k==0){
            
            out.println(a[(int)x] );
            out.flush();
            
        }else{*/
        
		   if(k>=dp.length){
			   
			   k=dp.length-1;
			   
		   }
		
			//out.println( dp[(int)x-1][(int)k] );   
		    //out.flush();
            
			ans.append( dp[(int)k][(int)x-1] ).append("\n");
			
        //}
        
    }
    
	static void makeDPArray(){
	
        //list.add(a);         
		
		/*for(int i=0;i<n;i++){
			
			dp[i][0]=a[i];
			
		}*/
		
		//dp[0]=a;
		
		/*for(long i: list.get(0)){
			
			out.print(i+" ");
			out.flush();
			
		}
		
		out.println();
		out.flush();*/
		
			for(int i = 0; i < dp.length-1; i++) {
				
				Map<Long, Integer> counts = new HashMap<>();
				
				for(long j : dp[i]) {
				
				counts.put(j, counts.getOrDefault(j, 0)+1);
				
				}
				
				for(int j = 0; j < n; j++) {
					
					dp[i+1][j] = counts.get(dp[i][j]);
				
				}
			
			}
			
			/*out.println("stored in the dp: ");
			out.flush();
			
			for(int i=0;i<=5;i++){
				
				for(int j=0;j<n;j++){
					
					System.out.print( dp[i][j]+" " );
					
				}
				
				System.out.println();
				
			}*/
			
			/*for(long i[]: list){
				
				for(long j: i ){
					
					out.print(j+" ");
					out.flush();
					
				}
				
				out.println();
				out.flush();
				
			}*/
			
	}
	
    public static void main(String[] sumit) throws IOException {
        
	//	dp=new long[2001][51];
		
		//makeDPArray();
		
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n+1];
            
			dp=new long[2*n][n];
			
            for(int i=0;i<n;i++){
                
                dp[0][i]=in.nextLong();
                   
            }
			
			//for(long i1[]:dp ){
				
				/*for(int i=0;i<n;i++){
					
					out.print(dp[0][i]+" ");
					out.flush();
					
				}
				
				out.println();
				out.flush();*/
				
			//}
          
		 //   list=new ArrayList<>(); 
			
		//	dp=new long[2001][510];
		  
            makeDPArray();
		  
            /*for(int i=1;i<=n;i++){
                
                map.put(a[i],map.get(a[i])+1 );
                
            }*/
            
            q=in.nextInt();
            
            for(int i=0;i<q;i++){
                
                x=in.nextLong();
                
                k=in.nextLong();
                
                solve();
                
            }
            
        }
        
        in.close();
        
		out.println(ans);
		out.flush();
		
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
/*

2
7
2 1 1 4 3 1 2
4
3 0
1 1
2 2
6 1
2
1 1
2
1 0
2 1000000000


*/

/*

1
7
2 1 1 4 3 1 2
4
3 0
1 1
2 2
6 1

*/

/*

1
7
2 1 1 4 3 1 2
1
3 0

*/