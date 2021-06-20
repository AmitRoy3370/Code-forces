
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class C_Stable_Groups {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    static long k,s;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        k=in.nextLong();
        s=in.nextLong();
        
        long a[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        Arrays.sort(a);
        
        Vector<Long> V=new Vector<>();
        
        for(int i=1;i<n;i++){
            
            if(a[i]-a[i-1]>s){
                
                V.add( (a[i]-a[i-1]-1)/s );
                
            }
            
        }
        
        long v[]=new long[V.size()];
        
        int index=0;
        
        for(long i: V){
            
            v[index++]=i;
            
        }
        
        Arrays.sort(v);
        
       int m=v.length; 
       
        for(int i=0;i<m/2;i++){
            
            long temp=v[i];
            v[i]=v[m-i-1];
            v[m-i-1]=temp;
            
        }
       
        while(m>=1){
            
            if(v[m-1]<=k){
                
                k-=v[m-1];
                
                m--;
                
            }else{
                
                break;
                
            }
            
        }
        
        out.println( (m+1) );
        out.flush();
        
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

8 2 3
1 1 5 8 12 13 20 22


*/

/*

13 0 37
20 20 80 70 70 70 420 5 1 5 1 60 90


*/