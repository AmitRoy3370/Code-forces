
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class U_Is_B_a_subsequence_of_A {

     static Scanner scanner=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
 
    static int n,m;
 
    public static void main(String[] args) throws IOException {
        
        n=scanner.nextInt();
        m=scanner.nextInt();
        
        long a[]=new long[n];
        long b[]=new long[m];
        
        for(int i=0;i<n;i++){
            
            a[i]=scanner.nextLong();
            
        }
        
        for(int i=0;i<m;i++){
            
            b[i]=scanner.nextLong();
            
        }
        
        int in=m-1,size=0;
        
        for(int i=n-1;i>=0;i--){
            
            if( a[i]==b[in] ){
                
                in--;
                 
                size++;
                
                if( in==-1 ){
                    
                    break;
                    
                }
                
            }
            
        }
        
        if( size==m ){
            
            out.print("YES");
            
            out.flush();
            
        }else{
            
            out.print("NO");
            
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

3 2
1 4 7
1 7

*/

/*

7 4
1 8 4 7 5 2 7
4 5 7 2

*/

/*

3 3
21 8 40
21 8 40

*/