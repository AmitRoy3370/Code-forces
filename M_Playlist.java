
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class M_Playlist {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int n;
    
    static long a[];
    
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
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
       Map<Long,Long> map=new HashMap<>();
        
       for(int i=0;i<n;i++){
           
           map.put(a[i], (long)0);
           
       }
       
       long ans=0;
       
       for(int i=0,j=0;i<n;i++){
           
           j=(int) Math.max( map.get(a[i]),j );
        
           ans=Math.max(ans, i-j+1);
           
           map.put(a[i], (long)i+1);
           
       }
       
       out.println(ans);
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

8
1 2 1 3 2 7 4 2


*/