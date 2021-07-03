
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Plus_and_Multiply {

        static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases;
    
    static long n,a,b;
    
    static void solve(){
        
       
        if(n==1 || b==1 || n%b==1 ){
            
            out.println("YES");
            out.flush();
            
            return;
            
        }
        
        if(a==1){
            
            if(n%b==1){
                
                out.println("YES");
                out.flush();
                
            }else{
                
                out.println("NO");
                out.flush();
                
            }
            
          //  return;
            
        }else{
            
            int ans=0,i=0;
            
            long x=a;
            
            while( Math.pow(a,i)<=n ){
                
                long z=(long) (n-Math.pow(a,i));
                
                if(z%b==0){
                    
                    ans=1;
                    
                    break;
                    
                }
                
                i++;
                
            }
            
            if(ans==1){
                
                out.println("YES");
                out.flush();
                
            }else{
                
                out.println("NO");
                out.flush();
                
            }
            
        }
        
        /*while(n>0){
            
            if(n%a!=0){
                
                n-=b;
                
            }else{
                
                if(a!=1){
                
                n/=a;
                
                }else{
                    
                    n-=b;
                    
                }
                
            }
            
            if(n==1){
                
                out.println("YES");
                out.flush();
                
                
                return;
            }
            
        }
        
        out.println("NO");
        out.flush();*/
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            a=in.nextLong();
            b=in.nextLong();
            
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

5
24 3 5
10 3 6
2345 1 4
19260817 394 485
19260817 233 264


*/

/*

1
2345 1 4

*/

/*

1
19260817 233 264

*/

/*

60
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264
19260817 394 485
19260817 233 264


*/