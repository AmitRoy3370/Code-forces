
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A_Even_Subset_Sum_Problem {

          static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int testCases,n;
  
  static int a[];
  
  static void solve(){
      
      if(n==1){
          
          if(a[0]%2!=0){
              
              out.println(-1);
              out.flush();
 
              return;
              
          }
          
      }
      
      int even=-1;
      
      Set<Integer> set=new HashSet<>();
      
      for(int i=0;i<n;i++){
          
          if(a[i]%2==0){
              
              out.println( 1+"\n"+(i+1) );
              out.flush();
              
              return;
              
          }else{
              
              set.add(i+1);
              
          }
          
      }
      
      if(set.size()<2){
          
          out.println(-1);
          out.flush();
      
          return;
          
      }
      
      out.println(2);
      out.flush();
      
      int j=1;
      
      for(int i: set){
          
          out.print(i+" ");
          out.flush();
          
          j++;
          
          if(j>2){
              
              break;
              
          }
          
      }
      
      out.println();
      out.flush();
      
  }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
            }
            
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
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

3
3
1 4 3
1
15
2
3 5


*/

/*

1
3
65 13 87

*/