
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Game_of_Life {

static Scanner in=new Scanner();
    
static PrintWriter out=new PrintWriter(System.out);

static int testCases,n,m;

static char ch[];

static void solve(){
    
   int left=0;
    
   m=Math.min(n,m);
   
   for(int t=0;t<m;t++){
       
       left=0;
       
       for(int i=0;i<n;i++){
           
           if(ch[i]=='1'){
               
               left=1;
               
               continue;
               
           }
           
           int right=i==n-1 || ch[i+1]=='0'?0:1;
           
           if(left!=right){
               
               ch[i]='1';
               
               left=0;
               
           }
           
       }
       
   }
    
   out.println(ch);
   out.flush();
     
}

    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            m=in.nextInt();
            
            ch=in.next().toCharArray();
            
            solve();
            
        }
        
    }
    
    static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while(st==null || !st.hasMoreElements()){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt(next());
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong(next());
            
        }
        
        double nextDoublle() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
    }
    
}
/*

4
11 3
01000000001
10 2
0110100101
5 2
10101
3 100
000


*/