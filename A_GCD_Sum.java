
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_GCD_Sum {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static long testCases,n;
    
    private static long gcd(long reduceNum, long b)
    {
        return b == 0 ?
            reduceNum : gcd(b, reduceNum % b);
    }
 
    
    private static long reduceB(long a, String b)
    {
        long result = 0;
        for (int i = 0; i < b.length(); i++)
        {
try{
            result = (result * 10 +
                      b.charAt(i) - '0') % a;

}catch(Exception e){
    
    return Long.parseLong(b);
    
}
            
        }
        return result;
    }
 
    private static long gcdLarge(long a, String b)
    {
        
        long num = reduceB(a, b);
         
       
        return gcd(num, a);
    }
 
    
    static void solve(){
        
        while(true){
        
        String s=String.valueOf(n);
        
        long sum=0;
        
       int l=0,r=s.length()-1;
        
       while( r>l ){
           
           sum+=Long.parseLong( String.valueOf(s.charAt(r)) );
           sum+=Long.parseLong( String.valueOf(s.charAt(l)) );
           
           r--;
           l++;
           
           try{
           
           if( l==r ){
               
               sum+=Long.parseLong( String.valueOf(s.charAt(r)) );
               
           }
           
           }catch(NumberFormatException e){
               
               
           }
           
       }
       
       if( gcdLarge(sum,s)>1 ){
           
           out.println(n);
           
           out.flush();
           
           break;
           
       }else{
           
           n++;
           
       }
       
    //    out.println( gcdLarge( sum,s ) );
        
      //  out.flush();
        
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextLong();
        
        for(long t=0;t<testCases;t++){
            
            n=in.nextLong();
           
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
    
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
    }
    
}
/*

3
11
31
75

*/