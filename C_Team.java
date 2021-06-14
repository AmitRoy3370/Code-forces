
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C_Team {

      static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,k;
    
    static long a[];
    
    static void solve(){
        
        Arrays.sort(a);
        
        int l=0,r=n-1,team=0;
        
        while(r>=l){
            
            if(a[r]>=k){
                
                r--;
                
                team++;
                
            }else if(a[l]+a[r]>=k && l!=r ){
                
                r--;
                l++;
                team++;
                
            }else{
                
                l++;
                
            }
            
        }
        
        out.println(team);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            k=in.nextInt();
            
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
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
    }    
    
}
/*

3
5 8
9 3 4 4 5
5 8
5 2 3 5 1
3 6
7 6 8


*/