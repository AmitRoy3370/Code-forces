
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class X_Sum_of_Three_Values {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    static long k;
    
    static pair a[];
    
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
        
        k=in.nextLong();
        
        a=new pair[n];
        
        long x[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=new pair(in.nextLong(),i+1);
            
            x[i]=a[i].ai;
            
        }
       
        if(n<3){
            
            out.println(k+" "+n+" "+a[0].ai);
            out.flush();
            
            return;
            
        }
        
        Arrays.sort(a);
        
        for(int i=0;i<=n-1;i++){
            
            long x2=k-a[i].ai;
            
        for(int j=i+1,k1=n-1;j<k1 ; j++){
            
            while(a[j].ai+a[k1].ai>x2){
                
           k1--;
                
            }
           
            if(j<k1 && a[j].ai+a[k1].ai==x2 ){
                
                out.println( a[i].index+" "+a[j].index+" "+a[k1].index );
                out.flush();
                
                return;
                
            }
            
        }
        
        }
        
        out.println("-1");
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
