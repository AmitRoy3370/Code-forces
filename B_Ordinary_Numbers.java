
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Ordinary_Numbers {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long testCases,n;
    
    static String s;
    
    static void solve(){
        
        if( n>=1 && n<=9 ){
            
            out.println(n);
            out.flush();
            
        //    return;
            
        }else if(n==10){
            
            out.println(9);
            out.flush();
            
        }else if(n<=100){
            
           if(n==100){
               
                out.println( (long)( 9+n/11 )-0 );
            out.flush();
               
           }else{
               
                out.println( (long)( 9+n/Math.pow(11,1) ) );
            out.flush();
               
           }
            
        }else if(n<=Math.pow(10, 3)){//3
            
            out.println( (long)( 18+n/(111) ) );
            out.flush();
            
        }else if(n<=Math.pow(10,4)){//4
            
              out.println( (long)( 27+n/(1111) ) );
            out.flush();
            
        }else if(n<=Math.pow(10,5)){//5
            
            if( n==Math.pow(10,5) ){
                
                out.println( (long)( 36+n/(11111) )-0 );
            out.flush();
                
            }else{
            
            out.println( (long)( 36+n/(11111) ) );
            out.flush();
            
            }
            
        }else if(n<=Math.pow(10,6)){//6
            
            if(n==Math.pow(10,6)){
                
                out.println( (long)( 45+n/(111111) )-0 );
            out.flush();
                
            }else{
            
            out.println( (long)( 45+n/(111111) ) );
            out.flush();
            
            }
            
        }else if(n<=Math.pow(10,7)){//7
            
            if(n==Math.pow(10,7)){
                
                 out.println( (long)( 54+n/(1111111) )-0 );
            out.flush();
                
            }else{
            
            out.println( (long)( 54+n/(1111111) ) );
            out.flush();
            
            }
            
        }else if(n<=Math.pow(10,8)){//8
            
            if(n==Math.pow(10,8)){
                
                 out.println( (long)( 63+n/(11111111) )-0 );
            out.flush();
                
            }else{
            
             out.println( (long)( 63+n/(11111111) ) );
            out.flush();
            
            }
            
        }else if(n<=Math.pow(10,9)){//9
            
            if(n==Math.pow(10,9)){
                
                out.println( (long)( 72+n/(111111111) )-0 );
            out.flush();
                
            }else{
            
             out.println( (long)( 72+n/(111111111) ) );
            out.flush();
            
            }
            
        }else{
            
             out.println( (long)( 81+n/(1111111111) ) );
            out.flush();
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextLong();
        
        for(long t=0;t<testCases;t++){
            
            n=in.nextLong();
            
           // s=in.next();
        
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

6
1
2
3
4
5
100


*/

/*


1
999999

*/