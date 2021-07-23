
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Penalty {

          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases;
       
    static String a;
    
   static boolean check2(long s1, long s2, long rem){
   
       return s1+rem<s2;

   }
static boolean check1(long s1, long s2, long rem){

    return s2+rem<s1;

}
    
    static long calc(long a[]){
        
        long c1=0,c2=0,ans=9;
        
        for(int i=1;i<10;i+=2){
            
            c1+=a[i-1];
            
            long rem=(10-i-1)/2;
            
            rem++;
            
             if(check1(c1,c2,rem) || check2(c1,c2,rem-1)){
            
                 ans=i-1;
            
            break;
        
             }
        c2+=a[i];
        rem--;
        if(check1(c1,c2,rem) || check2(c1,c2,rem)){
            ans=i;
            break;
        }
            
        }
        
        return ans+1;
        
    }
    
    static void solve(){
        
        char s[]=a.toCharArray();
        
        long arr[]=new long[10];
        
        for(int i=0;i<10;i++){
            
            switch (s[i]) {
                case '?':
                    if( (i&1)>=1 ){
                        
                        arr[i]=0;
                        
                    }else{
                        
                        arr[i]=1;
                        
                    }   break;
                case '1':
                    arr[i]=1;
                    break;
                default:
                    arr[i]=0;
                    break;
            }
            
        }
        
         long arr1[]=new long[10];
        
        for(int i=0;i<10;i++){
            
            switch (s[i]) {
                case '?':
                    if( (i&1)>=1 ){
                        
                        arr1[i]=1;
                        
                    }else{
                        
                        arr1[i]=0;
                        
                    }   break;
                case '1':
                    arr1[i]=1;
                    break;
                default:
                    arr1[i]=0;
                    break;
            }
            
        }
        
        out.println( Math.min( calc(arr),calc(arr1) ) );
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.next();
            
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

4
1?0???1001
1111111111
??????????
0100000000


*/