
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B_Yet_Another_Broken_Keyboard {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static int testCases,n,m;
    
    static char a[];
    
    public static void main(String[] amit) throws IOException {
        
    n=in.nextInt();
        
    m=in.nextInt();
    
    a=in.next().toCharArray();
    
   Map<Character,Boolean> map=new HashMap<>(); 
   
    for(int i=0;i<m;i++){
        
        map.put(in.nextChar(), Boolean.TRUE);
        
    }
    
    long ans=0;
    
    for(int i=0;i<n;i++){
        
        long count=0;
        
        while(i<n && true){
            
            if( !map.containsKey(a[i]) ){
                
                break;
                
            }
            
            count++;
            
            i++;
            
        }
        
        ans+=(count*(count+1) )/2;
        
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

7 2
abacaba
a b


*/

/*

10 3
sadfaasdda
f a d


*/

/*

7 1
aaaaaaa
b


*/