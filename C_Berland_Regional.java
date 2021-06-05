
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class C_Berland_Regional {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static long u[],s[];
    
    static Map<Long,List<Long>> map;
    
    static void solve(){
        
        long ans[]=new long[n+1];
        
        map.values().forEach((list) -> {
            int size=list.size();
            
            Collections.sort(list, Collections.reverseOrder());
            
            for(int i=1;i<size;i++){
                
                list.set(i, list.get(i-1)+list.get(i));
                
            }
            
            for(int i=1;i<=size;i++){
                
                ans[i]+=list.get(size/i*i-1);
                
            }
         });
        
        for(int i=1;i<=n;i++){
            
            out.print(ans[i]+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            u=new long[n];
            s=new long[n];
            
            map=new HashMap<>();
            
            for(int i=0;i<n;i++){
                
            u[i]=in.nextLong();
                
            map.put(u[i], new ArrayList<>());
            
            }
            
            for(int i=0;i<n;i++){
                
                map.get(u[i]).add(in.nextLong());
                
            }
            
            solve();
            
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

4
7
1 2 1 2 1 2 1
6 8 3 1 5 1 5
10
1 1 1 2 2 2 2 3 3 3
3435 3014 2241 2233 2893 2102 2286 2175 1961 2567
6
3 3 3 3 3 3
5 9 6 7 9 7
1
1
3083


*/