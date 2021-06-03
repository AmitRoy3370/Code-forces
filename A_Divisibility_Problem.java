
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Divisibility_Problem {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,a,b;
    
    static void solve(){
        
       if(a%b==0){
           
           out.println(0);
           out.flush();
           
           return;
           
       }
        
       out.println(b-a%b);
       out.flush();
       
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.nextInt();
            b=in.nextInt();
            
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
 
String nextLine() throws IOException{
    
    return in.readLine();
    
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

    }
    
}
/*

5
10 4
13 9
100 13
123 456
92 46


*/