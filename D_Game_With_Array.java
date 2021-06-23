import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class D_Game_With_Array{

static Scanner in=new Scanner();

static PrintWriter out=new PrintWriter(System.out);

public static void main(String[] amit) throws IOException{

long n=in.nextLong();
long s=in.nextLong();

long value=s/n;

long rem=s%n;

if(value<=1){

out.println("NO");
out.flush();
return;

}

out.println("YES");
out.flush();

StringBuilder sb=new StringBuilder();

for(long i=1;i<=n-1;i++){

//out.print(value+" ");
//out.flush();

sb.append(value+" ");

}

out.print(sb);
out.flush();

out.println((rem+value) );
out.flush();

out.println(1);
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