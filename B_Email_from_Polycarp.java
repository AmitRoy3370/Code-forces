
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Email_from_Polycarp {
      
          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases;
    
    static String s,t;
    
    static void solve(){
        
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        
        int n=a.length,m=b.length;
        
        int st=0;
        
        for(char i: b){
            
            if( st<n && i==a[st] ){
                
                st++;
                
            }else if( st==0 || i!=a[st-1] ){
                
                out.println("NO");
                out.flush();
                
                return;
                
            }
            
        }
        
        if( n==st ){
            
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

4
hello
hello
hello
helloo
hello
hlllloo
hello
helo


*/

/*

5
aa
bb
codeforces
codeforce
polycarp
poolycarpp
aaaa
aaaab
abcdefghijklmnopqrstuvwxyz
zabcdefghijklmnopqrstuvwxyz


*/