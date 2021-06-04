
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Meximization {

    static Scanner scanner=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,maxN=101;
    
    static void solve(int a[]){
        
       int hash[]=new int[maxN];
        
      // int MexOfArr=0;
       
       for(int i=0;i<n;i++){
           
           hash[ a[i] ]++;
           
       }
       
       for(int i=0;i<maxN;i++){
           
          if(hash[i]>0){
              
              out.print(i+" ");
              out.flush();
              
              hash[i]--;
              
          }
           
       }
       
      for(int i=0;i<maxN;i++){
          
          for(int j=0;j<hash[i];j++){
              
              out.print(i+" ");
              out.flush();
              
          }
          
      }
       
      out.println();
      out.flush();
      
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=scanner.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=scanner.nextInt();
            
            int a[]=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=scanner.nextInt();
                
            }
            
            solve(a);
            
        }
        
    }
    
     static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
    }
    
}
/*

1
7
4 2 0 1 3 3 7

*/

/*

1
4 2 1 5 3

*/