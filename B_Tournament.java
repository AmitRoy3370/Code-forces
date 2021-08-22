
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Tournament {

          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        int match=( n*(n-1) )/2;
        
        int won[]=new int[n+1];
        
        int played[]=new int[n+1];
        
        for(int i=1;i<match;i++){
            
            int win=in.nextInt();
            
            int lost=in.nextInt();
            
            played[win]++;
            
            played[lost]++;
            
            won[win]++;
            
        }
        
        int u=0,v=0;
        
        for(int i=1;i<=n;i++){
            
            if( played[i]==n-2 ){
                
                if(u==0){
                
                u=i;
                
                }else{
                    
                    v=i;
                    
                }
                
            }
            
        }
        
        if( won[u]>=won[v] ){
            
            out.println(u+" "+v);
            out.flush();
            
        }else{
            
            out.println(v+" "+u);
            out.flush();
            
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
4 2 
4 1 
2 3 
2 1 
3 1


*/