
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_T_primes {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static boolean primes[]=new boolean[1000001];
    
    static int maxN=1000001;
    
    static void prime(){
        
        primes[0]=true;
        primes[1]=true;
        
        for(int i=2;i*i<=maxN-1;i++){
            
            if(!primes[i]){
            
            for(int j=i*2;j<=maxN-1;j+=i){
                
                primes[j]=true;
                
            }
            
            }
            
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        
        prime();
        
        int n=in.nextInt();
        
        long a[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        for(int i=0;i<n;i++){
            
            int m=(int) Math.sqrt(a[i]);
            
            if((long)m*(long)m==(long)a[i] && !primes[m]){
                
                out.println("YES");
                out.flush();
                
            }else{
                
                out.println("NO");
                out.flush();
                
            }
            
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

3
4 5 6


*/