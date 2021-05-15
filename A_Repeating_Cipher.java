import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Repeating_Cipher{

static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);

static int n;

public static void main(String[] amit) throws IOException {

n=in.nextInt();

char []ch=in.next().toCharArray();

int y=1;

StringBuilder sb=new StringBuilder();

for(int i=0;i<n;i+=y){

try{

sb.append(ch[i]);

}catch(Exception e){
	
	break;
	
}

y++;

}

out.println(sb.toString() );
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