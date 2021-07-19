
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Quasi_Binary {

                static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
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
    
    while(i<n1 && j<n2){
        
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
        
    long n=in.nextLong();
        
    List<Long> list=new ArrayList<>();
    
    while(n>=1){
        
        long copy=n,m=0,p=1;
        
        while(copy>=1){
         
            if(copy%10>=1){
            
          m+=p;
         
            }
          
            copy/=10;
          
            p*=10;
            
        }
        
        list.add(m);
        
        n-=m;
        
    }
    
    out.println(list.size());
    out.flush();
    
   long a[]=new long[list.size()];
    
   n=list.size();
   
   int index=0;
   
   for(long i: list){
       
       a[index++]=i;
       
   }
   
   sort(a,0,(int)n-1);
   
   for(long i: a){
       
       out.print(i+" ");
       out.flush();
       
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

9

*/

//32
