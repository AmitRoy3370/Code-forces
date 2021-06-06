
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D_Epic_Transformation {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        Arrays.sort(a);
        
        int cnt=1,max=0;
        
        for(int i=0;i<n-1;i++){
            
            if(a[i]==a[i+1]){
                
                cnt++;
                
            }else{
                
                max=Math.max(cnt, max);
                
                cnt=1;
            }
            
        }
        
        int res;
        
        cnt=Math.max(max, cnt);
        
        if(n%2==0){
            
            if(n/2>=cnt){
                
                res=0;
                
            }else{
                
                res=2*cnt-n;
                
            }
            
        }else{
            
            if( (n-1)/2>=(cnt-1) ){
                
                res=1;
                
            }else{
                
                res=2*(cnt-1)-(n-1)+1;
                
            }
            
        }
        
        out.println(res);
        out.flush();
        
    }
    
    public static void main(String[] args) throws IOException {
        
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

5
6
1 6 1 1 4 4
2
1 2
2
1 1
5
4 5 4 5 4
6
2 3 2 1 3 1


*/