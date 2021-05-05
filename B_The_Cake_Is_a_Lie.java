
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_The_Cake_Is_a_Lie {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int testCases,n,m,k;
   
    static boolean a[][];
    
   static boolean solve(int i,int j,int sum){
        
//        System.out.println("i: "+i+" j: "+j+" sum: "+sum);
        
        if(sum==k && i==n && j==m ){
            
            return true;
            
        }/*else if(sum!=k && i==n && j==m ){
            
            return false;
            
        }*/
        
        if(i==n){
            
            if(j<m){
                
                if(!a[i][j+1]){
                
                a[i][j]=true;
                
                a[i][j+1]=true;
                
                return solve(i,j+1,sum+i);
                
                }
                
            }
            
        } if(j==m){
            
            if( i<n ){
                
                if(!a[i+1][j]){
                
                a[i][j]=true;
                
                a[i+1][j]=true;
                
                return solve(i+1,j,sum+j);
                
                }
                
            }
            
        } if(i==n && j==m){
            
            //if(!a[i][j]){
            
            return sum==k;
            
            //}
            
        }
        
         if(i<n && j<m ){
            
            if( !a[i+1][j] ){
                
                a[i][j]=true;
                
                a[i+1][j]=true;
                
                return solve( i+1,j,sum+j );
                
            }
            
            if( !a[i][j+1] ){
                
                a[i][j]=true;
                
                a[i][j+1]=true;
                
            //    System.out.println("am here");
                
                return solve(i,j+1,sum+i);
                
            }
            
        }
        
        if(i<n){
            
            if(!a[i+1][j]){
            
            a[i][j]=true;
            
            a[i+1][j]=true;
            
            return solve(i+1,j,sum+j);
            
            }
            
        }
        
        if(j<m){
            
            if( !a[i][j+1] ){
            
            a[i][j]=true;
            
            a[i][j+1]=true;
            
            return solve(i,j+1,sum+i);
            
            }
        
        }
        
        return false;
        
    }
    
    public static void main(String[] amit) throws IOException {
        
   testCases=in.nextInt();
        
   for(int t=0;t<testCases;t++){
       
       n=in.nextInt();
       m=in.nextInt();
       k=in.nextInt();
       
       a=new boolean[n+1][m+1];
       
       if( n==1 && m==1 && k==1 ){
           
           out.println("NO");
           out.flush();
           
       }else if(n==1 && m==1 && k==0) {
           
           out.println("YES");
           out.flush();
           
       }else{
       
      // sum=0;
       
       if( solve(1,1,0) ){
           
           out.println("YES");
           out.flush();
           
       }else{
           
           out.println("NO");
           out.flush();
           
       }
       
      /* for(boolean i[]: a){
           
           for(boolean j: i){
               
               out.print(j+" ");
               out.flush();
               
           }
           
           out.println();
           out.flush();
           
       }*/
       
       }
       
   }
   
    }
    
      static class Scanner {
        
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
            
            return Integer.parseInt( next() );
            
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

6
1 1 0
2 2 2
2 2 3
2 2 4
1 4 3
100 100 10000


*/

/*

1
2 2 3

*/