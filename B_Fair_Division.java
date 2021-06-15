
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Fair_Division {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n;
    
    static int a[];
    
    static void solve(){
        
        int sum=0;
        
        for(int i: a){
            
            sum+=i;
            
        }
        
        if(sum%2==1){
            
            out.println("NO");
            out.flush();
                   
            return;
            
        }
        
        int count1=0,count2=0;
        
        for(int i: a){
            
            if(i==1){
                
                count1++;
                
            }else{
                
                count2++;
                
            }
            
        }
        
        sum/=2;
        
       if(sum%2==0 || (sum%2==1 && count1!=0)){
           
           out.println("YES");
           out.flush();
           
       }else{
           
           out.println("NO");
           out.flush();
           
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

5
2
1 1
2
1 2
4
1 2 1 2
3
2 2 2
3
2 1 2


*/

/*

1
3
2 2 2

*/

/*

1
5
2 1 1 1 1

*/