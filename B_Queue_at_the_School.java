
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Queue_at_the_School {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,t;
     
    public static void main(String[] amit) throws IOException {
        
    n=in.nextInt();
    
    t=in.nextInt();
        
    char []ch=in.next().toCharArray();
    
    for(int time=0;time<t;time++){
        
        for(int i=0;i<n-1;i++){
            
            if(ch[i]=='B' && ch[i+1]=='G' ){
                
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
                
                i++;
                
            }
            
        }
        
    }
    
    out.println(ch);
    out.flush();
    
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader(new InputStreamReader(System.in));
            
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
    }    
    
}
/*

5 1
BGGBG


*/

/*

5 2
BGGBG


*/

/*

4 1
GGGB


*/