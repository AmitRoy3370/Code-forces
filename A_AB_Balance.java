import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_AB_Balance {
	
	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,testCases;
    
    static char a[];
    
    static void solve(){
        
        int count=0;
        
        for(int i=0;i<n-1;i++){
            
            if( a[i]=='a' && a[i+1]=='b' ){
                
                count++;
                
            }else if( a[i]=='b' && a[i+1]=='a' ) {
            
            count--;
                
            }
            
        }
        
        if(count==0){
            
            out.println(new String(a) );
            out.flush();
            
            return;
            
        }
        
        if(count==1){
            
            for(int i=0;i<n-1;i++){
                
                out.print(a[i]);
                out.flush();
            }
            
            out.println("a");
            out.flush();
            
        }else{
        
        for(int i=0;i<n-1;i++){
            
            out.print(a[i]);
            out.flush();
            
        }
        
        out.println("b");
        out.flush();
        
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            a=in.next().toCharArray();
            
            n=a.length;
            
            solve();
            
        }
        
        in.close();
        
    }
    	static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
	
   static void merge(long a[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        long L[]=new long[n1];
        
        long R[]=new long[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int i=0;i<n2;i++){
            
            R[i]=a[mid+1+i];
            
        }
        
        int i=0,j=0,k1=left;
        
        while(i<n1 && j<n2){
            
            if( L[i]<=R[j] ){
                
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
            
            i++;
            
            k1++;
            
        }
        
        while(j<n2){
            
            a[k1]=R[j];
            
            j++;
            k1++;
            
        }
        
    }
    
    static void sort(long a[],int left,int right){
        
        if(left>=right){
            
            return;
            
        }
        
        int mid=(left+right)/2;
        
        sort(a,left,mid);
        
        sort(a,mid+1,right);
        
        merge(a,left,right,mid);
        
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

4
b
aabbbabaa
abbb
abbaab


*/