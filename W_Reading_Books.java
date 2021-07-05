
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class W_Reading_Books {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(new OutputStreamWriter( System.out ));
    
    public static void main(String[] amit) throws IOException {
        
        int n;
        
        n=in.nextInt();
        
        int a[]=new int[n];
        
        long sum=0;
        
        int max=0;
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
            sum+=a[i];
            
            max=Math.max(a[i],max);
            
        }
        
        if(max>sum-max){
            
            out.println(2*max);
            out.flush();
            
        }else{
            
            out.println(sum);
            out.flush();
            
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

3
2 8 3


*/