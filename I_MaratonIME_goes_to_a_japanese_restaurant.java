
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class I_MaratonIME_goes_to_a_japanese_restaurant {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    public static void main(String[] amit) throws IOException {
        
        int n=in.nextInt();
        
        long time=in.nextLong();
        
        long time1=time;
        
        long a[]=new long[n];
        
        long b[]=new long[n];
       
        long sum=0;
        
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            
            a[i]=in.nextLong();
            
            b[j]=a[i];
            
            sum+=a[i];
            
        }
        
        if(sum<time){
            
            out.println("Empate");
            out.flush();
            
            return;
            
        }
        
        int i=0,ans=0;
        
        while( i<n && time>0 ){
            
            time-=a[i++];
            
            ans++;
            
        }
        
        i=0;
        
        int ans1=0;
        
         while( i<n && time1>0 ){
            
            time1-=b[i++];
            
            ans1++;
            
        }
        
        if(ans>ans1){
            
            out.println("Yan");
            out.flush();
            
        }else if(ans1>ans) {
            
            out.println("Nathan");
            out.flush();
            
        }else{
            
            out.println("Empate");
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

10 45
1 2 3 4 5 6 7 8 9 10


*/

/*

10 45
10 2 3 4 5 6 7 8 9 1


*/