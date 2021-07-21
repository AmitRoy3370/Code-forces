
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Crossword_solving {

                    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n,m;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        m=in.nextInt();
        
        char s[]=in.next().trim().toCharArray();
        
        char t[]=in.next().trim().toCharArray();
        
        int len=Integer.MAX_VALUE;
        
       // StringBuilder sb=new StringBuilder();
        
        //String ans = null;
        
        List<Integer> sb=new ArrayList<>();
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<=(m-n);i++){
            
            int y=0,count=0;
            
            for(int j=i;j<i+n;j++){
                
                if( s[y++]!=t[j] ){
                    
                    sb.add(y);
                    
                    count++;
                    
                }
                
            }
            
            if( sb.size()<len ){
                
                ans=sb;
                
              //  String h[]=ans.split(" ");
                
                len=sb.size();
                
            }
          
            sb=new ArrayList<>();
            
        }
        
        out.println(len);
        out.flush();
        
        //char h[]=ans.toCharArray();
        
       for(int i: ans){
           
           out.print(i+" ");
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

3 5
abc
xaybz


*/

/*

4 10
abcd
ebceabazcd


*/

/*

3 5
vvv
bqavv

*/

/*

26 26
abcdefghijklmnopqrstuvwxyz
ffffffffffffffffffffffffff

*/