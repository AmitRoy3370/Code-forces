
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Cut_Ribbon {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,a,b,c;
    
    static int ans[];
    
    static int solve(int n,int a,int b,int c){
        
        if(n==0){
            
            return 0;
            
        }
        
        if(n<0){
            
            return Integer.MIN_VALUE;
            
        }
        
        if(ans[n]!=-1){
            
            return ans[n];
            
        }
         
        int count1=1+solve(n-a,a,b,c);
        int count2=1+solve(n-b,a,b,c);
        int count3=1+solve(n-c,a,b,c);
        
        ans[n]=Math.max( count1,Math.max(count2,count3) );
        
        return ans[n];
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        
        ans=new int[n+1];
        
        Arrays.fill(ans, -1);
        
        out.println(solve(n,a,b,c));
        
        out.flush();
        
       // out.println(Arrays.toString(ans));
        //out.flush();
        
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

5 5 3 2

*/

//7 5 5 2
