
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Equalize_Prices_Again {
    
        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,testCases;
    
    static int a[];
    
    static void solve(){
        
        long sum=0;
        
        for(int i: a){
            
            sum+=i;
            
        }
        
        if(sum%n==0){
            
            out.println(sum/n);
            out.flush();
            
        }else{
         
            while( sum%n!=0 ){
                
                sum++;
                
            }
          
            out.println(sum/n);
            out.flush();
            
        }
        
       // out.println("sum: "+sum);
        //out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new int[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
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
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
    
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
    }
    
}
/*

3
5
1 2 3 4 5
3
1 2 2
4
1 1 1 1


*/

/*

1
12
2 3 3 3 4 1 2 2 3 1 1 7

*/

/*

1
89
3 1 1 4 1 2 3 2 1 1 2 7 2 1 3 1 5 1 1 1 3 1 1 3 5 1 2 4 2 3 1 1 1 5 4 1 1 1 1 1 5 2 1 5 2 1 4 1 1 1 1 2 1 1 2 3 2 4 1 1 1 1 2 3 1 3 1 8 4 4 1 2 6 1 7 1 1 1 3 3 2 2 1 5 3 2 1 2 1

*/