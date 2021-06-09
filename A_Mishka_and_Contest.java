
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Mishka_and_Contest {

    static Scanner in=new Scanner();
	
	static PrintWriter out=new PrintWriter(System.out);
    
        static int n,k;
        
        static int a[];
        
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        k=in.nextInt();
        
        a=new int[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
        }
        
        if(n==1){
            
            if(a[0]<=k){
                
                out.println(1);
                out.flush();
                
            }else{
                
                out.println(0);
                out.flush();
                
            }
            
            return;
            
        }
        
        int i=0,j=n-1;
        
        if(a[0]>k && a[n-1]>k ){
            
            out.println(0);
            out.flush();
            
            return;
            
        }
        
        int ans=0;
        
        while(i<j ){
            
            if(a[i]>k && a[j]>k){
                
                break;
                
            }
            
            if(a[i]<=k){
                
                ans++;
                
                i++;
                
                //out.println(i+" : i");
                //out.flush();
                
            }
            
            if(i==j){
                
             //   break;
                
            }
            
            if(a[j]<=k){
                
                ans++;
                
                j--;
               
               // out.println(j+" : j");
                //out.flush();
                
            }
            
            if(i==j){
           
                if(a[i]<=k){
                    
                    ans++;
                    
                }
                
                break;
                
            }
            
        }
        
        out.println(ans);
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

8 4
4 2 3 1 5 1 6 4


*/

/*

5 100
12 34 55 43 21

*/

/*

6 6
1 2 3 4 5 6

*/