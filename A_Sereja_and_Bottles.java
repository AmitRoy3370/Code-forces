
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Sereja_and_Bottles {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
	
	static int testCases,n;
	
	static long a[];
    
        static long b[];
        
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new long[n];
        
        b=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            b[i]=in.nextLong();
            
        }
        
        int ans=n;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                
                if(i!=j && a[i]==b[j]){
                    
                  ans--;  
                    
                  break;
                  
                }
                
            }
            
        }
        
        out.println(ans);
        out.flush();
        
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

4
1 1
2 2
3 3
4 4


*/

/*

4
1 2
2 3
3 4
4 1


*/