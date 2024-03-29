import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B_Worms {

	 static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );

    static int n,m;
    
    static long a[],q[];
    
    static class element{
        
        long first,second;

        public element(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return first + " " + second ;
        }
        
    }
    
    static void solve(){
        
        element e[]=new element[n];
        
        e[0]=new element(1,a[0]);
        
        long sum=a[0];
        
        for(int i=1;i<n;i++){
            
            long tempSum=sum;
            
            sum+=a[i];
            
            e[i]=new element( tempSum+1,sum );
            
        }
         
      /*  for(element i:e){
            
            out.println(i.toString()+" ");
            out.flush();
            
        }
        
        out.println();
        out.flush();*/
        
        sort(a,0,n-1);
        
        for(int j=0;j<m;j++){
            
            long searching=q[j];
        
            if( e[n-1].second<searching ){
                
                out.println((n+1));
                out.flush();
                
                continue;
                
            }
            
         int left=0,right=n-1;
         
         if( e[left].first<=searching && e[left].second>=searching ){
             
             out.println( (left+1) );
             out.flush();
             
             continue;
             
         }
         
           if( e[right].first<=searching && e[right].second>=searching ){
             
             out.println( (right+1) );
             out.flush();
             
             continue;
             
         }
         
         while( right>=left ){
             
             int mid=(left+right)/2;
             
                  if( e[left].first<=searching && e[left].second>=searching ){
             
             out.println( (left+1) );
             out.flush();
             
             break;
             
         }
         
           if( e[right].first<=searching && e[right].second>=searching ){
             
             out.println( (right+1) );
             out.flush();
             
             break;
             
         }
             
             if( e[mid].second<searching ){
                 
               /*  if( e[mid].first<=searching && e[mid].second>=searching ){
                     
                     out.println( (mid+1) );
                     out.flush();
                     
                     break;
                     
                 }*/
                 
                 left=mid+1;
                 
             }else if(e[mid].first<=searching && e[mid].second>=searching  ){
                 
                 out.println((mid+1) );
                 out.flush();
                 
                 break;
                 
             }else{
                 
                 /*if( e[mid].first<=searching && e[mid].second>=searching ){
                     
                     out.println( (mid+1) );
                     out.flush();
                     
                     break;
                     
                 }*/
                 
                 right=mid-1;
                 
             }
             
         }
            
        }
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        n=in.nextInt();
        
        a=new long[n];
        
        for(int i=0;i<n;i++){
            
            a[i]=in.nextLong();
            
        }
        
        m=in.nextInt();
        
        q=new long[m];
        
        for(int i=0;i<m;i++){
            
            q[i]=in.nextLong();
            
        }
        
        in.close();
        
        solve();
        
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
        
        int i=0,j=0,k=left;
        
        while(i<n1 && j<n2){
            
            if( L[i]<=R[j] ){
                
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

5
2 7 3 4 9
3
1 25 11


*/

/*

5
2 4 6 9 12
5
16 10 20 4 1

*/

/*

8
9 4 2 4 1 2 3 4
3
17 24 15

*/