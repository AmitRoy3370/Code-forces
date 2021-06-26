
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Pretty_Permutations {

       static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,n;

static void solve(){
    
    int a[]=new int[n];
    
    for(int i=0;i<n;i++){
        
        a[i]=i+1;
        
    }
    
    if(n%2==0){
    
   for(int i=1;i<n;i+=2){
       
       int temp=a[i];
       a[i]=a[i-1];
       a[i-1]=temp;
       
   }
    
    }else{
        
        for(int i=0;i<n-1;i+=2){
            
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            
        }
        
        int temp=a[n-1];
        a[n-1]=a[n-2];
        a[n-2]=temp;
        
       // a[n-3]=n;
        //a[n-2]=n-2;
        //a[n-1]=n-1;
    }
   
   for(int i: a){
       
       out.print(i+" ");
       out.flush();
       
   }
   
   out.println();
   out.flush();
   
}    

    public static void main(String[] amit) throws IOException {
        
    testCases=in.nextInt();
        
    for(int t=0;t<testCases;t++){
        
        n=in.nextInt();
        
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
            
            while( st==null || !st.hasMoreElements() ){
                
                st=new StringTokenizer(in.readLine());
                
            }
            
            return st.nextToken();
            
        }
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        int nextInt() throws IOException{
            
            return Integer.parseInt( next() );
            
        }
        
        long nextLong() throws IOException{
            
            return Long.parseLong( next() );
            
        }
        
    }
    
}
/*

2
2
3


*/