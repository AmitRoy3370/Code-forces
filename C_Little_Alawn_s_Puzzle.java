
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class C_Little_Alawn_s_Puzzle {

        static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

  static int testCases,n;
 
  static int a[],b[];
  
  static boolean visited[];
  
  static List<Integer> list[];
  
  static void DFS(int element){
      
      visited[element]=true;
      
      for(int i:list[element] ){
          
          if( !visited[i] ){
              
              //visited[i]=true;
              
              DFS(i);
              
          }
          
      }
      
  }
  
  static void solve(){
      
     // list=new ArrayList[n+1];
      
      for(int i=0;i<n;i++){
          
          list[a[i]].add(b[i]);
          
          list[b[i]].add(a[i]);
          
      }
      
      long ans=1;
      
      for(int i=1;i<=n;i++){
          
          if( !visited[i] ){
              
              ans*=2;
              
              ans%=(long)((1e9)+7 );
              
              DFS(i);
              
          }
          
      }
      
      out.println(ans);
      out.flush();
      
  }
  
    public static void main(String[] amit) throws IOException {
        
      testCases=in.nextInt();
        
      for(int t=0;t<testCases;t++){
          
          n=in.nextInt();
          
          a=new int[n];
          
          b=new int[n];
          
          visited=new boolean[n+1];
          
          list=new ArrayList[n+1];
          
          for(int i=0;i<n;i++){
              
              a[i]=in.nextInt();
              
          }
          
          for(int i=0;i<n;i++){
              
              b[i]=in.nextInt();
              
          }
          
          for(int i=0;i<=n;i++){
              
              list[i]=new ArrayList<>();
              
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

2
4
1 4 2 3
3 2 1 4
8
2 6 5 1 4 3 7 8
3 8 7 5 1 2 4 6


*/