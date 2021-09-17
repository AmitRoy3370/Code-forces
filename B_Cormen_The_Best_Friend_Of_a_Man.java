
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Cormen_The_Best_Friend_Of_a_Man {

       static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

  static int n,k;
    
  static int a[];
  
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new int[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
        }
        
        in.close();
        
        int b[]=new int[n];
        
        b[0]=a[0];
        
        for(int i=1;i<n;i++){
            
            b[i]=Math.max(0,k-b[i-1] );
            
            if( !(b[i]>=a[i]) ){
                
                b[i]=a[i];
                
            }
            
        }
        
        int addition=0;
        
        for(int i=0;i<n;i++){
            
            addition+=Math.abs(a[i]-b[i]);
            
        }
        
        out.println(addition);
        out.flush();
        
        for(int i: b){
            
            out.print(i+" ");
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

3 5
2 0 1


*/

/*

3 1
0 0 0


*/

/*

4 6
2 4 3 5


*/