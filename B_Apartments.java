
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Apartments {

          static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n,m;
    static long k;
    
    static long a[],b[];
   
    static void merge(long a[],int left,int right,int mid){
        
        int n1=mid-left+1,n2=right-mid;
        
        long L[]=new long[n1];
        long R[]=new long[n2];
        
        for(int i=0;i<n1;i++){
            
            L[i]=a[left+i];
            
        }
        
        for(int j=0;j<n2;j++){
            
            R[j]=a[mid+1+j];
            
        }
        
        int i=0,j=0,k=left;
        
        while(i<n1 && j<n2 ){
            
            if(L[i]<=R[j]){
                
                a[k]=L[i];
                
                i++;
                
            }else{
                
                a[k]=R[j];
                
                j++;
                
            }
            
            k++;
            
        }
        
        while(i<n1){
            
            a[k]=L[i];
            
            i++;
            k++;
            
        }
        
        
        while(j<n2){
            
            a[k]=R[j];
            
            j++;
            k++;
            
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
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        m=in.nextInt();
        k=in.nextLong();
        
        a=new long[n];
        b=new long[m];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        for(int i=0;i<m;i++){
            
            b[i]=in.nextLong();
            
        }
        
   sort(a,0,n-1);
        
   sort(b,0,m-1);
   
   int count=0,i=0,j=0;
   
  while(i<n && j<m){
      
      if( Math.abs(a[i]-b[j])<=k ){
          
          count++;
          
          i++;
          j++;
          
      }else if( a[i]-b[j]>k ){
          
          j++;
          
      }else{
          
          i++;
          
      }
      
  }
   
   out.println(count);
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

4 3 5
60 45 80 60
30 60 75


*/

/*

4 4 2
2 4 6 8 
5 9 8 10

*/

/*

2 4 2
8 6
5 9 8 10

*/