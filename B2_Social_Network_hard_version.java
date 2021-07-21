
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;

public class B2_Social_Network_hard_version {

    
                    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,k;
    
    static long a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        Set<Long> set=new HashSet<>();
        
        LinkedList<Long> list=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            
            if( !set.contains(a[i]) ){
                
                set.add(a[i]);
                
           if(list.size()==k){
               
               long b=list.removeLast();
               
               set.remove(b);
               
           }     
           
                list.addFirst(a[i]);
                
            }
            
        }
        
        out.println(list.size());
        out.flush();
        
        list.stream().map((i) -> {
            out.print(i+" ");
                            return i;
                        }).forEachOrdered((_item) -> {
                            out.flush();
                        });
        
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

7 2
1 2 3 2 1 3 2


*/

/*

10 4
2 3 3 1 1 2 1 2 3 3


*/