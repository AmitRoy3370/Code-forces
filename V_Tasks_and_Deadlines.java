
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class V_Tasks_and_Deadlines {

            static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(new OutputStreamWriter( System.out ));
    
    static class Pair implements Comparable<Pair> {
        
        long x;
        long y;

        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair t) {
      //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
      if(this.x>t.x){
          
          return 1;
          
      }else if(this.x<t.x){
          
          return -1;
          
      }
      
      return 0;
      
        }
      
    }
    
    public static void main(String[] amit) throws IOException {
        
        int n=in.nextInt();
        
        Pair a[]=new Pair[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=new Pair(in.nextLong(),in.nextLong());
            
        }
        
        Arrays.sort(a);
        
        long sum=0,start=0;
        
        for(int i=0;i<n;i++){
            
            start+=a[i].x;
            
            sum+=a[i].y-start;
            
        }
        
        out.println(sum);
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
