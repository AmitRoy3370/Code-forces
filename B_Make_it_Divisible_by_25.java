import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Make_it_Divisible_by_25 {

	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
    
    static char a[];
    
    static void solve(){
        
        long number=Long.parseLong(new String(a));
        
        if(number%25==0){
            
            out.println(0);
            out.flush();
            
            return;
            
        }
        
        long ans=Long.MAX_VALUE;
        
        for(int i=n-1;i>=0;i--){
            
            if( a[i]-'0'==5 ){
                
                for(int j=i-1;j>=0;j--){
                    
                    if( a[j]-'0'==2 || a[j]-'0'==7 ){
                        
                        ans=Math.min( ans,n-j-2 );
                        
                    }
                    
                }
                
            }else if(a[i]-'0'==0){
                
                for(int j=i-1;j>=0;j--){
                    
                    if( a[j]-'0'==0 || a[j]-'0'==5 ){
                        
                        ans=Math.min(ans,n-j-2 );
                        
                    }
                    
                }
                
            }
            
        }
        
        out.println(ans);
        out.flush();
        
    }
    
    public static void main(String[] sumit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.next().toCharArray();
        
            n=a.length;
            
            solve();
            
        }
        
        in.close();
        
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

5
100
71345
3259
50555
2050047


*/