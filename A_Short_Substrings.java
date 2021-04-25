
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Short_Substrings {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    
    static String s;
    
    static void solve(){
        
        if( s.length()==2 ){
            
            out.println(s);
            out.flush();
            
            return;
            
        }
        
        char ch[]=s.toCharArray();
        
        StringBuilder sb=new StringBuilder();
        
        sb.append(ch[0]);
        sb.append(ch[1]);
        
        int n=ch.length;
        
        for(int i=3;i<n;i+=2){
            
            sb.append(ch[i]);
            
        }
        
        out.println(sb.toString());
        
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            s=in.next();
            
            solve();
            
        }
        
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
