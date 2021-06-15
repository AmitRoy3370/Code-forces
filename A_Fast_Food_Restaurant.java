
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Fast_Food_Restaurant {

      static Scanner in=new Scanner();
        
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,a,b,c;
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            
            int x[]={a,b,c};
            
            Arrays.sort(x);
            
            int ans=0;
            
            for(int i=0;i<3;i++){
                
                if(x[i]>0){
                    
                    ans++;
                    x[i]--;
                }
                
            }
            
            if(x[0]>0 && x[2]>0){
                
                ans++;
                
                x[0]--;
                x[2]--;
                
            }
            
            if(x[1]>0 && x[2]>0){
                
                ans++;
                
                x[1]--;
                x[2]--;
                
            }
            
            if(x[0]>0 && x[1]>0){
                
                ans++;
                
                x[0]--;
                x[1]--;
                
            }
            
            if(x[0]>0 && x[1]>0 && x[2]>0){
                
                ans++;
                
            }
            
            out.println(ans);
            out.flush();
            
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

7
1 2 1
0 0 0
9 1 7
2 2 3
2 3 2
3 2 2
4 4 4


*/