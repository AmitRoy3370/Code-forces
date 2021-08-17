
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B2_Books_Exchange_hard_version {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static int testCases,n,source1=1,count=0;
    
    static int a[];
    
    static int cnt[];
    
    static List<Integer> list[];
    
    static boolean visited[];
    
    static int DFS(List<Integer> list[],boolean visit[],int source){
        
        visit[source]=true;
           
        //cnt[source]=count;
        
        count++;
        
        for( int i: list[source] ){
            
            if( !visit[i] ){
                
                DFS( list,visit,i );
                
            }
            
        }
        
        cnt[source]=count;
        
        return count;
        
    }
    
    static void solve(){
        
       list=new ArrayList[n+1];
                
       for(int i=0;i<=n;i++){
           
           list[i]=new ArrayList<>();
           
       }
       
       for(int i=1;i<=n;i++){
           
           list[a[i]].add(i);
           
           list[i].add(a[i]);
           
       }
       
     /*  for(int i=1;i<=n;i++ ){
           
           for(int j: list[i]){
               
               out.print(j+" ");
               out.flush();
               
           }
        
           out.println();
           out.flush();
           
       }*/
       
     cnt=new int[n+1];
     
     for(int i=0;i<=n;i++){
         
         cnt[i]=-1;
         
     }
     
      visited=new boolean[n+1];

      count=0;
      
       for(int i=1;i<=n;i++){
           
           source1=i;
           
           //visit=new boolean[n+1];
       
           count=0;
           
           if(cnt[i]==-1){
           
          DFS( list,visited,i );
           
           }
           
       }
       
       for(int i=1;i<=n;i++){
           
           out.print(cnt[i]+" ");
           out.flush();
           
       }
       
       out.println();
       out.flush();
       
        }
        
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n+1];
            
            for(int i=1;i<=n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            solve();
            
            out.println();
            out.flush();
            
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
5
1 2 3 4 5
3
2 3 1
6
4 6 2 1 5 3
1
1
4
3 4 1 2
5
5 1 2 4 3


*/

/*

1
5
5 1 2 4 3

*/