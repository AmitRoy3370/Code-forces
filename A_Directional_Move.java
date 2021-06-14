
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A_Directional_Move {

      static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    static String s;
    
    static Map<Integer,String> map=new HashMap<>();
    
    static void solve(){
        
        char ch[]=s.toCharArray();
        
        int initial=0;
        
        for(int i=0;i<n;i++){
            
            if(ch[i]=='0'){
                
                switch (initial) {
                    case 0:
                        initial=3;
                        break;
                    case 1:
                        initial=0;
                        break;
                    case 2:
                        initial=1;
                        break;
                    case 3:
                        initial=2;
                        break;
                    default:
                        break;
                }
               
            }else{
                
               switch (initial) {
                    case 0:
                        initial=1;
                        break;
                    case 1:
                        initial=2;
                        break;
                    case 2:
                        initial=3;
                        break;
                    case 3:
                        initial=0;
                        break;
                    default:
                        break;
                } 
                
            }
            
        }
        
        out.println(map.get(initial));
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        map.put(0,"E");
        map.put(1,"N");
        map.put(2,"W");
        map.put(3,"S");
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            s=in.next();
            
            solve();
            
        }
        
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

3
4
1010
5
00000
3
111


*/