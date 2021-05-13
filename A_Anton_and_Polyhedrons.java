
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Anton_and_Polyhedrons {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,ans=0;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        for(int i=0;i<n;i++){
            
            String s=in.next();
            
            if(s.equalsIgnoreCase("Cube")){
                
                ans+=6;
                
            }else if(s.equalsIgnoreCase("Tetrahedron")){
                
                ans+=4;
                
            }else if(s.equalsIgnoreCase("Octahedron")){
                
                ans+=8;
                
            }else if(s.equalsIgnoreCase("Dodecahedron")){
                
                ans+=12;
                
            }else if(s.equalsIgnoreCase("Icosahedron")){
                
                ans+=20;
                
            }
            
        }
        
        out.println(ans);
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
