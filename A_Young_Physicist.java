
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Young_Physicist {

    static Scanner scanner=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long n,x,y,z,sumX=0,sumY=0,sumZ=0;
    
    public static void main(String[] args) throws IOException {
        
        n=scanner.nextLong();

for(int i=0;i<n;i++){
    
    x=scanner.nextLong();
    y=scanner.nextLong();
    z=scanner.nextLong();
    
    sumX+=x;
    sumY+=y;
    sumZ+=z;
    
}        
        
if( sumX==0 && sumY==0 && sumZ==0 ){
    
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
        
            in=new BufferedReader( new InputStreamReader(System.in) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
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

3
4 1 7
-2 4 -1
1 -5 -3

*/

/*

3
3 -1 7
-5 2 -4
2 -1 -3

*/