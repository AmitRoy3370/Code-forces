
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Presents {

    static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static elements a[];
    
    static class elements implements Comparable<elements> {
        
        int ai,i;

        public elements(int ai, int i) {
            this.ai = ai;
            this.i = i;
        }

        @Override
        public int compareTo(elements t) {
       //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       return this.ai-t.ai;
       
        }
        
        public String toString(){
            
            return String.valueOf(i);
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new elements[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=new elements( in.nextInt(),i+1 );
            
        }
        
        Arrays.sort(a);
        
        for(elements i: a){
            
            out.print(i.toString()+" ");
            
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer( in.readLine() );
                
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
        
    }
    
}
