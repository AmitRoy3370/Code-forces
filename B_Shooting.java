
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Shooting {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static elements a[];
    
    static class elements implements Comparable<elements> {
        
        int element,index;

        public elements(int element, int index) {
            this.element = element;
            this.index = index;
        }

        @Override
        public int compareTo(elements t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
       if(this.element>t.element){
           
           return 1;
           
       }else if(this.element<t.element){
           
           return -1;
           
       }
        
       return 0;
       
        }
                
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new elements[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=new elements(in.nextInt(),i+1);
            
        }
        
        Arrays.sort(a);
        
        int sum=n;
        
        for(int i=n-1;i>=0;i--){
            
           // out.println(a[i].element+" "+a[i].index);
            //out.flush();
            
            sum+=a[i].element*(n-i-1);
            
        }
        
        out.println(sum);
        out.flush();
        
        for(int i=n-1;i>=0;i--){
            
            out.print(a[i].index+" ");
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
                
                st=new StringTokenizer( in.readLine() );
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
    }
    
}
/*

3
20 10 20

*/

/*

4
10 10 10 10


*/

/*

6
5 4 5 4 4 5


*/
