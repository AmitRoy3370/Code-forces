import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_ConneR_and_the_A_R_C_Markland_N {

    static Scanner in=new Scanner();
    
    static PrintWriter out=new PrintWriter( new OutputStreamWriter(System.out) );
    
    static int testCases,k;
    
    static long n,s;
    
    static long a[];
    
    static void solve(){
        
        sort(a,0,k-1);
        
        boolean already=false;
        
        for(long i: a){
            
            if(i!=s){
                
                already=true;
                
            }else{
                
                already=false;
                
                break;
                
            }
                
        }
        
        if(already){
            
            out.println(0);
            out.flush();
            
            return;
            
        }
        
        long down=((s==1)?s:s-1),up=s+1;
        
        long downDifference=Long.MAX_VALUE;
        
        boolean find=false;
        
        while(down>=1){
            
            int left=0,right=k-1;
            
            while(right>=left){
                
                int mid=(left+right)/2;
                
                if( a[mid]<down ){
                    
                     //downDifference=Math.min( downDifference,Math.abs( a[left]-down ) );
                    
                    left=mid+1;
                    
                     //downDifference=Math.min( downDifference,Math.abs( a[left]-down ) );
                    
                }else if( a[mid]==down ){
                    
                    find=true;
                    
                    break;
                    
                }else{
                    
                    //downDifference=Math.min( downDifference,Math.abs( a[right]-down ) );
                    
                    right=mid-1;
                    
                    //downDifference=Math.min( downDifference,Math.abs( a[right]-down ) );
                    
                }
                
            }
       
            if(!find){
                
                break;
                
            }
            
      //      out.println("done1: "+down+" find: "+find);
        //    out.flush();
            
            find=false;
            
            down--;
            
        }
        
        find=false;
        
        while( up<=a[k-1] ){
            
             int left=0,right=k-1;
            
            while(right>=left){
                
                int mid=(left+right)/2;
                
                if( a[mid]<up ){
                    
                     //downDifference=Math.min( downDifference,Math.abs( a[left]-down ) );
                    
                    left=mid+1;
                    
                     //downDifference=Math.min( downDifference,Math.abs( a[left]-down ) );
                    
                }else if( a[mid]==up ){
                    
                    find=true;
                    
                    break;
                    
                }else{
                    
                    //downDifference=Math.min( downDifference,Math.abs( a[right]-down ) );
                    
                    right=mid-1;
                    
                    //downDifference=Math.min( downDifference,Math.abs( a[right]-down ) );
                    
                }
                
            }
       
            if(!find){
                
                break;
                
            }
            
            find=false;
            
            up++;
            
       //     out.println("up1: "+up+" find: "+find);
         //   out.flush();
        }
       
  //      out.println("up: "+up+" down: "+down);
    //    out.flush();
        
        if( down==0 ){
            
            down=up;
            
        }
        
        if(up==0){
            
            up=down;
            
        }
        
        if(up>n){
            
            up=down;
            
        }
        
        out.println( Math.min( Math.abs(s-up),Math.abs(s-down) ) );
        out.flush();
        
    }
    
    public static void main(String[] amit) throws IOException {
        
        testCases=in.nextInt();
        
        for(int t=0;t<testCases;t++){
            
            n=in.nextLong();
            
            s=in.nextLong();
            
            k=in.nextInt();
            
            a=new long[k];
            
            for(int i=0;i<k;i++){
                
                a[i]=in.nextLong();
                
            }
            
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

5
5 2 3
1 2 3
4 3 3
4 1 2
10 2 6
1 2 3 4 5 7
2 1 1
2
100 76 8
76 75 36 67 41 74 10 77


*/

/*

1
10 2 6
1 2 3 4 5 7

*/

/*

1
3 3 2
3 2

*/