
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E_Count_Substrings {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    
    public static void main(String[] amit) throws IOException {
        
    n=in.nextInt();
        
    char s[]=in.next().toCharArray();
    
    char t[]=in.next().toCharArray();
    
    long ans=0,l=0;
    
    for(int i=0;i<n-1;i++){
        
        if( s[i]==t[0] && s[i+1]==t[1] ){
            
        int left=(int) ((int) (i+1)-l);
        int right=(n-(i+1) );
        
        ans+=(left*right);
            
        l=i+1;
        
        }
        
      //  l=i+1;
        
    }
    
    out.println(ans);
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
    
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
    }
    
}
/*

4
dabc
ab


*/