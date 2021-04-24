
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Array_and_Peaks {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,k;
    
    static void solve(){
        
        if( k>=(n+1)/2 ){
            
            out.println(-1);
            out.flush();
            
            return;
            
        }
        
        if( k==0 ){
            
            int res[]=new int[n];
            
            for(int i=0;i<n;i++){
                
                res[i]=i+1;
                
            }
            
           for(int i: res){
               
               out.print(i+" ");
               out.flush();
               
           }
            
           out.println();
           out.flush();
           
            return;
            
        }
        
        int []res=new int[n];
        
        int j=1,u=n;
        
        boolean vis[]=new boolean[n+1];
        
        vis[0]=true;
        
    for(int i=0;i<k;i++){
        
        res[j]=u;
        
        res[j-1]=u-1;
        
        res[j+1]=u-2;
        
        vis[u]=true;
        vis[u-1]=true;
        vis[u-2]=true;
        
        u-=2;
        
        j+=2;
        
    }
      
 /*   for(int i=1;i<=n;i++){
        
        if( !vis[i] ){
            
            res[u--]=i;
            
            vis[i]=true;
        
    //        break;
            
        }
        
    }*/
    
   /* for(boolean i: vis){
        
        out.print(i+" ");
        out.flush();
        
    }
    
    out.println();
    
    out.flush();*/
    
   for( j=0;j<n;j++){
   
       if(res[j]==0){
       
    for(int i=1;i<=n;i++){
        
        if( !vis[i] ){
            
            res[j]=i;
           
            vis[i]=true;
            
            break;
           
        }
        
    }
    
       }
    
   }
    
        for(int i: res){
            
            out.print(i+" ");
            
            out.flush();
            
        }
        
        out.println();
        
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            k=in.nextInt();
            
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

5
1 0
5 2
6 6
2 1
6 1

*/

/*

1
6 1

*/

/*

1
5 2

*/