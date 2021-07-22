
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Delete_from_the_Left {

            
     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    public static void main(String[] amit) throws IOException {
        
    char s[]=in.next().toCharArray();
        
    char t[]=in.next().toCharArray();
    
    in.close();
    
    int n=s.length,m=t.length,w=0;
    
   while(true){
       
       int i=n-w-1;
       
       int j=m-w-1;
       
       if( i>=0 && j>=0 && s[i]==t[j] ){
           
           w++;
           
       }else{
           
           break;
           
       }
       
   }
    
   out.println( (n+m-2*w) );
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
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

test
west


*/

/*

codeforces
yes


*/

/*

test
yes


*/

/*

b
ab


*/