
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Find_The_Array {

      static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( System.out );
    
    static int testCases,n;
    
    static long a[];
    
    static void solve(){
        
        long sum=0;
        
        for(long i: a){
            
            sum+=i;
            
        }
        
        long b[]=new long[n];
        
        long k=sum/n;
        
        for(int i=0;i<n;i++){
            
            b[i]=k;
            
        }
        
        long sum1=0;
        
        long diff[]=new long[n];
        
        for(int i=0;i<n;i++){
            
            sum1+=Math.abs(a[i]-b[i]);
            
            diff[i]=Math.abs(a[i]-b[i]);
            
        }
        
     //   out.println("sum1: "+sum1+" sum: "+sum);
       // out.flush();
        
        if(2*sum1<=sum){
            
            for(long i: b){
                
                out.print(i+" ");
                out.flush();
                
            }
            
            out.println();
            out.flush();
        
            return;
            
        }
        
     
        //b[n-1]=x;
        
        long evenSum=0,oddSum=0;
        
        int index=0;
        
        for(long i: a){
            
            if(index%2==0){
                
                evenSum+=i;
                
            }else{
                
                oddSum+=i;
                
            }
            
            index++;
            
        }
        
        if(evenSum>=oddSum){
            
            for(int i=0;i<n;i++){
                
                if(i%2==0){
                    
                    b[i]=a[i];
                    
                }else{
                    
                    b[i]=1;
                    
                }
                
            }
            
        }else{
            
             for(int i=0;i<n;i++){
                
                if(i%2==1){
                    
                    b[i]=a[i];
                    
                }else{
                    
                    b[i]=1;
                    
                }
                
            }
            
        }
        
       sum1=0;
        
        for(long i: b){
            
            out.print(i+" ");
            out.flush();
            
            //sum1+=i;
            
        }
        
        out.println();
        out.flush();
        
      /*  for(int i=0;i<n;i++){
            
            sum1+=Math.abs(a[i]-b[i]);
            
        }
        
        out.println("sum: "+sum+" sum1: "+sum1);
        out.flush();*/
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new long[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextLong();
                
            }
            
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

4
5
1 2 3 4 5
2
4 6
2
1 1000000000
6
3 4 8 1 2 3


*/

/*

1
2
1 1000000000

*/

/*

1
14
7 1 10 1 8 6 2 1 9 4 3 9 7 8

*/

/*

1
41
9 8 1 3 8 9 8 1 6 1 10 7 10 6 1 9 6 6 2 5 3 8 9 1 10 2 2 6 10 6 2 7 6 5 5 2 4 9 1 4 1

*/