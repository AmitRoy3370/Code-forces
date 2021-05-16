
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Petya_and_Strings {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] amit) throws IOException {
        
        int y=in.next().compareToIgnoreCase(in.next());
        
        if( y==0 ){
        
            out.println(0);
            out.flush();
        
        }else if(y>=1){
        
             out.println(1);
            out.flush();
        
        }else{
        
         out.println(-1);
            out.flush();
            
        }
//        out.flush();
        
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
    
}
/*

aaaa
aaaA


*/

/*

abs
Abz


*/

/*

abcdefg
AbCdEfF


*/