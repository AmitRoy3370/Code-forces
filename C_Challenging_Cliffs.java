
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class C_Challenging_Cliffs {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        Arrays.sort(a);
        
        long diff_start = a[1]-a[0];
    long diff_end = a[n-1]-a[n-2];
    long diff = Math.min(diff_start, diff_end);
    long idx = -1;
    for(int i=1;i<n-1;i++){
        if(a[i+1]-a[i]<diff){
            diff = a[i+1]-a[i];
            idx = i;
        }
    }
        
    Vector<Long> ans=new Vector<>();
    
    if(idx == -1){
        if(diff_start<diff_end){
            ans.add(a[0]);
            for(int i=2;i<n;i++){
                ans.add(a[i]);
            }
            ans.add(a[1]);
        }
        else{
            ans.add(a[n-2]);
            for(int i=0;i<n;i++){
                if(i!=n-2){
                    ans.add(a[i]);
                }
            }
        }
    }
    else{
        ans.add(a[(int)idx]);
        for(int i=(int) (idx+2);i<n;i++){
            ans.add(a[i]);
        }
        for(int i=0;i<idx;i++){
            ans.add(a[i]);
        }
        ans.add(a[(int)idx+1]);
    }
    for(int i=0;i<n;i++){
        out.print(ans.get(i)+" ");
        out.flush();
    }
    out.println();
    out.flush();
    
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
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

2
4
4 2 1 2
2
3 1


*/