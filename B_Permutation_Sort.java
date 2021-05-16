
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Permutation_Sort {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,testCases;
    
    static int a[];
    
    static void solve(){
    
    if(a[0]==1 || a[n-1]==n)
    {
    
    out.println(1);
    out.flush();
    
    }else if(a[0]==n && a[n-1]==1)   
    {
    
    out.println(3);
    out.flush();
        
    }else
    {
    
    out.println(2);
    out.flush();    
    
    }    
        
    }
    
    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextInt();
        
    for(int t=0;t<testCases;t++){
        
        n=in.nextInt();
        
        a=new int[n];
        
        int sorted=0;
        
        for(int i=0;i<n;i++){
        
            a[i]=in.nextInt();
        
            if(a[i]==i+1){
            
                sorted++;
                
            }
            
        }
        
        if(sorted==n){
        
            out.println(0);
            out.flush();
            
            continue;
            
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

3
4
1 3 2 4
3
1 2 3
5
2 1 4 5 3


*/

/*

1
3
2 3 1

*/