
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Sereja_and_Array {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
	
	static int m,n;
	
	static long a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        m=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        long cost=0;
        
        for(int t=0;t<m;t++){
            
            int type=in.nextInt();
            
            switch (type) {
                case 1:
                    
                    int x=in.nextInt();
                    
                    long y=in.nextLong();
                    
                    a[x-1]=y-cost;
                    
                    break;
                case 2:
                    
                    long x1=in.nextLong();
                    
                    cost+=x1;
                    
                    break;
                case 3:
                    
                    int i=in.nextInt();
                    
                    out.println( a[i-1]+cost );
                    out.flush();
                    
                    break;
                default:
                    break;
            }
            
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

10 11
1 2 3 4 5 6 7 8 9 10
3 2
3 9
2 10
3 1
3 10
1 1 10
2 10
2 10
3 1
3 10
3 9


*/