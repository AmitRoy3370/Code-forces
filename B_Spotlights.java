
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Spotlights {

        static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

  static int n,m;
  
  static int a[][],raw[],col[],prefixRaw[],prefixColumn[];
  
  static void solve(){
      
      int ans=0;
      
      for(int i=0;i<n;i++){
          
          for(int j=0;j<m;j++){
              
              if( a[i][j]==0 ){
                  
                if( raw[i]>=1 ){
                    
                    ans++;
                    
                } 
                  
                if( col[j]>=1 ){
                    
                    ans++;
                    
                }
                  
                if( prefixRaw[i]>=1 ){
                    
                    ans++;
                    
                }
                
                if( prefixColumn[j]>=1 ){
                    
                    ans++;
                    
                }
                
              }else{
                  
                  prefixRaw[i]++;
                  prefixColumn[j]++;
                  
                  raw[i]--;
                  col[j]--;
                  
              }
              
          }
          
      }
      
      out.println(ans);
      out.flush();
      
  }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        m=in.nextInt();
        
        raw=new int[n];
        
        col=new int[m];
        
        prefixRaw=new int[n];
        
        prefixColumn=new int[m];
        
        a=new int[n][m];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                
                a[i][j]=in.nextInt();
                
                raw[i]+=a[i][j];
                
                col[j]+=a[i][j];
                
            }
            
        }
        
        in.close();
        
        solve();
        
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

2 4
0 1 0 0
1 0 1 0


*/

/*

4 4
0 0 0 0
1 0 0 1
0 1 1 0
0 1 0 0


*/