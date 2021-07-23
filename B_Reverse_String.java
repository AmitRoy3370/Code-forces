
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Reverse_String {

             static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
static int testCases;
    
static String a1,b;

static void solve(int it){
    
    char s[]=a1.toCharArray();
    
    char t[]=b.toCharArray();
    
    int n=s.length,m=t.length;
    
    int a[][]=new int[1024][1024];
    
    int b[][]=new int[1024][1024];
    
     for (int i=0; i<n; i++) {
      for (int j=0; j<m && i+j<n; j++) {
        if (s[i+j]!=t[j]) break;
        a[i+j][j]=it;
      }
      for (int j=0; j<m && i+j<n; j++) {
        if (s[i+j]!=t[m-1-j]) break;
        b[i+j][m-1-j]=it;
      }
    }
    
    boolean ok=false;
    for (int i=0; i<n && !ok; i++)
        for (int j=0; j<m && !ok; j++) 
            if (a[i][j]==it && b[i][j]==it)
                ok=true;
     
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
        
    for(int t=0;t<testCases;t++){
        
        a1=in.next();
        
        b=in.next();
        
        solve(t+1);
        
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

6
abcdef
cdedcb
aaa
aaaaa
aab
baaa
ab
b
abcdef
abcdef
ba
baa


*/