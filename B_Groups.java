import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Groups {

	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n;
    
    static long a[][];
    
    static void solve(){
        
            for(int i=0;i<5;i++){
      
                for(int j=i+1;j<5;j++){
         
                    int c1=0,c2=0,c3=0;
            
                    for(int k=0;k<n;k++){
                
                        if(a[k][i]==1)
                    
                            c1++;
                
                        if(a[k][j]==1)
                    
                            c2++;
                
                        if(a[k][j]==1 && a[k][i]==1)
                    
                            c3++;
            
                    }
            
                    c1-=c3;
            
                    c2-=c3;
            
                    if(c1<=n/2 && c2<=n/2 && c1+c2+c3==n){
                    
                        out.println("YES");
                
                        out.flush();
                
                
                        return;
            }
        
                }
    
            }
    
            out.println("NO");
            out.flush();
        
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n][5];
            
            for(int i=0;i<n;i++){
                
                for(int j=0;j<5;j++){
                    
                    a[i][j]=in.nextLong();
                    
                }
                
            }
            
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

2
4
1 0 0 1 0
0 1 0 0 1
0 0 0 1 0
0 1 0 1 0
2
0 0 0 1 0
0 0 0 1 0


*/