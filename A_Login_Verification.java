import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Login_Verification {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    public static void main(String[] amit) throws IOException {
        
        String mainPassword=in.next().toLowerCase().replace("o", "0").replace("l","1").replace("i","1");
        
        int testCases=in.nextInt();
        
        String a[]=new String[testCases];
        
        for(int i=0;i<testCases;i++){
            
            a[i]=in.next().toLowerCase().replace("o", "0").replace("l","1").replace("i","1");
            
        }
        
        for(int i=0;i<testCases;i++){
            
            if( a[i].equals(mainPassword) ){
                
                System.out.println("NO");
                
                return;
                
            }
            
        }
        
        System.out.println("YES");
        
    }
              
    static long gcd(long a, long b)   
{   
  
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
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
