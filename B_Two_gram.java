import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B_Two_gram {

      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int n;
    
  static Map<String,Integer> map=new HashMap<>();
  
  static char a[];
  
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=in.next().toCharArray();
        
        in.close();
        
        for(int i=0;i<n-1;i++){
            
            if( map.containsKey( String.valueOf(a[i])+String.valueOf(a[i+1]) ) ){
            
            map.put( String.valueOf(a[i])+String.valueOf(a[i+1]),map.get( String.valueOf(a[i])+String.valueOf(a[i+1]) )+1 );
            
            }else{
                
                 map.put( String.valueOf(a[i])+String.valueOf(a[i+1]),1 );
                
            }
            
        }
        
        if( n%2==1 ){
            
              if( map.containsKey( String.valueOf(a[n-2])+String.valueOf(a[n-1]) ) ){
            
            map.put( String.valueOf(a[n-2])+String.valueOf(a[n-1]),map.get( String.valueOf(a[n-2])+String.valueOf(a[n-1]) )+1 );
            
            }else{
                
                 map.put( String.valueOf(a[n-2])+String.valueOf(a[n-1]),1 );
                
            }
            
        }
        
        int ans=0;
        
        String ansString=null;
        
        for(String i: map.keySet()){
            
          //  out.println(i+" "+map.get(i) );
            //out.flush();
            
            if( map.get(i)>ans ){
                
                ansString=i;
                
                ans=map.get(i);
                
            }
            
        }
        
        out.println(ansString);
        out.flush();
        
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

7
ABACABA


*/

/*

5
ZZZAA


*/

/*

11
GGRRAATTZZZ

*/