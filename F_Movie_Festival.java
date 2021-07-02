
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class F_Movie_Festival {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;

    static class Pair implements Comparable<Pair>  {
        
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair t) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

return this.y-t.y;

        }

    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        Pair pair[]=new Pair[n];
        
        for(int i=0;i<n;i++){
            
            pair[i]=new Pair(in.nextInt(),in.nextInt());
            
        }
        
        Arrays.sort(pair);
        
        int curr=0,ans=0;
        
        for(Pair i: pair){
            
            if(i.x>=curr){
                
                curr=i.y;
                
                ans++;
                
            }
            
        }
        
        out.println(ans);
        out.flush();
        
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

3
3 5
4 9
5 8


*/