
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A_SwapSort {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static long a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        boolean vis[]=new boolean[n];
    
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n-1;i++){
        
            int minX=-1,minY=-1;
            
            long y=Long.MAX_VALUE;
            
            for(int j=i+1;j<n;j++){
                
                if( a[i]>=a[j] && a[j]<y ){
                    
                    minX=i;
                    
                    minY=j;
                    
                    y=a[j];
                    
                //    out.println("minX: "+a[minX]+" minY: "+a[minY]+" y: "+y);
                  //  out.flush();
                            
                }
                
            }
            
            if(minX!=-1 && minY!=-1){
        
                vis[minX]=true;
                vis[minY]=true;
                
                long temp=a[minX];
                a[minX]=a[minY];
                a[minY]=temp;
                
            map.put(minX, minY);
            
            /*out.print(i+" the array now: ");
        out.flush();
        
        for(long j: a){
            
            out.print(j+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
            
            }
            
        }
        
        /*out.print("the array now: ");
        out.flush();
        
        for(long i: a){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        out.println(map.size());
        out.flush();
        
        map.keySet().stream().map((i) -> {
            out.println( i+" "+map.get(i) );
            return i;
        }).forEachOrdered((_item) -> {
            out.flush();
        });
        
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

5
5 2 5 1 4


*/

/*

6
10 20 20 40 60 60


*/

/*

2
101 100


*/

/*

8
5 2 6 8 3 1 6 8

*/