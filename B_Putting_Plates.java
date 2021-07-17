
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Putting_Plates {

         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases,h,w;
    
    static void solve(){
        
        int a[][]=new int[h][w];
           
       a[0][0]=1;
    a[h-1][0]=1;
    a[0][w-1]=1;
    a[h-1][w-1]=1;
          
    int haveTo=h%2==0?3:2;
    
        for(int i=haveTo;i<h;i+=2){
            
            a[i][0]=1;
            
        }
        
        for(int i=haveTo;i<h;i+=2){
            
            a[i][w-1]=1;
            
        }
              
        haveTo=w%2==0?3:2;
        
        for(int i=haveTo;i<w;i+=2){
            
            a[0][i]=1;
            
        }
        
        for(int i=haveTo;i<w;i+=2){
            
            a[h-1][i]=1;
            
        }
        
    for(int i[] :a){
        
        for(int j: i){
            
            out.print(j);
            out.flush();
            
        }
        
        out.println();
        out.flush();
        
    }
    
    out.println();
    out.flush();
    
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            h=in.nextInt();
            w=in.nextInt();
            
            solve();
            
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
        
    }
    
    
}
/*

3
3 5
4 4
5 6


*/

/*

1
3 5

*/

/*

1
4 4

*/