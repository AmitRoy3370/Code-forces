
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Ilya_and_a_Colorful_Walk {
   
    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static class element implements Comparable<element> {
    
    int ai;
    int i;

        public element(int ai, int i) {
            this.ai = ai;
            this.i = i;
        }

        @Override
        public int compareTo(element t) {
    //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    if( this.ai==t.ai ){
        
        return -1;
        
    }
   
    if( this.i>t.i ){
        
        return 1;
        
    }else if(this.i<t.i){
        
        return -1;
        
    }
    
    return 0;
    
}
 
}
        
    public static void main(String[] amit) throws IOException {
        
 int n=in.nextInt();
 
 /*element a[]=new element[n];
 
 for(int i=0;i<n;i++){
     
     a[i]=new element(in.nextInt(),i+1);
     
 }
 
 Arrays.sort(a);
 
 out.println( Math.abs( a[0].i-a[n-1].i ) );
 out.flush();*/
 
 int a[]=new int[n];
 
 for(int i=0;i<n;i++){
     
     a[i]=in.nextInt();
     
 }
 
 int fa=-1,fb=1;
 
 for(int i=0;i<n;i++){
     
     if( a[i]!=a[n-1] ){
         
         fa=i;
         
         break;
         
     }
     
 }
 
 for(int i=n-1;i>=0;i--){
     
     if( a[i]!=a[0] ){
         
         fb=i;
         break;
         
     }
     
 }
 
 out.println( Math.max(fb,n-1-fa) );
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

5
1 2 3 2 3


*/

/*

3
1 2 1


*/

/*

7
1 1 3 1 1 1 1


*/