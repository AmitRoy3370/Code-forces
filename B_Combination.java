
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Combination {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        int s1=0,b1=1,s=0;
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            
           a[i]=in.nextInt();
            
            int b=in.nextInt();
            
            if(b!=0){
                
                b1+=b;
                
                s+=a[i];
                
                a[i]=0;
                
                b1--;
                
            }
            
        }
        
        Arrays.sort(a);
        
        while(n!=0 && b1!=0 ){
            
            s+=a[n-1];
            
            n--;
            b1--;
            
        }
        
        out.println(s);
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

2
1 0
2 0


*/