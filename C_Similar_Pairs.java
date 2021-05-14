
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C_Similar_Pairs {

     static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,testCases;
    
    static int a[];
    
    static void solve(){
         
        int even=0,odd=0;
        
        for(int i: a){
            
            if(i%2==0){
                
                even++;
                
            }else{
                
                odd++;
                
            }
            
        }
        
       if(even%2!=odd%2){
           
           out.println("NO");
           out.flush();
           
       }else{
           
           if(even%2==0){
               
               out.println("YES");
               out.flush();
               
           }else{
               
               for(int i=0;i<n-1;i++){
                   
                   for(int j=i+1;j<n;j++){
                       
                       if(a[i]%2!=a[j]%2 && Math.abs(a[i]-a[j])==1 ){
                           
                           out.println("YES");
                           out.flush();
                           
                           return;
                           
                       }
                       
                   }
                   
               }
               
               out.println("NO");
               out.flush();
               
           }
           
       }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
        
        n=in.nextInt();
        
        a=new int[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextInt();
            
        }
      
        solve();
        
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

7
4
11 14 16 12
2
1 8
4
1 1 1 1
4
1 2 5 6
2
12 13
6
1 6 3 10 5 8
6
1 12 3 10 5 8


*/

/*

1
6
1 12 3 10 5 8

*/

/*

1
4
1 1 1 4

*/