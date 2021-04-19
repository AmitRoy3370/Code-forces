
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Remove_Smallest {

    static Scanner in=new Scanner();
    static PrintWriter out=new PrintWriter(System.out);
    
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
        
        int i=0,j=0,k=left;
        
        while( i<n1 && j<n2 ){
            
            if(L[i]<=R[j]){
                
                a[k]=L[i];
                
                i++;
                
            }else{
                
                a[k]=R[j];
                j++;
                
            }
            
            k++;
            
        }
        
        while( i<n1 ){
            
            a[k]=L[i];
            
            i++;
            k++;
            
        }
        
        while( j<n2 ){
            
            a[k]=R[j];
            
            j++;
            
            k++;
            
        }
        
    }
    
    static void mergeSort(long a[],int left,int right){
        
        if( left>=right ){
            
            return;
            
        }
        
        int mid=(left+right)/2;
        
        mergeSort(a,left,mid);
        mergeSort(a,mid+1,right);
        
        merge(a,left,right,mid);
        
    }
    
    static int testCases,n;
    
    static long a[];
    
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
    
    static void solve(){
        
        mergeSort(a,0,a.length-1);
        
        for(int i=1;i<n;i++){
            
            if( !(Math.abs(a[i]-a[i-1])<=1) ){
                
                out.println("NO");
                
                out.flush();
                
                return;
                
            }
            
        }
        
        out.println("YES");
        
        out.flush();
        
    }
    
      static class Scanner{
        
        BufferedReader in;
        StringTokenizer st;

        public Scanner() {
        
            in=new BufferedReader( new InputStreamReader( System.in ) );
            
        }
        
        String next() throws IOException{
            
            while( st==null || !st.hasMoreElements() ){
                
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
            
            return Long.parseLong( next() );
            
        }

double nextDouble() throws IOException{
    
    return Double.parseDouble( next() );
    
}
        
    }
    
}
/*

5
3
1 2 2
4
5 5 5 5
3
1 2 4
4
1 3 4 4
1
100

*/