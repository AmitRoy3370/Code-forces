
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class K_Keyboardd {

     
            static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

static char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
static Map<Character,Integer> A=new HashMap<>();

static Map<Character,Integer> B=new HashMap<>();

static Map<Character,Integer> ans=new HashMap<>();

    public static void main(String[] amit) throws IOException {
        
        for(int i=0;i<26;i++){
            
            A.put(ch[i],0);
            B.put(ch[i],0);
            
        }
        
        char a[]=in.nextLine().toCharArray();
        char b[]=in.nextLine().toCharArray();
        
        for(char i: a){
            
            if(i!=' '){
            
            A.put(i, A.get(i)+1);
            
            }
            
        }
        
        for(char i:b){
            
            if(i!=' '){
            
            B.put(i, B.get(i)+1);
            
            }
            
        }
        
      //  out.println("A: "+A.toString());
        //out.flush();
        
        //out.println("B: "+B.toString());
        //out.flush();
                
        for(char i: A.keySet()){
            
            if( B.get(i)>A.get(i) ){
                
                ans.put(i, B.get(i));
                
            }
            
        }
        
        for(char i: ans.keySet()){
            
            out.print(i);
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
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
    
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
    }
    
}
/*

this is very annoying
thiss iss veery annoying


*/

/*

so sticky
ssoo ssttiicckkyy


*/