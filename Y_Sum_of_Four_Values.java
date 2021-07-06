
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Y_Sum_of_Four_Values {

         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
static int n;
    
static long x;

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
        
       x=in.nextLong();
        
       a=new pair[n];
       
       for(int i=0;i<n;i++){
           
           a[i]=new pair(in.nextLong(),i+1);
           
       }
       
  //     Arrays.sort(a);
       
  Map<Long,pair> map=new HashMap<>();
  
       for(int i=0;i<n;i++){
           
           for(int j=i+1;j<=n-1;j++){
    
               if( map.containsKey(x-(a[i].ai+a[j].ai) ) ){
                   
                   out.println((i+1)+" "+(j+1)+" "+(map.get( x-a[i].ai-a[j].ai ).ai+1)+" "+(map.get( x-a[i].ai-a[j].ai).index )  );
                   out.flush();
                   
                   return;
                   
               }
   
           }
   
           for(int j=0;j<i;j++){
               
               map.put(a[i].ai+a[j].ai, new pair(i,j+1) );
               
           }
           
       }
       
       out.println(-1);
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

8 15
3 2 5 8 1 3 2 3


*/