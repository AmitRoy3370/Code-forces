
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Lose_it {

     static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
     static int a[];       
            
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new int[n+6];
        
        for(int i=0;i<n;i++){
            
            a[i]=Math.min(6,in.nextInt()/4)-1;
            
            if(a[i]==0 || (a[n+a[i]]<a[n+a[i]-1]) ){
                
                a[n+a[i]]++;
                
            }
            
        }
        
        out.println( (n-a[n+5]*6) );
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

5
4 8 15 16 23


*/