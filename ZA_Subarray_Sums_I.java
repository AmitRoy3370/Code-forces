
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ZA_Subarray_Sums_I {

           static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,k;
    
    static long a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        Map<Long,Integer> map=new HashMap<>();
        
        long sum=0;
        
        int count=0;
        
        for(long i: a){
            
            sum+=i;
            
            if(sum==k){
                
               count++;
                
            }
            
            if( map.containsKey(sum-k) ){
                
                count+=map.get(sum-k);
                
            }
            
            if(map.containsKey(sum)){
            
            map.put(sum, map.get(sum)+1);
            
            }else{
                
                map.put(sum, 1);
                
            }
            
        }
        
        out.println(count);
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
    
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
    }
    
}
/*

5 7
2 4 1 2 7


*/