
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A_Diverse_Strings {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    
    static String s;
    
    static void solve(){
        
        char []ch=s.toCharArray();
        
        Set<Character> set=new HashSet<>();
        
        for(char i: ch){
            
            set.add(i);
            
        }
        
        if(set.size()!=s.length()){
            
            out.println("NO");
            
            out.flush();
            
            return;
            
        }
        
        Arrays.sort(ch);
        
        for(int i=1;i<ch.length;i++){
            
            if( ch[i]-ch[i-1]!=1 ){
                
                out.println("NO");
                out.flush();
                
                return;
                
            }
            
        }
        
        out.println("YES");
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
/*

8
fced
xyz
r
dabcef
az
aa
bad
babc


*/