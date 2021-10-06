import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B1_K_for_the_Price_of_One_Easy_Version {
    
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int testCases,n,k;
    
    static long cost;
    
    static int a[];
    
    static void solve(){
        
        sort(a,0,n);
       
        int dp[][]=new int[n+1][3];
       
        dp[1][1]=a[1];
        
        for(int i=1;i<=n;i++){
            
            dp[i][1]=Math.min( dp[i-1][1]+a[i],dp[i-1][0]+a[i] );
            
            dp[i][0]=dp[i-1][1];
            
        }
    
        /*for(int i=1;i<=n;i++){
            
            out.println( dp[i][0]+" "+dp[i][1] );
            out.flush();
            
        }*/
        
        int i=1;
    
        for( i=1;i<=n;i++){
            
            if(dp[i][1]>cost){
                
                break;
                
            }
            
        }
        
        out.println(i-1);
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextInt();
            
            cost=in.nextLong();
            
            k=in.nextInt();
            
            a=new int[n+1];
            
            for(int i=1;i<=n;i++){
                
                a[i]=in.nextInt();
                
            }
            
            solve();
            
        }
        
        in.close();
        
    }
    
    
    static void merge(int a[],int left,int right,int mid){
        
        int n1=(mid-left+1),n2=right-mid;
        
        int L[]=new int[n1];
        
        int R[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=a[mid+1+i];
            
        }
        
        int i=0,j=0,k1=left;
        
        while(i<n1 && j<n2){
            
            if(L[i]<=R[j]){
                
                a[k1]=L[i];
                
                i++;
                
            }else{
                
                a[k1]=R[j];
                
                j++;
                
            }
            
            k1++;
            
        }
        
        while(i<n1){
            
            a[k1]=L[i];
            
            k1++;
    
    i++;        
        }
        
        while(j<n2){
            
            R[j]=a[j];
            
            j++;
            k1++;
            
        }
        
    }
    
    static void sort(int a[],int left,int right){
        
        if(left>=right){
        
        return;
        
        }
        
        int mid=(left+right)/2;
        
        sort(a,left,mid);
        
        sort(a,mid+1,right);
        
        merge( a,left,right,mid );
        
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

6
5 6 2
2 4 3 5 7
5 11 2
2 4 3 5 7
2 10000 2
10000 10000
2 9999 2
10000 10000
5 13 2
8 2 8 2 5
3 18 2
1 2 3


*/

/*

1
5 6 2
2 4 3 5 7

*/

/*

1
2 9999 2
10000 10000

*/

/*

1
2 10000 2
10000 10000

*/

/*

1
5 13 2
8 2 8 2 5

*/

/*

1
5 6 2
2 4 3 5 7

*/