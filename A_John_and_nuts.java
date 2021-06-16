
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_John_and_nuts {

     static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,x,k;
    
     static int a[],b[];       
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new int[n];
        
        x=in.nextInt();
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
        }
        
        k=in.nextInt();
        
        b=new int[k];
        
        for(int i=0;i<k;i++){
            
            b[i]=in.nextInt();
            
            a[b[i]-1]=0;
            
        }
        
        int ans=0;
        
        for(int i=0;i<n;i++){
            
            ans+=a[i];
            
        }
        
        out.println( (ans+1) );
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
/*

5 19
9 1 2 3 4
2
2 4


*/