
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class K_Collecting_Numbers {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
static int n;
    
static long x;

static int a[];

 static class pair implements Comparable<pair> {
        
        long ai;
        int index;

        public pair(long ai, int index) {
            this.ai = ai;
            this.index = index;
        }

        @Override
        public int compareTo(pair t) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
if(this.ai>t.ai){
    
    return 1;
    
}else if(this.ai<t.ai){
    
    return -1;
    
}
    
return 0;

        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
         a=new int[n];
    
         long count[]=new long[n];
         
     //    Map<Long,Integer> map=new HashMap<>();
       
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt()-1;
            
           count[a[i]]=i;
            
        }
        
       // out.println(map);
        //out.flush();
        
        int passes=1;
        
        for(int i=1;i<n;i++){
            
            try{
            
            if( count[i]<count[i-1] ){
                
                passes++;
                
            }
            
            }catch(NullPointerException e){
                
                
            }
        }
        
        out.println(passes);
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
