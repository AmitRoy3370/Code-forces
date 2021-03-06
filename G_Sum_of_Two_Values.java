
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G_Sum_of_Two_Values {

              static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter(System.out);
    
    static int n;
    
    static class Pair implements Comparable<Pair> {
        
        long element;
        int index;

        public Pair(long element, int index) {
            this.element = element;
            this.index = index;
        }

        @Override
        public int compareTo(Pair t) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(this.element>t.element){
            
            return 1;
            
        }else if(this.element<t.element){
            
            return -1;
            
        }
        
        return 0;
        
        }
        
    }
    
    static Pair a[];
    
    static long x;
    
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
        
        x=in.nextLong();
        
        a=new Pair[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=new Pair(in.nextLong(),i+1);
            
        }
        
        Arrays.sort(a);
        
        int left=0,right=n-1;
        
        while(right>left){
            
            if( left!=right && a[left].element+a[right].element==x){
                
                out.println(a[left].index+" "+a[right].index );
                out.flush();
                
                return;
                
            }
            
            if( a[left].element+a[right].element<x ){
                
                left++;
                
            }else{
                
                right--;
                
            }
            
           // left++;
            //right--;
            
        }
        
        out.println(-1);
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

4 8
2 7 5 1


*/