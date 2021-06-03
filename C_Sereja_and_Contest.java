
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Sereja_and_Contest {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static long k;
    
    static long a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextLong();
        
        a=new long[n+1];
        
        for(int i=1;i<=n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        long pre=0,num=0;
        
        for(int i=1;i<=n;i++){
           
            if( pre-(n-i)*a[i]*num<k ){
                
                out.println(i);
                out.flush();
                
            }else{
                
                pre+=num*a[i];
                
                num++;
                
            }
            
        }
        
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next());
            
        }
        
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
    }
    
}
/*

5 0
5 3 4 1 2


*/

/*

10 -10
5 5 1 7 5 1 2 4 9 2


*/