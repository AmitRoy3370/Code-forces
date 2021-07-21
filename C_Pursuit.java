
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class C_Pursuit {

          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases,n;
    
    static Integer a[];
    static Integer b[];
    
    static long sumA[];
    
    static long sumB[];
    
    static boolean check(int x){
        
        int k=(n+x)-(n+x)/4;
        
        long a1=sumA[ Math.max(0,k-x ) ]+100*Math.min(k,x);
        
        long a2=sumB[ Math.min(k,n) ];
        
        return a1>=a2;
    
    }
    
    static void solve(){
        
        Arrays.sort(a,Collections.reverseOrder() );
        
        Arrays.sort(b,Collections.reverseOrder() );
         
        /*for(int i=1;i<=n/2;i++){
         
            int temp=a[i];
            a[i]=a[n-i];
            a[n-i]=temp;
            
        }
        
        //int temp=a[0];
        //a[0]=a[n];
        //a[n]=temp;
        
         for(int i=1;i<=n/2;i++){
         
          int   temp=b[i];
            b[i]=b[n-i];
            b[n-i]=temp;
            
        }*/
        
  //       temp=b[0];
    //     b[0]=b[n];
      //   b[n]=temp;
         
      //   out.println(Arrays.toString(a) );
        // out.flush();
         
         //out.println(Arrays.toString(b));
         //out.flush();
         
         int left=1,right=n;
         
        /* while(right>left){
             
             int temp=a[left];
             a[left]=a[right];
             a[right]=temp;
             
             left++;
             right--;
             
         }
         
         left=1;
         right=n;
         
          while(right>left){
             
             int temp=b[left];
             b[left]=b[right];
             b[right]=temp;
             
             left++;
             right--;
             
         }*/
         
         sumA=new long[1+n];
        
         sumB=new long[n+1];
        
      //  sumA[0]=a[0];
        //sumB[0]=b[0];
        
        for(int i=0;i<n;i++){
            
            sumA[i+1]=sumA[i]+a[i];
            
        }
        
        for(int i=0;i<n;i++){
            
            sumB[i+1]=sumB[i]+b[i];
            
        }
        
        int l=0,r=100000;
        
      /*  while(r>=l){
            
            int mid=(l+r)/2;
            
            if( check( mid ) ){
                
                r=mid-1;
                
            }else{
                
                l=mid+1;
                
            }
            
        }*/
        
      while(r>l){
          
          int k = (l + r) / 2;
					int m = (n + k) - (n + k) / 4;
					long ca = 0, cb = 0;
					if (m <= k) {
						ca = 100 * m;
					} else {
						 ca = 100 * k + sumA[m - k];
					}
					cb = sumB[Math.min(n,  m)];
					if (ca >= cb) {
						r = k;
					} else {
						l = k + 1;
					}
          
      }
      
        out.println((l) );
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            a=new Integer[n];
            
            b=new Integer[n];
            
            for(int i=0;i<n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            for(int i=0;i<n;i++){
                
                b[i]=in.nextInt();
                
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
        
    }
    
}
/*

5
1
100
0
1
0
100
4
20 30 40 50
100 100 100 100
4
10 20 30 40
100 100 100 100
7
7 59 62 52 27 31 55
33 35 50 98 83 80 64


*/

/*

1
4
20 30 40 50
100 100 100 100

*/

/*


*/

/*

1
7
7 59 62 52 27 31 55
33 35 50 98 83 80 64

*/

/*

1
10
70 24 14 58 89 80 5 57 92 24
34 33 11 14 62 96 69 43 0 24

*/

/*

1
10
80 83 32 100 25 40 49 63 55 22
53 12 22 59 97 74 85 2 63 25

*/

/*

1
10
59 63 51 44 25 35 20 99 72 39
87 67 34 12 79 72 23 11 96 25

*/