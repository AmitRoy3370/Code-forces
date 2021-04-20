
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Lucky_Ticket {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static String s;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        s=in.next();
        
        char []ch=s.toCharArray();
        
        for(char i: ch){
            
            if( i!='4' && i!='7' ){
                
                out.println("NO");
                out.flush();
                
                return;
                
            }
            
        }
        
        long sum=0,sum1=0;
        
       for(int i=0;i<ch.length/2;i++){
           
           sum+=Long.parseLong( String.valueOf(ch[i]) );
           
           sum1+=Long.parseLong( String.valueOf(ch[n-i-1]) );
           
       }
        
       if( sum1!=sum ){
           
             out.println("NO");
                out.flush();
                
                return;
           
       }
       
            out.println("YES");
                out.flush();
                
      //          return;
       
    }
 
      static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer( in.readLine() );
                
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

double nextDouble() throws IOException{
    
    return Double.parseDouble( next() );
    
}
        
    }
    
}
/*

2
47


*/