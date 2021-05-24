
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class A_Team_Olympiad {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new int[n];
        
        int count[]=new int[3];
       
        Stack<Integer> one=new Stack<>();
       Stack<Integer> two=new Stack<>();
       Stack<Integer> three=new Stack<>(); 
       
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
            count[a[i]-1]++;
            
            switch (a[i]) {
                case 1:
                    one.push(i+1);
                    break;
                case 2:
                    two.push(i+1);
                    break;
                default:
                    three.push(i+1);
                    break;
            }
            
        }
        
        int min=Math.min( count[0],Math.min(count[1],count[2]) );
        
        out.println(min);
        out.flush();
        
        for(int i=0;i<min;i++){
            
out.print(one.pop()+" ");
out.flush();
            
out.print(two.pop()+" ");
out.flush();

out.print(three.pop()+" ");
out.flush();

out.println();
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
