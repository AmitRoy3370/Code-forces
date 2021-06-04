
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Array_Reodering {

       static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static long a[];
    
     public static long hcf(long n1, long n2)
    {
        if (n2== 0)
            return n1;
        else
            return hcf(n2,n1%n2);
    }
    
    static void solve(){
        
        long count=0;
        
        List<Long> even=new ArrayList<>();
        
        List<Long> odd=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            
            if(a[i]%2==0){
                
                even.add(a[i]);
                
            }else{
                
                odd.add(a[i]);
                
            }
            
        }
        
        int index=0;
        
        for(long i: even){
            
            a[index++]=i;
            
        }
        
        for(long i: odd){
            
            a[index++]=i;
            
        }
        
        for(int i=0;i<n-1;i++){
            
            for(int j=i+1;j<n;j++){
                
                if( hcf(a[i],2*a[j])>1 ){
                    
                    count++;
                    
                }
                
            }
            
        }
        
       
        out.println(count);
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
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDoublle() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
    }
    
}
/*

3
4
3 6 5 3
2
1 7
5
1 4 2 4 1


*/

/*

1
5
1 4 2 4 1

*/