
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Egocentric_Subarrays {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    
    static long k;
    
    static class element implements Comparable<element> {
        
        long ai;
        int i;

        public element(long ai, int i) {
            this.ai = ai;
            this.i = i;
        }

        @Override
        public int compareTo(element t) {
       //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       if(this.ai>t.ai && this.i<t.i ){
           
           return 1;
           
       }else if(this.ai<t.ai && this.i>t.i ){
           
           return -1;
           
       }
       
       return 0; 
       
        }
       
        @Override
        public String toString(){
            
            return this.ai+" "+this.i;
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextLong();
        
       /* element a[]=new element[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=new element(in.nextLong(),i);
            
        }
        
        Arrays.sort(a);
        
        for(element i: a){
            
            out.println(i.toString());
            out.flush();
            
        }
        
        int ans=0;
        
        for(int i=n-1;i>=0;i--){
            
            int j=0;
            
          while( i<j && j<n && Math.abs(a[i].ai-a[j].ai)!=k ){
              
              j++;
              
          }
             
          if(j<n && Math.abs(a[i].ai-a[j].ai)==k ){
          
          ans+=n-Math.max( a[i].i,a[j].i );
          
          }
          
        }
        
        out.println(ans);
        out.flush();*/
        
       long a[]=new long[n];
       
       for(int i=0;i<n;i++){
           
           a[i]=in.nextLong();
           
       }
       
       int ans=0;
       
       for(int i=0;i<=n-1;i++){
           
           for(int j=i+1;j<=n-1;j++){
               
               long max=Long.MIN_VALUE,min=Long.MAX_VALUE;
               
   //            out.println(" in range "+i+" and "+j);
     //          out.flush();
               
           for(int k1=i;k1<=j;k1++){
               
               max=Math.max(a[k1],max);
               min=Math.min(a[k1],min);
               
           }    
               
       //    out.println(" max: "+max+" ,min: "+min);
         //  out.flush();
           
           if( max-min==k ){
               
               ans++;
               
           }
           
           }
           
       }
       
       out.println(ans);
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

11 7
1 3 7 6 4 2 11 18 12 9 1


*/

/*

5 3
5 4 1 2 3


*/