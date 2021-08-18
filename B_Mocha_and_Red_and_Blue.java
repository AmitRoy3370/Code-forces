
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Mocha_and_Red_and_Blue {

         static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
    static int testCases,n;
    
    static char a[];
    
    static void solve(){
        
        char ch[]={'B','R'};
        
        if(n==1){
            
            if(a[0]!='?'){
                
                out.println(new String(a));
                out.flush();
                
            }else{
                
                out.println( 'B' );
                out.flush();
                
            }
            
            return;
            
        }
            
     for(int i=0;i<n;i++){
         
         int pos=i;
         
         while( i<n && a[i]=='?' ){
             
             i++;
             
         }
         
         int index=(i<n && a[i]=='R')?1:0;
         
         for(int j=i;j>=0 && j<n && i>=0;j--){
             
             if(a[j]=='?'){
             
             a[j]=ch[++index%2];
             
             }
             
         }
         
     }
     
     //out.println("previous: "+new String(a) );
     //out.flush();
     
     if(a[n-1]=='?'){
         
       int i=n-1,pos=i;
       
       while( i>=0 && a[i]=='?'){
           
           i--;
           
       }
       
    //   out.println("i: "+i);
      // out.flush();
       
       if(i<0){
           
           int index=0;
           
           for(int j=0;j<n;j++){
               
               if(a[j]=='?'){
               
               a[j]=ch[++index%2];
               
                       }
                       
           }
          
       }else{
       
       int index=i>=0 && a[i]=='R'?1:0;
       
       for(int j=i;j<=n-1;j++){
            
           if( a[j]=='?' ){
               
               a[j]=ch[++index%2];
               
           }else{
               
           //    break;
               
           }
           
       }
       
     }
     
     }
       
       out.println( new String(a) );
       out.flush();
       
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=in.next().toCharArray();
            
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
        
        String nextLine() throws IOException{
            
            return in.readLine();
            
        }
        
        char nextChar() throws IOException{
            
            return next().charAt(0);
            
        }
        
        double nextDouble() throws IOException{
            
            return Double.parseDouble(next());
            
        }
        
        float nextFloat() throws IOException{
            
            return Float.parseFloat(next());
            
        }
        
        boolean nextBoolean() throws IOException{
            
            return Boolean.parseBoolean(next());
            
        }
        
        void close() throws IOException{
            
            in.close();
            
        }
        
    }
    
}
/*

5
7
?R???BR
7
???R???
1
?
1
B
10
?R??RB??B?


*/

/*

1
7
?R???BR

*/

/*

1
10
?R??RB??B?

*/

/*

1
7
??B????

*/

/*

1
7
?????B?

*/

/*

1
7
?R???BR

*/