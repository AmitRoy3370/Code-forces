
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B_Find_Marble {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,s,t;
    
    static int a[];
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        s=in.nextInt();
        t=in.nextInt();

a=new int[n];
        
for(int i=0;i<n;i++){
    
    a[i]=in.nextInt();
    
}

        int moves=0;
        
       // boolean vis[]=new boolean[n+1];
        
       Set<Integer> set=new HashSet<>();
       
        while(!set.contains(s)){
             
         //   s=a[s];
            
         set.add(s);
         
            if( s==t ){
                
                break;
                
            }
            
           // set.add(s);
            
         //   vis[s]=true;
           
         s=a[s-1];
         
            moves++;
            
        }
        
        out.print(s==t?moves:-1);
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
/*

4 2 1
2 3 4 1


*/