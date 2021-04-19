
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Anton_and_Danik {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,a=0,d=0;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        String s=in.next();
        
        char []ch=s.toCharArray();
        
        for(int i=0;i<n;i++){
            
            if( ch[i]=='A' ){
                
                a++;
                
            }else{
                
                d++;
                
            }
            
        }
        
        if(a>d){
            
            out.print("Anton");
            out.flush();
            
        }else if(d>a){
            
             out.print("Danik");
            out.flush();
            
        }else{
            
             out.print("Friendship");
            out.flush();
            
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

6
ADAAAA

*/