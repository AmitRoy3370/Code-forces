
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class A_Eshag_Loves_Big_Arrays {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static int a[];
    
    static Map<Integer,Integer> map=new HashMap<>();
    
    static void solve(){
        
        Set<Integer> set=new HashSet<>();
        
        int min=a[0];
        
        for(int i: a){
            
            map.put(i, map.get(i)+1);
            
            min=Math.min(i,min);
            
            set.add(i);
            
        }
    
       List<Integer> list=new ArrayList<>(); 
           
       for(int i: map.keySet()){
           
           if(i==min){
               
               list.add(map.get(i));
               
           }
           
       }
        
       int k=Collections.max(list);
       
       out.println(n-k);
       out.flush();
       
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            map=new HashMap<>();
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
                map.put(a[i],0);
                
            }
            
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
    
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
    }
    
}
/*

3
6
1 1 1 2 2 3
6
9 9 9 9 9 9
6
6 4 1 1 4 1


*/

/*

1
5
1 4 3 2 4

*/
