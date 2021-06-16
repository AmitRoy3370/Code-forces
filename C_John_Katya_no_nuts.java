
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_John_Katya_no_nuts {

      static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] amit) throws IOException {
        
        int a=in.nextInt();
        int b=in.nextInt();
        
      //  int ans=Math.min(a,b)+Math.abs(a-b)+1;
        
    if(a>=b){
        
        if(b==0){
            
            out.print( (2*a+1) );
            out.flush();
            
        }else{
            
            out.print(0);
            out.flush();
            
        }
        
    }else{
        
        if(2*a>b){
            
            out.print(0);
            out.flush();
            
        }else{
            
            out.print( (b+1) );
            out.flush();
            
        }
        
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
