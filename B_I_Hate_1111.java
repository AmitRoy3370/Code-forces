
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_I_Hate_1111 {

      static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    
    static long n;
    
    static void solve(){
        
        long a[]={0,0,11,111,1111,11111,111111,1111111,11111111,111111111};
        
       // int ans=0;
        
      for(int i=0;i<20;i++){
          
          if(n%11==0){
              
              out.println("YES");
              out.flush();
              
              return;
              
          }
          
          n-=111;
          
          if(n<0){
              
              out.println("NO");
              out.flush();
              
              return;
              
          }
          
      }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            
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
33
144
69


*/

/*

1
2047


*/