
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E_Office_Keys {

      static Scanner in=new Scanner();
    
  static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
   
  static int n,k;
    
  static long p;
  
  static long a[],b[];
  
  static long dp[][];
  
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
      
      int i=0,j=0,kth=left;
      
      while(i<n1 && j<n2){
          
          if(L[i]<=R[j]){
              
              a[kth]=L[i];
              
              i++;
              
          }else{
              
              a[kth]=R[j];
              
              j++;
              
          }
          
          kth++;
          
      }
      
      while(i<n1){
          
          a[kth]=L[i];
          
          i++;
          kth++;
          
      }
      
      while(j<n2){
          
          a[kth]=R[j];
          
          j++;
          kth++;
          
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
        
        k=in.nextInt();
        
        p=in.nextLong();
        
        a=new long[n];
        
        b=new long[k];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        for(int i=0;i<k;i++){
            
            b[i]=in.nextLong();
            
        }
        
        in.close();
        
        sort(a,0,n-1);
        
        sort(b,0,k-1);
        
       /* for(long i: b){
            
            out.print(i+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        long lowestCost=Long.MAX_VALUE;
        
        for(int i=0;i<k-n+1;i++){
            
            long cost=0;
            
            for(int j=0;j<n;j++){
                
                cost=Math.max(cost,Math.abs( a[j]-b[i+j] )+Math.abs( b[i+j]-p ) );
                
            }
            
            lowestCost=Math.min(lowestCost,cost);
            
        }
        
        out.println(lowestCost);
        out.flush();
        
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

2 4 50
20 100
60 10 40 80


*/

/*

1 2 10
11
15 7


*/