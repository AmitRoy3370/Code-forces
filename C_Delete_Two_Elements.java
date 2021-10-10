import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class C_Delete_Two_Elements {

	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
    
    static long a[];
    
    static long sum=0;
    
    static Map<Long,Integer> map=new HashMap<>();
    
    static void solve(){
                
        sum/=n;
             
        long count=0;
        
        long dp[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            dp[i]=(sum-a[i]);
            
        }
        
        long have[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            have[i]=map.containsKey(sum-a[i])?map.get(sum-a[i]):0;
            
            if( !map.containsKey(a[i]) ){
                
                map.put(a[i], 1);
                
            }else{
                
                map.put(a[i],map.get(a[i])+1);
                
            }
            
        }
        
       /* for(long i: have){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        Map<Long,Boolean> visit=new HashMap<>();
        
        for(int i=0;i<n;i++){
            
            long difference=dp[i];
            
            //count+=visit.containsKey(difference)?map.get(difference):0;
             
            count+=visit.containsKey(difference)?have[i]:0;
            
            visit.put(a[i], Boolean.TRUE);
                 
            /*if( !map.containsKey(a[i]) ){
                
                map.put(a[i], 1);
                
            }else{
                
                map.put(a[i], map.get(a[i])+1);
                
            }*/
            
        }
            
        out.println(count);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
         
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            sum=0;
            
            map=new HashMap<>();
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
                sum+=a[i];
                
            }
        
                    sum*=2;
        
        if( sum%n!=0 ){
            
            out.println(0);
            out.flush();
            
            //return;
            
        }else{
            
            solve();
            
        }
            
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
/*

4
4
8 8 8 8
3
50 20 10
5
1 4 7 3 5
7
1 2 3 4 5 6 7


*/

/*

1
7
1 2 3 4 5 6 7

*/