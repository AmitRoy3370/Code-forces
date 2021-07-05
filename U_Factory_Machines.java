
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class U_Factory_Machines {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(new OutputStreamWriter( System.out ));
    
    static int n;
    
    static long a[];
    
    static long m;
    
   static boolean check(long p){
        
        long sum=0;
        
        for(int i=0;i<n;i++){
            
            sum+=Math.min(p/a[i],1e9);
            
        }
        
       return sum>=m;
        
    }
    
    public static void main(String[] amit) throws IOException {
        
         n=in.nextInt();
        
         m=in.nextLong();
        
         a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        long low=0,high=(long) 1e18;
        
        while(high>low){
            
            long mid=(low+high)/2;
            
            if( check(mid) ){
                
                high=mid;
                
            }else{
                
                low=mid+1;
                
            }
            
        }
        
        out.println(low);
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
    }
    
}
/*

3 7
3 2 5


*/