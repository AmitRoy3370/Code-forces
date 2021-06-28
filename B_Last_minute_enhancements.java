
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class B_Last_minute_enhancements {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int n,testCases;
    
    static int a[];
    
    static void solve(){
        
        Arrays.sort(a);
        
        Map<Integer,Boolean> map=new HashMap<>();
        
        map.put(a[0],Boolean.TRUE);
        
        for(int i=1;i<n;i++){
            
            if( map.containsKey(a[i]) ){
                
               a[i]++;
                
               map.put(a[i], Boolean.TRUE);
               
            }else if(!map.containsKey(a[i])){
                
                map.put(a[i],Boolean.TRUE);
                
            }
                
        }
        
        Set<Integer> set=new HashSet<>();
        
        for(int i: a){
            
            set.add(i);
            
        }
        
        out.println(set.size());
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            solve();
            
        }
        
    }
    
       static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
     }
    
}
/*

5
6
1 2 2 2 5 6
2
4 4
6
1 1 3 4 4 5
1
1
6
1 1 1 2 2 2


*/
