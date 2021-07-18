
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Double_Trouble {

    
          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    public static void main(String[] amit) throws IOException {
        
        char []s=in.nextLine().toCharArray();
        
        int n=s.length;
        
        if(n==1){
            
            out.println(s);
            out.flush();
            
            return;
            
        }
        
        for(int i=0;i<n-1;i++){
            
           int j=i,count=0;
           
           while( i+1<=n-1 && s[i]!=' ' && s[i]==s[i+1]){
               
               count++;
               
               i++;
               
           }
            
           if(count==1){
               
              s[j]='1';
               
           }
           
        }
        
   //    out.println(s);
     //   out.flush();
        
      StringBuilder ans=new StringBuilder();
        
      for(char i: s){
          
          if(i!='1'){
              
              ans.append(i);
              
          }
          
      }
      
        out.println(ans);
        out.flush();
        
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
//ugghhh i hate bookkeepers so much