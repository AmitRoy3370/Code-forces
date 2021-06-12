
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Counting_Rhombi {

    static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        
    int w=in.nextInt();
    int h=in.nextInt();
        
    long sum=0;
    
    for(int i=w;i>1;i-=2){
        
        for(int j=h;j>1;j-=2){
            
            sum+=(i-1)*(j-1);
            
        }
        
    }
    
    out.println(sum);
    out.flush();
    
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
