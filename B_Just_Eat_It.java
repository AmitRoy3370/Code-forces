
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Just_Eat_It {

        static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        long sum=0;
        
        for(int i=0;i<n;i++){
            
            sum+=a[i];
            
            if(sum<=0){
                
                out.println("NO");
                out.flush();
                
                return;
                
            }
            
        }
        
        sum=0;
        
          for(int i=n-1;i>=0;i--){
            
            sum+=a[i];
            
            if(sum<=0){
                
                out.println("NO");
                out.flush();
                
                return;
                
            }
            
        }
        
          out.println("YES");
          out.flush();
          
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
            }
            
            solve();
            
        }
        
        in.close();
        
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

3
4
1 2 3 4
3
7 4 -1
3
5 -5 5


*/


/*

1
3
7 4 -1

*/

/*

1
3
5 -5 5


*/

/*

12
3
7 -4 5
3
7 -5 4
3
4 -5 7
3
5 -4 7
4
5 -5 -6 6
5
100 100 100 -50 50
10
10 5 -12 7 -10 20 30 -10 50 60
10
10 5 -14 7 -7 20 30 -50 50 60
2
1 1
2
-1 -1
3
1000000000 1000000000 1000000000
3
-1000000000 -1000000000 -1000000000

*/

/*

1
3
7 -4 5

*/