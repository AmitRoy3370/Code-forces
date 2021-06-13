
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Mean_Inequality {

      static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
      Arrays.sort(a);
        
      for(int i=0;i<n;i++){
          
          out.print(a[i]+" "+a[i+n]+" ");
          out.flush();
          
      }
      
      out.println();
      out.flush();
      
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[2*n];
            
            for(int i=0;i<2*n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            solve();
            
        }
        
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader(new InputStreamReader(System.in));
            
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
}
/*

3
3
1 2 3 4 5 6
2
123 456 789 10
1
6 9


*/

/*

1
2
123 456 789 10

*/