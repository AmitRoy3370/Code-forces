
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_WOW_Factor {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    public static void main(String[] amit) throws IOException {
        
        char []ch=in.next().toCharArray();
        
        long a=0,b=0,c=0; 
        int n=ch.length;
        
        for(int i=0;i<n;i++){
            
            if(ch[i]=='o'){
                
                b+=a;
                
            }else if(i>0 && ch[i-1]=='v'){
                
                a++;
                
                c+=b;
                
            }
            
        }
        
        out.println(c);
        out.flush();
        
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
//vvvovvv
//vvovooovovvovoovoovvvvovovvvov
