
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Partial_Replacement {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,k;
    
    static String s;
    
    static void solve(){
        
        List<Integer> pos=new ArrayList<>();
        
        char ch[]=s.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            
            if( ch[i]=='*' ){
                
                pos.add(i);
                
            }
            
        }
        
        if( pos.size()<=2 ){
            
            out.println(pos.size());
            
            out.flush();
            
            return;
            
        }
        
      int p[]=new int[pos.size()];
      
      int index=0,last=pos.get(0);
      
      for(int i: pos){
          
          p[index++]=i;
          
      }
      
      int n1=p.length,ans=1,res=1;
      
      for(int i=1;i+1<n1;i++){
          
          if( p[i]-last>k ){
              
              ++ans;
              
              last=p[i-1];
              
          }
          
      }
      
      if( p[n1-1]-last>k ){
          
          ++ans;
          
      }
      
      ++ans;
      
      last=p[n1-1];
      
      for(int i=n1-2;i>=1;i--){
          
          if( last-p[i]>k ){
              
              ++res;
              
              last=p[i+1];
              
          }
          
      }
      
      if( last-p[0]>k ){
          
          ++res;
          
      }
      
      ++res;
      
      out.println( Math.min(ans, res) );
      
      out.flush();
      
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            k=in.nextInt();
            
            s=in.next();
            
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
    
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
    }
    
}
/*

5
7 3
.**.***
5 1
..*..
5 2
*.*.*
3 2
*.*
1 1
*

*/

/*

1
7 3
.**.***

*/