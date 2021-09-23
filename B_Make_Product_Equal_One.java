import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class B_Make_Product_Equal_One {

        static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

  static int n;  
  
  static long a[];
  
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        in.close();
        
        long dp[][]=new long[n][2];
        
        int have[][]=new int[n][2];
        
        for(int i=0;i<n;i++){
            
            dp[i][0]=Math.abs( 1-a[i] );
            
            dp[i][1]=Math.abs( -1-a[i] );
            
            have[i][0]=1;
            have[i][1]=-1;
            
        
        }
       
        long ans=0,mul=1,zeros=0;
        
        for(int i=0;i<n;i++){
            
            if(a[i]==0){
                
                zeros++;
                
            }
            
            if( dp[i][0]>dp[i][1] ){
                
                mul*=have[i][1];
                
                ans+=dp[i][1];
            
                //out.print(-1+" ");
                //out.flush();
                
            }else{
                
                mul*=have[i][0];
                
                ans+=dp[i][0];
                
             //   out.print(1+" ");
               // out.flush();
                
            }
            
         //   ans+=Math.min( dp[i][0],dp[i][1] );
            
        }
        
        if( mul<=0 && zeros==0 ){
            
            ans+=2;
            
        }
        
        out.println("\n"+ans);
        out.flush();
        
      /*  long ans=0,ans1=0;
        
        int mul=1,index=0;
       
        int b[]=new int[n];
                
        int c[]=new int[n];
        
        for(long i: a){
            
            if(i==0){
            
                ans++;
                
                b[index++]=1;
                
            }else if(i==-1){
            
                ans+=2;
            
                b[index++]=1;
                
            }else if(Math.abs(1-i)>Math.abs( -1-i )){
                
                mul*=-1;
                
                ans+=Math.abs( -1-i );
                
                //if(){
                
                b[index++]=-1;
                
                //}
                
            }else{
                
                mul*=1;
                
                ans+=Math.abs( 1-i );
                
                b[index++]=1;
                
            }
            
           // ans+=Math.min( Math.abs(1-i),Math.abs( -1-i ) );
            
        }
        
        index=0;
        
        for(long i: a){
            
            if(i==0){
            
                ans1++;
                
                c[index++]=-1;
                
            }else if(i==-1){
            
                c[index++]=-1;
            
            }else if(Math.abs(1-i)>=Math.abs( -1-i )){
                
                mul*=-1;
                
                ans1+=Math.abs( -1-i );
                
                //if(){
                
                c[index++]=-1;
                
                //}
                
            }else{
                
                mul*=1;
                
                ans1+=Math.abs( 1-i );
                
                c[index++]=1;
                
            }
            
           // ans+=Math.min( Math.abs(1-i),Math.abs( -1-i ) );
            
        }
        
        int y=1;
        
        for(int i: b){
            
            out.print(i+" ");
            out.flush();
            
            y*=i;
            
        }
        
        out.println();
        out.flush();
        
        int g=1;
        
          for(int i: c){
            
              g*=i;
              
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();
        
        if( y<=0 ){
            
            ans+=2;
            
        }
        
        if(g<=0){
            
            ans1+=2;
            
        }
        
        out.println(mul);
        out.flush();
        
        /*if(mul<0){
            
         out.println( Math.min(ans,ans1) );
         out.flush();
         
        }else{
        
        out.println( Math.min(ans,ans1) );
        out.flush();
        
        //}
        
        */
        
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

2
-1 1


*/

/*

4
0 0 0 0


*/

/*

5
-5 -3 5 3 0


*/

/*

3
-525187879 0 425880698

*/

/*

20
459151683 279504854 500320491 715966379 484152147 179708763 -312314917 -468953627 -816236061 -171030930 902332207 -4832598 -28162448 239469235 -142309467 -836437664 -658075191 -748965205 483598661 348267125

*/


/*

3
-1 0 0

*/