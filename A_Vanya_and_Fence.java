
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Vanya_and_Fence {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,h;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
h=in.nextInt();
    
int sum=n;

for(int i=0;i<n;i++){
    
    int a=in.nextInt();
    
    if(a>h){
        
        sum++;
        
    }
    
}

out.println(sum);
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

3 7
4 5 14


*/