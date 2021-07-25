
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B_Strings_Equalization {
    
          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases;
    
    static String s,t;
    
    static void solve(){
        
        char a[]=s.toCharArray();
        
        char b[]=t.toCharArray();
        
        Set<Character> set=new HashSet<>();
        
        for(char i: a){
            
            set.add(i);
            
        }
        
        boolean ok=false;
        
        for(char i: b){
            
            if( set.contains(i) ){
                
                ok=true;
                
                break;
                
            }
            
        }
        
        if(ok){
            
            out.println("YES");
            out.flush();
            
        }else{
        
        out.println("NO");
        out.flush();
        
    }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t1=0;t1<testCases;t1++){
            
            s=in.next();
            t=in.next();
            
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

3
xabb
aabx
technocup
technocup
a
z


*/